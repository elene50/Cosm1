/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import beans.Users;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Home
 */
public class ShowDB {

    private List<Users> UsersList = new LinkedList<Users>() {
    };
    
    ReadData read = new ReadData();

    public void showPage(String obj, String role, HttpServletResponse response, HttpServletRequest request) throws UnsupportedEncodingException, IOException, SQLException, ClassNotFoundException
    {
        String object = null, middle = null, table = null, menu = null, button=null, command="show";
        
        if(obj.equals("users")){object="пользователей"; command+="Users";}
        OutputStreamWriter streamWriter = new OutputStreamWriter(response.getOutputStream(), "Cp1251");
        String out=""+"<html><head>";
        
       
        out=out+"<script language=\"javascript\" src=\"js/enterCheck.js\"></script><title>Просмотр</title>"+
                "</head><body><form action=\"/Web1/Servlet\" method=\"get\">"+
                "<div id=\"container\"><div id=\"header\">"+
                "<font face=\"Segoe Print\" size=\"3\"><table align=\"center\" width=\"100%\">"+
                "<tr><td align=\"center\"><font size=\"5\">Просмотр "+object+"</font></td>"+
                "<td align=\"right\"> <a href=\"index.jsp\"> Выйти </a></td></tr></table>"+
                "<div id=\"menu\"><font face=\"Segoe Print\" size=\"4\">"+
                "<p> <font size=\"6\">Меню </font></p><p></p>";
        String tableEnd=""+"</h2></table></font>";
        String end="</div></div></form></body></html>";
        
        
        if(obj.equals("users"))
        {
            UsersList = read.viewUsers();
            int i = 0;
            if(!UsersList.isEmpty())
            {
                table = "</font></div><div id=\"content\"><font face=\"Segoe Print\" size=\"3\">"+
                        "&nbsp;&nbsp;<h2><table border=\"1\" align=\"center\">"+
                        "<tr>" + "<td>Логин</td> </tr>";
            out=out+table;
            while (i < UsersList.size()) {
                middle = " <tr>" + "   <td>" + UsersList.get(i).getLogin() + "</td>" +
                        "  <td>" + UsersList.get(i).getPassword() + "</td></tr>";
              out=out+middle;
              i++;
            }
            out=out+tableEnd;
            }
            else
                out=out+"</font></div><div id=\"content\"><font face=\"Segoe Print\" size=\"3\">"+
                        "&nbsp;&nbsp;<h1>List of users is empty!</h1></font>";
        }

        out = out + end;
        streamWriter.write(out);
        streamWriter.close();
    }

    public void errorPage(String error,String href, HttpServletResponse response) throws IOException
    {
        OutputStreamWriter streamWriter = new OutputStreamWriter(response.getOutputStream(), "Cp1251");
        String out = "" + "<html> <head> <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" pageEncoding=\"UTF-8\"> </head><body bgcolor=\"black\"> <center> <p><font color=\"#f17f23\" size=\"+4\" face=\"Segoe print\">"+error+"</font></p><p><a href="+href+">OK</a></p>";
        String end = "</center> </body> </html>";
        out=out+end;
        streamWriter.write(out);
        streamWriter.close();
    }
}
