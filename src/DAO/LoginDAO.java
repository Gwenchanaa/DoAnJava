package DAO;

import java.sql.*;
import model.*;
import DataCon.*;
import javax.swing.JOptionPane;

public class LoginDAO {

    public static LoginDAO getInstance() {
        return new LoginDAO();
    }

    public boolean checkUser(String ID, String pass) {
        boolean check = false;
        String IDSql = null, passSql = null;
        Connection c = JDBC.getConnection();
        String sql = "SELECT UserID, UserPassword FROM Users WHERE UserID = ? AND Userpassword = ?";
        try {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, ID);
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                IDSql = rs.getString("UserID");
                passSql = rs.getString("UserPassword");
            }
            check = (ID.equals(IDSql) && pass.equals(passSql));
            JDBC.closeConnection(c);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return check;
    }
}
