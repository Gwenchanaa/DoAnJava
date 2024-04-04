package DataCon;

import java.sql.*;
public class JDBC {
    public static Connection getConnection(){
        Connection c = null;
        String url = "jdbc:sqlserver://LAPTOP-VNOPB5Q7\\SQLEXPRESS:1433; databaseName=Hello;user=sa;password=123;"
                + "encrypt=true;trustServerCertificate=true";
        
        if( c == null){
            try {
                //step 1: craete connection
                c = DriverManager.getConnection(url);
//                System.out.println("Connection is established with " + c.getCatalog());

            } catch (SQLException ex) {
                System.out.println("Connection lost by " + ex);
            }
        }
        return c;
    }

    public static void closeConnection(Connection c) {
        try{
            if(c != null){
                c.close();
//                System.out.println("Connection is closed !!!");
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        
    } 
}
