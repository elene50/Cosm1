/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import dao.*;
import dao.ReadData;
import connection.DBCon;
import servlet.Constants;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Home
 */
public class EnterCommand implements Command {

    EnterDB log = new EnterDB();
    ShowDB show = new ShowDB();

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
  /*String surname = request.getParameter(Constants.surname);
    String name = request.getParameter(Constants.name);
      String lastname = request.getParameter(Constants.lastname);
             String phone = request.getParameter(Constants.phone);*/
            String login = request.getParameter(Constants.loginUser);
            String password = request.getParameter(Constants.passUser);
            System.out.println(login + " zahodili " + password);

            
            if (!login.isEmpty() && !password.isEmpty()) {
                log.login(login, password);

                if (log.getUsersList().isEmpty()) {
                    show.errorPage("List users is empty!", "index.jsp", response);
                } else {
                    int ID = log.ReturnIdUser(login, password);
                    /* request.getSession().setAttribute("Surname", surname);

                      request.getSession().setAttribute("name", name);
 request.getSession().setAttribute("lastname", lastname);
 request.getSession().setAttribute("phone", phone);*/

                    request.getSession().setAttribute("Login", login);
                    request.getSession().setAttribute("ID", Integer.valueOf(ID));
                    log.getUsersList().clear();
                    if (login.equals("admin")) request.getServletContext().getRequestDispatcher("/welcomAdmin.jsp").forward(request, response); 
                    else request.getServletContext().getRequestDispatcher("/work.jsp").forward(request, response);
                    System.out.println("``````");
                }
            } else {
                RequestDispatcher dispatcher2 = request.getRequestDispatcher("index.jsp");
                dispatcher2.forward(request, response);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EnterCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            show.errorPage("Autorisation is break! ", "menuAdmin.jsp", response);
        }
    }
}
