package DataCon;

import java.sql.*;

public class JDBC {

    public static Connection getConnection() {
        Connection conn = null;

        String url = "jdbc:sqlserver://localhost:1433;databaseName=leatherManagerSystem1;user=sa;password=12345;"
                + "encrypt=true;trustServerCertificate=true";
        if (conn == null) {
            try {
                //step 1: craete connection
                conn = DriverManager.getConnection(url);
                System.out.println("Connection is established with " + conn.getCatalog());

            } catch (SQLException ex) {
                System.out.println("Connection lost =(" + ex);
            }
        }
        return conn;
    }

    public static void closeConnection(Connection c) {
        try {
            if (c != null) {
                c.close();
                System.out.println("Connection is closed !!!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
