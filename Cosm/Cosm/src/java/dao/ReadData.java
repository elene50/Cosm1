package dao;

import beans.*;
import connection.DBCon;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReadData {

    public ReadData() {
    }
    private List<Users> UsersList = new LinkedList<Users>();
    private ArrayList<Menu> MenuList = new ArrayList<Menu>();
    private ArrayList<Menu> SearchList = new ArrayList<Menu>();
    private ArrayList<Menu> SortMenuList = new ArrayList<Menu>();
    private ArrayList<Basket> BasketList = new ArrayList<Basket>();
    private ArrayList<Menu> ShowMenuList = new ArrayList<Menu>();
    DBCon dbCon = new DBCon();

    public List<Users> viewUsers() throws SQLException, ClassNotFoundException {
        UsersList.clear();
        String str = "SELECT * FROM users";
        ResultSet rs = dbCon.connect().executeQuery(str);
        String ID, /*surname,name,lastname,phone, */ login, password;
        while (rs.next()) {
            ID = rs.getString(1);
            login = rs.getString(2);
            password = rs.getString(3);
            Users user = new Users(Integer.parseInt(ID), login, password);
            UsersList.add(user);
        }
        return UsersList;
    }

    public ArrayList<Menu> viewMenu() throws SQLException, ClassNotFoundException {
        MenuList.clear();
        String str = "SELECT * FROM menu";
        ResultSet rs = dbCon.connect().executeQuery(str);
        String idFood, food, dose, cost, image;
        while (rs.next()) {
            idFood = rs.getString(1);
            food = rs.getString(2);
            dose = rs.getString(3);
            cost = rs.getString(4);
            image = rs.getString(5);
            Menu mn = new Menu(Integer.parseInt(idFood), food, dose, Integer.parseInt(cost), image);
            MenuList.add(mn);
        }
        return MenuList;
    }

    public ArrayList<Menu> search(String name) throws SQLException, ClassNotFoundException {
        System.out.println("search");
        SearchList.clear();
        String str = "SELECT * FROM menu WHERE food like '%" + name + "%'";
        ResultSet rs = dbCon.connect().executeQuery(str);
        String idFood, food, dose, cost, image;
        while (rs.next()) {
            idFood = rs.getString(1);
            food = rs.getString(2);
            dose = rs.getString(3);
            cost = rs.getString(4);
            image = rs.getString(5);
            Menu mn = new Menu(Integer.parseInt(idFood), food, dose, Integer.parseInt(cost), image);
            SearchList.add(mn);
        }
        return SearchList;
    }

    public ArrayList<Menu> viewSortMenu() throws SQLException, ClassNotFoundException {
        System.out.println("sort");
        SortMenuList.clear();
        String str = "SELECT * FROM menu ORDER BY cost DESC";
        ResultSet rs = dbCon.connect().executeQuery(str);
        String idFood, food, dose, cost, image;
        while (rs.next()) {
            idFood = rs.getString(1);
            food = rs.getString(2);
            dose = rs.getString(3);
            cost = rs.getString(4);
            image = rs.getString(5);
            Menu mn = new Menu(Integer.parseInt(idFood), food, dose, Integer.parseInt(cost), image);
            SortMenuList.add(mn);
        }
        return SortMenuList;
    }

    public ArrayList<Menu> viewSortMenu2() throws SQLException, ClassNotFoundException {
        System.out.println("sort");
        SortMenuList.clear();
        String str = "SELECT * FROM menu ORDER BY food ASC";
        ResultSet rs = dbCon.connect().executeQuery(str);
        String idFood, food, dose, cost, image;
        while (rs.next()) {
            idFood = rs.getString(1);
            food = rs.getString(2);
            dose = rs.getString(3);
            cost = rs.getString(4);
            image = rs.getString(5);
            Menu mn = new Menu(Integer.parseInt(idFood), food, dose, Integer.parseInt(cost), image);
            SortMenuList.add(mn);
        }
        return SortMenuList;
    }

    public ArrayList<Basket> viewBasket() throws SQLException, ClassNotFoundException {
        BasketList.clear();
        String str = "SELECT * FROM basket";
        ResultSet rs = dbCon.connect().executeQuery(str);
        String idRecord, id, idFood;
        while (rs.next()) {
            idRecord = rs.getString(1);
            id = rs.getString(2);
            idFood = rs.getString(3);
            Basket bs = new Basket(Integer.parseInt(idRecord), Integer.parseInt(id), Integer.parseInt(idFood));
            BasketList.add(bs);
        }
        return BasketList;
    }

    public ArrayList<Menu> viewShowBasket(Integer id_user) throws SQLException, ClassNotFoundException {
        System.out.println("view");
        ShowMenuList.clear();
        System.out.println(id_user);
        String str = "SELECT menu.idFood, menu.food, menu.cost, menu.image FROM basket INNER JOIN menu ON basket.idFood = menu.idFood INNER JOIN users ON basket.id = users.id WHERE users.id='" + id_user + "'";
        ResultSet rs = dbCon.connect().executeQuery(str);
        String idFood, food, cost, image;
        while (rs.next()) {
            idFood = rs.getString(1);
            food = rs.getString(2);
            cost = rs.getString(3);
            image = rs.getString(4);
            Menu bs = new Menu(Integer.parseInt(idFood), food, Integer.parseInt(cost), image);
            ShowMenuList.add(bs);
        }
        return ShowMenuList;
    }

    public void comm(String text, int id) throws SQLException, ClassNotFoundException {
        System.out.println(text);
        String query = "INSERT INTO comm (id, comm) VALUES ('" + id + "','" + text + "')";
        dbCon.connect().executeUpdate(query);
    }

    public List<CommentsBean> allcomm() throws SQLException, ClassNotFoundException {
        List<CommentsBean> allcomments = new ArrayList<CommentsBean>();
        String str = "SELECT comm.idComm,comm.comm,users.login FROM comm INNER JOIN users ON comm.id = users.id";
        ResultSet rs = dbCon.connect().executeQuery(str);
        String login, text;
        int idComm;
        while (rs.next()) {
            idComm = rs.getInt(1);
            text = rs.getString(2);
            login = rs.getString(3);

            CommentsBean bs = new CommentsBean(idComm, login, text);
            allcomments.add(bs);
        }
        return allcomments;
    }

    public ArrayList<Menu> view() throws SQLException, ClassNotFoundException {
        String str = "SELECT * FROM menu";
        ResultSet rs = dbCon.connect().executeQuery(str);
        String idFood, food, dose, cost, image;
        while (rs.next()) {
            idFood = rs.getString(1);
            food = rs.getString(2);
            dose = rs.getString(3);
            cost = rs.getString(4);
            image = rs.getString(5);
            Menu mn = new Menu(Integer.parseInt(idFood), food, dose, Integer.parseInt(cost), image);
            MenuList.add(mn);
        }
        return MenuList;
    }

}
