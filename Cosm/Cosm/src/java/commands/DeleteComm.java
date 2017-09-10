/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import dao.*;
import beans.Basket;
import beans.CommentsBean;
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


public class DeleteComm implements Command {

    DeleteDB delete = new DeleteDB();
    
    ReadData deleteCommand = new ReadData();

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            System.out.println("delete");
            Integer id_comm = (Integer.valueOf (request.getParameter("idComm")));
             System.out.println(id_comm);
           List <CommentsBean> allComm= delete.delComm(id_comm);

  request.setAttribute("allcomm",allComm);
               request.getServletContext().getRequestDispatcher("/commAdmin.jsp").forward(request, response);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DeleteCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            request.getServletContext().getRequestDispatcher("/commAdmin.jsp").forward(request, response);
        }
    }
    
}