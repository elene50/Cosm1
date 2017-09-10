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


public class InBasketCommand implements Command{

    InBasketDB inBask = new InBasketDB();
    ReadData basketCommand = new ReadData();
    ShowDB show = new ShowDB();
    
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            System.out.println("in basket");
            String idFood = request.getParameter("idFood");
            Integer id_user = (Integer) request.getSession().getAttribute("ID");
            int id_food = Integer.parseInt(idFood);
            inBask.addRecord(id_user, id_food);
            
            ArrayList<Basket> listnew = new ArrayList<Basket>();
            System.out.println("fff");
            listnew = basketCommand.viewBasket();
            for (int i = 0; i < listnew.size(); i++) {
                System.out.println(listnew.get(i));
            }
            request.setAttribute("inbasket", listnew);
            request.getServletContext().getRequestDispatcher("/Servlet?command=menu").forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(InBasketCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InBasketCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
}
