/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import beans.Menu;
import dao.ReadData;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
public class PrintCredit implements Command {
        ReadData rd = new ReadData();
      @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session= request.getSession();
        
        System.out.println("go to allcomm");
    //    String text = request.getParameter("comm");
        Integer sum=Integer.valueOf(session.getAttribute("SUM").toString());
        
          System.out.println("go to allcommrtertert");
        double credit = sum/3+sum*0.1/12*3;
       // List <Menu> as= new ArrayList<>();
     //   String path = "C:\\Users\\Elena\\Desktop\\Restaurant3\\kredit.txt";

        // This text is added only once to the file.
      
        // This text is always added, making the file longer over time
        // if it is not deleted.
      
request.setAttribute("credit", credit);
        // Open the file to read from.
     //   String[] readText = Files.readAllLines(path);
        	/*Path path = Paths.get("D:/", "kredit.txt");
		List<String> data = Files.readAllLines(path,Charset.forName("cp1251"));
                 System.out.println("UUUUeeeeeeeeeeeee");
                for(String str:data){
                    System.out.println(str);
                }
                request.setAttribute("kredit", data); */
                 request.getServletContext().getRequestDispatcher("/printkredit.jsp").forward(request, response);



}}
