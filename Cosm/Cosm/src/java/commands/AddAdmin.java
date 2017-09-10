/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import beans.Menu;
import connection.DBCon;
import dao.AddDB;
import dao.InBasketDB;
import dao.OrderDB;
import dao.ReadData;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Elena
 */
public class AddAdmin implements Command {
    InBasketDB inBask = new InBasketDB();
    ReadData basketCommand = new ReadData();
    AddDB odb = new AddDB();
    DBCon dbCon = new DBCon();  
    
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("*****заказ--------------------------------------");
        String food = request.getParameter("food");
        String dose = request.getParameter("dose");
        String cost = request.getParameter("cost");
        String image = request.getParameter("image");
        System.out.println(food + " " + dose + " " + cost+ " " + image);
        try {
    
            odb.addProduct(food, dose, cost, image);
        } catch (SQLException ex) {
            Logger.getLogger(AddAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.getServletContext().getRequestDispatcher("/ok2.jsp").forward(request, response);
    } 
}