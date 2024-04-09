/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CUONG
 */
public class NewClass {
     public static void main(String[] args) {
        var server = "LAPTOP-IIDFC8GV\\VIETCUONG";
        var user = "sa";
        var password = "123";
        var db= "PTTKHT";
        var port = 1433;
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser(user);
        ds.setPassword(password);
        ds.setDatabaseName(db);
        ds.setServerName(server);
        ds.setPortNumber(port);
        try(Connection conn = ds.getConnection()){
            System.out.println("kk");
            
        }catch(SQLException ex){
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
}
