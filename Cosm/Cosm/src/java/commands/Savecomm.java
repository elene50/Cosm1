/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import dao.ReadData;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Elena
 */
public class Savecomm implements Command {
     ReadData rd = new ReadData();
      @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session= request.getSession();
        
        System.out.println("go to allcomm");
        String text = request.getParameter("comm");
        Integer id=Integer.valueOf(session.getAttribute("ID").toString());
    try {
                   rd.comm(text, id);
            
           
           // request.setAttribute("sort", listnew);
            request.getServletContext().getRequestDispatcher("/comm2.jsp").forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(SortCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SortCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}