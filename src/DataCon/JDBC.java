package DataCon;

import java.sql.*;

public class JDBC {

    public static Connection getConnection() {
        Connection c = null;
        String dbUrl = "jdbc:sqlserver://localhost:1433;databaseName=leatherManagerSystem;trustServerCertificate=true";
        String username = "sa";
        String password = "12345";

        if (c == null) {
            try {
                //step 1: craete connection
                c = DriverManager.getConnection(dbUrl, username, password);
//                System.out.println("Connection is established with " + c.getCatalog());

            } catch (SQLException ex) {
                System.out.println("Connection lost by " + ex);
            }
        }
        return c;
    }

    public static void closeConnection(Connection c) {
        try {
            if (c != null) {
                c.close();
//                System.out.println("Connection is closed !!!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Connection c = getConnection();
    }
}
