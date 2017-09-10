/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;


import beans.CommentsBean;
import dao.ReadData;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.text.Document;

/**
 *
 * @author Elena
 */
public class ShowcommAdmin implements Command{
 ReadData rd = new ReadData();
    public ShowcommAdmin(){}
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session= request.getSession();
        
        System.out.println("go to allcomm");
        String text = request.getParameter("comm");
        Integer id=Integer.valueOf(session.getAttribute("ID").toString());
     try {
         
         List<CommentsBean> allcomments = rd.allcomm();
          request.setAttribute("allcomm", allcomments);
          
     } catch (SQLException ex) {
         Logger.getLogger(Comm.class.getName()).log(Level.SEVERE, null, ex);
     } catch (ClassNotFoundException ex) {
         Logger.getLogger(Comm.class.getName()).log(Level.SEVERE, null, ex);
     }
    request.getServletContext().getRequestDispatcher("/commAdmin.jsp").forward(request, response);
       
        
    } 
}
