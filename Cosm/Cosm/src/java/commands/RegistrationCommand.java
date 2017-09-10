/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import dao.*;
import servlet.Constants;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Home
 */
public class RegistrationCommand implements Command  {

    ShowDB show = new ShowDB();
    RegistrationDB reg = new RegistrationDB();

    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String surname = request.getParameter(Constants.surname);
            String name = request.getParameter(Constants.name);
            String lastname = request.getParameter(Constants.lastname);
            String phone = request.getParameter(Constants.phone);

            String login = request.getParameter(Constants.loginUser);
            String password = request.getParameter(Constants.passUser);
             if (surname.isEmpty()) {
                show.errorPage("Enter surname!", "registration.jsp", response);
            }
              if (name.isEmpty()) {
                show.errorPage("Enter name!", "registration.jsp", response);
            }
               if (lastname.isEmpty()) {
                show.errorPage("Enter lastname!", "registration.jsp", response);
            }
                if (phone.isEmpty()) {
                show.errorPage("Enter phone!", "registration.jsp", response);
            }
            if (login.isEmpty()) {
                show.errorPage("Enter login!", "registration.jsp", response);
            }
            if (password.isEmpty()) {
                show.errorPage("Enter password!", "registration.jsp", response);
            }
            
            System.out.println(surname +" "+name +" "+lastname +" "+phone +" "+login +" "+ password);
            int k = reg.regUser(surname, name, lastname, phone, login, password);
            if (k == 0) {
                    int id_user = reg.ReturnIdUser(surname,name,lastname,phone,login,password);
                     request.getSession().setAttribute("ID", Integer.valueOf(id_user));
                    request.getSession().setAttribute("surname", surname);
 request.getSession().setAttribute("name", name);
    request.getSession().setAttribute("lastname", lastname);
        request.getSession().setAttribute("phone", phone);
                 
                    request.getSession().setAttribute("Login", login);
                    request.getServletContext().getRequestDispatcher("/work.jsp").forward(request, response);
            } else {
                show.errorPage("Please choose another username! This login is not available!", "registration.jsp", response);
            } 
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistrationCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            request.getServletContext().getRequestDispatcher("/work.jsp").forward(request, response);
        }
    }
}
