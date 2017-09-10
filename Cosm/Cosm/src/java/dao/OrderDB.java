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
public class OrderDB {
    DBCon dbCon = new DBCon();
    private ArrayList<Menu> OrderList = new ArrayList<Menu>();
    public void makeOrder(String data, String time, String name, ArrayList<Menu> list, int id_user) throws SQLException, ClassNotFoundException {
        System.out.println("dao");
        for (int i = 0; i < list.size(); i++) {
            dbCon.connect().executeUpdate("INSERT INTO orders (idFood, id, data, time, name) VALUES( '" + list.get(i).getIdFood() + "','" + id_user + "','" + data + "','" + time + "','" + name + "') ");
        }
    }
    
    public void deleteBasket(Integer id) throws SQLException, ClassNotFoundException {
        System.out.println("delete");
        System.out.println(id);
        dbCon.connect().executeUpdate("DELETE FROM basket WHERE id='"+id+"'");
        System.out.println(id);
    }
    
    public ArrayList<Menu> idInBasket(Integer id_user) throws SQLException, ClassNotFoundException {
        System.out.println("id in basket");
        OrderList.clear();
        String str = "SELECT menu.idFood FROM basket INNER JOIN menu ON basket.idFood = menu.idFood WHERE id='"+id_user+"'";
  
        ResultSet rs = dbCon.connect().executeQuery(str);
        String idFood;        
        while (rs.next()) {
            idFood = rs.getString(1);
            Menu bs = new Menu(Integer.parseInt(idFood));
            OrderList.add(bs);
        }
        System.out.println("id in basket");
        return OrderList;
    }

    public void makeOrder(String data, String time, String name, int id, ArrayList<Menu> listnew, int id_user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
