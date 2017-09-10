/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import beans.CommentsBean;
import connection.DBCon;
import beans.Menu;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Home
 */
public class DeleteDB {
    DBCon dbCon = new DBCon();
    public void delRecord(Integer idFood) throws SQLException, ClassNotFoundException {
        System.out.println("dao delete");
       // System.out.println(id);
      //  System.out.println(id_food);  
        dbCon.connect().executeUpdate("DELETE FROM basket WHERE idFood="+idFood+"");
        //String str = "SELECT menu.cost FROM basket INNER JOIN menu ON basket.idFood = menu.idFood WHERE id='"+id_user+"'";

     //   System.out.println(id_food); 
    }
    public List <CommentsBean> delComm(Integer id_comm) throws SQLException, ClassNotFoundException {
        dbCon.connect().executeUpdate("DELETE FROM comm WHERE idComm="+id_comm+"");
        ReadData rd= new ReadData();
        List <CommentsBean> allComm=rd.allcomm();
        return allComm;
    }
    public ArrayList <Menu> view(Integer idFood) throws SQLException, ClassNotFoundException {
          System.out.println("----------------------------------------"); 
        dbCon.connect().executeUpdate("DELETE FROM menu WHERE idFood="+idFood+"");
        ReadData rd= new ReadData();
        ArrayList <Menu> view=rd.view();
        return view;
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/*package dao;
import beans.CommentsBean;
import connection.DBCon;
import beans.Menu;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Home
 */
/*public class DeleteDB {
    DBCon dbCon = new DBCon();
    public void delRecord(Integer id, Integer id_food) throws SQLException, ClassNotFoundException {
        System.out.println("dao delete");
        System.out.println(id);
        System.out.println(id_food);  
        dbCon.connect().executeUpdate("DELETE FROM basket WHERE id='"+id+"' AND id_food='"+id_food+"'");
        System.out.println(id_food); 
    }
     // public List <CommentsBean> delComm(Integer id_comm) throws SQLException, ClassNotFoundException {
        dbCon.connect().executeUpdate("DELETE FROM comm WHERE idComm='"+id_comm+"'");
        ReadData rd= new ReadData();
    //    List <CommentsBean> allComm=rd.allcomm();
        return allComm;
    }
  //  public ArrayList <Menu> view(Integer idFood) throws SQLException, ClassNotFoundException {
          System.out.println("----------------------------------------"); 
        dbCon.connect().executeUpdate("DELETE FROM menu WHERE idFood="+idFood);
        ReadData rd= new ReadData();
      //  ArrayList <Menu> view=rd.view();
        return view;
    }
}*/