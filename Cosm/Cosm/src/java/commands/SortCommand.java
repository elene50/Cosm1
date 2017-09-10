/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import dao.ReadData;
import beans.Menu;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SortCommand implements Command{

    ReadData rd = new ReadData();
    
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("go to sortmenu");
        try {
            ArrayList<Menu> listnew = new ArrayList<Menu>();
            listnew = rd.viewSortMenu();
            
            for (int i = 0; i < listnew.size(); i++) {
               System.out.println(listnew.get(i));
            }
            request.setAttribute("sort", listnew);
            request.getServletContext().getRequestDispatcher("/sort.jsp").forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(SortCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SortCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
}
