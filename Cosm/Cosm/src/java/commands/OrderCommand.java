/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import dao.*;
import beans.Menu;
import beans.Users;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import connection.DBCon;
import servlet.Constants;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class OrderCommand implements Command{

    InBasketDB inBask = new InBasketDB();
    ReadData basketCommand = new ReadData();
    OrderDB odb = new OrderDB();
    DBCon dbCon = new DBCon();  
    
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            System.out.println("*****заказ11111111111111111111111111");
            String data = request.getParameter("datamine");
            String time = request.getParameter("time");
            String name = request.getParameter("name");            
            System.out.println(data + " " + time + " " + name);
            
            Integer id_user = (Integer) request.getSession().getAttribute("ID");
            
            ArrayList<Menu> listnew = new ArrayList<Menu>();
            listnew = odb.idInBasket(id_user);
            odb.makeOrder(data, time, name, listnew, id_user);
            odb.deleteBasket(id_user);
            request.getServletContext().getRequestDispatcher("/ok.jsp").forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(OrderCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OrderCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
}