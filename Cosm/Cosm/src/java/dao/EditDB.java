/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import beans.Menu;
import connection.DBCon;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Elena
 */
public class EditDB {
    DBCon dbCon = new DBCon();
   
     /* public void addProduct(String food, String dose, String cost, String image) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
      public void editProduct(String food, String dose, String cost, String image, String idFood) throws SQLException, ClassNotFoundException {
        System.out.println("dao");
        
    dbCon.connect().executeUpdate("update menu SET food='"+food+"', dose="+dose+", cost="+cost+", image='images/"+image+"' WHERE idFood="+idFood+"");
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

      }
      
           // UPDATE " +ob.getClass().getSimpleName() + " SET login = ?, password = ?, surname = ?, name= ? , balance=? WHERE id_user ="+ob.getId_user());

 //dbCon.connect().executeUpdate("UPDATE INTO menu ( food, dose,cost,  image) VALUES('" + food+ "'," + Integer.parseInt(dose) + "," + Integer.parseInt(cost) + ",'images/" + image + "') ");
  //    dbCon.connect().executeUpdate("UPDATE menu VALUES('" + food+ "'," + Integer.parseInt(dose) + "," + Integer.parseInt(cost) + ",'images/" + image + "') ");

   /* public void editProduct(String food, String dose, int parseInt, String image, int parseInt0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void editProduct(String food, String dose, String cost, String image, int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

   /* public void editProduct(String food, String dose, String cost, String image, String idFood) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

  /*  public void editProduct(String food, String dose, String cost, String image, int idFood) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
}
