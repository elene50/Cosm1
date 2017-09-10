/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connection.DBCon;
import beans.Users;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Home
 */
public class RegistrationDB {

    private List<Users> UsersList = new LinkedList<Users>();
    EnterDB ent = new EnterDB();
    DBCon dbCon = new DBCon();
    ReadData read = new ReadData();

    public int regUser(String surname, String name, String lastname, String phone, String login, String password) throws SQLException, ClassNotFoundException {
        int k = 0;
        UsersList = read.viewUsers();
        for (int i = 0; i < UsersList.size() - 1; i++) {
            if (UsersList.get(i).getLogin().equals(login)) {
                k=100;
            }
        }

        if (k == 0) {
            String query = "INSERT INTO users(surname, name, lastname, phone, login, password) VALUES ('" + surname + "','" + name + "','" + lastname + "','" + phone + "','" + login + "','" + password + "')";
            dbCon.connect().executeUpdate(query);
            ent.login(login, password);
        }
        return k;
    }

    public int ReturnIdUser(String surname, String name, String lastname, String phone, String log, String pas) throws SQLException, ClassNotFoundException {
        String str = "SELECT * FROM Users WHERE surname ='" + surname + "' AND name ='" + name + "' AND lastname ='" + lastname + "' AND phone ='" + phone + "' AND  login ='" + log + "' AND password ='" + pas + "'";
        ResultSet rs = dbCon.connect().executeQuery(str);
        String id_user = null;
        while (rs.next()) {
            id_user = rs.getString(1);
        }
        return Integer.parseInt(id_user);
    }
}
