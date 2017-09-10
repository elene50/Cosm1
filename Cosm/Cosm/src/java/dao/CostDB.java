/*
 * To change this template, choose Tools | Templates
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
 * @author Home
 */
public class CostDB {
    DBCon dbCon = new DBCon();
    private ArrayList<Menu> FoodList = new ArrayList<Menu>();
    
    public ArrayList<Menu> costFood(Integer id_user) throws SQLException, ClassNotFoundException {
        System.out.println("id in basket");
        FoodList.clear();
        String str = "SELECT menu.cost FROM basket INNER JOIN menu ON basket.idFood = menu.idFood WHERE id='"+id_user+"'";
  
        ResultSet rs = dbCon.connect().executeQuery(str);
        String idFood;        
        while (rs.next()) {
            idFood = rs.getString(1);
            Menu bs = new Menu(Integer.parseInt(idFood));
            FoodList.add(bs);
        }
        System.out.println("id in basket");
        return FoodList;
    }
}
