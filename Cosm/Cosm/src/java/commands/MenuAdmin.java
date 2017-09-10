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


public class MenuAdmin implements Command{

    ReadData rd = new ReadData();
   // private Object idFood;
    
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("go to menucommand");
        try {
            ArrayList<Menu> listnew = new ArrayList<Menu>();
            listnew = rd.view();
            
            for (int i = 0; i < listnew.size(); i++) {
               System.out.println(listnew.get(i));
            }
            request.setAttribute("menu", listnew);
           //  request.setAttribute("idFood",idFood);
            request.getServletContext().getRequestDispatcher("/menuAdmin.jsp").forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(MenuCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
}
