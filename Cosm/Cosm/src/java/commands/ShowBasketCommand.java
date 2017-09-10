/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import dao.ReadData;
import beans.*;
import dao.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowBasketCommand implements Command {

    ReadData rd = new ReadData();
    ShowDB show = new ShowDB();
    CostDB cost = new CostDB();

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("go to showbasket");
        try {
            ArrayList<Menu> listnew = new ArrayList<Menu>();
            ArrayList<Menu> costlist = new ArrayList<Menu>();
            Integer id_user = (Integer) request.getSession().getAttribute("ID");
            listnew = rd.viewShowBasket(id_user);

            if (!listnew.isEmpty()) {
                for (int i = 0; i < listnew.size(); i++) {
                    System.out.println(listnew.get(i));
                }

                costlist = cost.costFood(id_user);
                int sum = 0;
                for (int i = 0; i < costlist.size(); i++) {
                    System.out.println(costlist.get(i));
                    sum += costlist.get(i).getIdFood();
                }
                System.out.println(sum);
                String summ = String.valueOf(sum);
                request.getSession().setAttribute("SUM", summ);

            } else {
                show.errorPage("Basket is empty!", "Servlet?command=menu", response);
            }
            request.setAttribute("basket", listnew);
            request.getServletContext().getRequestDispatcher("/basket.jsp").forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ShowBasketCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ShowBasketCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
