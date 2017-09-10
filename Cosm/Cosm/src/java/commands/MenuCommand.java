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


public class MenuCommand implements Command{

    ReadData rd = new ReadData();
    
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("go to menucommand");
        try {
            ArrayList<Menu> listnew = new ArrayList<Menu>();
            listnew = rd.viewMenu();
            
            for (int i = 0; i < listnew.size(); i++) {
               System.out.println(listnew.get(i));
            }
            request.setAttribute("menu", listnew);
            request.getServletContext().getRequestDispatcher("/menu.jsp").forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(MenuCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
}
