package dao;

import beans.Users;
import connection.DBCon;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class EnterDB {

    DBCon dbCon = new DBCon();
    private List<Users> UsersList = new LinkedList<Users>();

    public List<Users> getUsersList() {
        return UsersList;
    }

    public void login(String log, String pas) throws SQLException, ClassNotFoundException {
        String str = "SELECT * FROM Users" + " WHERE login ='" + log + "' AND password ='" + pas + "'";

        ResultSet rs = dbCon.connect().executeQuery(str);
        String ID, login, password;
        while (rs.next()) {
            ID = rs.getString(1);
            login = rs.getString(2);
            System.out.println(login);
            password = rs.getString(3);
            System.out.println(password);
            Users user = new Users(Integer.parseInt(ID), login, password);
            UsersList.add(user);
        }
    }

    public int ReturnIdUser(String log, String pas) throws SQLException, ClassNotFoundException {
        String str = "SELECT ID FROM Users WHERE Login ='" + log + "' AND Password ='" + pas + "'";
        ResultSet rs = dbCon.connect().executeQuery(str);
        String ID = null;
        while (rs.next()) {
            ID = rs.getString(1);
        }
        return Integer.parseInt(ID);
    }
}
