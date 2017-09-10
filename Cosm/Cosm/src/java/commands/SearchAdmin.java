/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import beans.Menu;
import connection.DBCon;
import dao.InBasketDB;
import dao.*;
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
public class SearchAdmin implements Command {
    ReadData rd = new ReadData();
    DBCon dbCon = new DBCon();  
    
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            System.out.println("`````заказ`````");
            String name = request.getParameter("name");         
            System.out.println(name);
            
            ArrayList<Menu> listnew = new ArrayList<Menu>();
            listnew = rd.search(name);
            
            for (int i = 0; i < listnew.size(); i++) {
               System.out.println(listnew.get(i));
               System.out.println("1");
            }
            request.setAttribute("search", listnew);
            
            request.getServletContext().getRequestDispatcher("/searchAdmin.jsp").forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(SearchAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SearchAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    } }