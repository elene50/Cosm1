/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import dao.*;
import beans.Basket;
import servlet.Constants;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DeleteCommand implements Command {

    DeleteDB delete = new DeleteDB();
    ReadData basketCommand = new ReadData();

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            System.out.println("delete");
            // id_user = (Integer) request.getSession().getAttribute("ID");
            String idFood = request.getParameter("idFood");  
           // System.out.println(id_user + " " + idFood);
            delete.delRecord( Integer.parseInt(idFood));
            ArrayList<Basket> listnew = new ArrayList<Basket>();
            System.out.println("fff");
            listnew = basketCommand.viewBasket();
            for (int i = 0; i < listnew.size(); i++) {
                System.out.println(listnew.get(i));
            }
            request.setAttribute("delete", listnew);
            request.getServletContext().getRequestDispatcher("/Servlet?command=basket").forward(request, response);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DeleteCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            request.getServletContext().getRequestDispatcher("/basket.jsp").forward(request, response);
        }
    }
    
}