package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBCon {

    public Statement state;

    public Statement connect() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/Cos";
        String login = "root";
        String password = "root";

        Connection con = DriverManager.getConnection(url, login, password);
        state = con.createStatement();
        return state;
    }
}
