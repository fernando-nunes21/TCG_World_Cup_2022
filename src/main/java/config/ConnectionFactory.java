package config;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private final String host = System.getenv("database_host");
    private final String db = System.getenv("database_db");
    private final String user = System.getenv("database_user");
    private final String password = System.getenv("database_password");

    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql//"+host+"/"+db, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
