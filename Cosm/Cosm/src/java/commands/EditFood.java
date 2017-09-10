/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import beans.Menu;
import connection.DBCon;
import dao.AddDB;
import dao.EditDB;
import dao.InBasketDB;
import dao.OrderDB;
import dao.ReadData;
import java.io.IOException;
import commands.*;
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
public class EditFood implements Command {
    EditDB odb = new EditDB();
    DBCon dbCon = new DBCon();  
    ReadData basketCommand = new ReadData();

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("*****заказ///");
        String food = request.getParameter("food");
        String dose = request.getParameter("dose");
        String cost = request.getParameter("cost");
        String image = request.getParameter("image");
        String idFood = request.getParameter("idFood");
 //request.getSession().setAttribute("idFood", idFood);
        request.setAttribute("idFood",idFood);

       System.out.println(food + " " + dose + " " + cost+ " " + image);
        try {  
            request.setAttribute("editFood",idFood);
   // request.setAttribute("deletefood",viewMenu);
            odb.editProduct(food, dose, cost, image,idFood);  request.setAttribute("idFood",idFood);
                   System.out.println(food + " " + dose + " " + cost+ " " + image+ ""+idFood);

        } catch (SQLException ex) {
            Logger.getLogger(EditFood.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EditFood.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.getServletContext().getRequestDispatcher("/ok3.jsp").forward(request, response);
    } 
}