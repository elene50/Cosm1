/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import beans.Menu;
import connection.DBCon;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Home
 */
public class InBasketDB {
    DBCon dbCon = new DBCon();
    public void addRecord(int id, int idFood) throws SQLException, ClassNotFoundException {
        System.out.println("dao");
        dbCon.connect().executeUpdate("INSERT INTO basket (id, idFood) VALUES( '" + id + "','" + idFood + "') ");
    }

    
}