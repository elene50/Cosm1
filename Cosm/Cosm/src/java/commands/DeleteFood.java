/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import dao.*;
import beans.Basket;
import beans.CommentsBean;
import dao.ReadData;
import beans.Menu;
import servlet.Constants;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DeleteFood implements Command {

    DeleteDB delete = new DeleteDB();
    
    ReadData deleteFood = new ReadData();

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
             /* idFood = (Integer.valueOf (request.getParameter("idFood")));
         
        try {
            ArrayList<beans.Menu> viewMenu = delete.delFood(idFood);
        } catch (SQLException ex) {
            Logger.getLogger(DeleteFood.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DeleteFood.class.getName()).log(Level.SEVERE, null, ex);
        }

  request.setAttribute("deletefood",viewMenu);
               request.getServletContext().getRequestDispatcher("/menuAdmin.jsp").forward(request, response);

    }*/    Integer idFood = (Integer.valueOf (request.getParameter("idFood")));
     System.out.println("----------------------------------------"); 

        System.out.println(idFood); 
               try {
               
                     ArrayList<Menu> view= delete.view(idFood);
                            
        request.setAttribute("menu",view);
               request.getServletContext().getRequestDispatcher("/menuAdmin.jsp").forward(request, response);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DeleteCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            request.getServletContext().getRequestDispatcher("/menuAdmin.jsp").forward(request, response);
        }
    }
}