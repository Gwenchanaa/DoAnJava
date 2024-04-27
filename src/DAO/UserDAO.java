package DAO;

import java.sql.PreparedStatement;
import java.sql.*;
import model.*;
import DataCon.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UserDAO {

    public static UserDAO getInstance() {
        return new UserDAO();
    }

    public int insert(User user) {
        int i = 0;
        try {
            Connection c = JDBC.getConnection();
            String sql = "INSERT INTO [dbo].[Users]\n"
                    + "           ([UserID]\n"
                    + "           ,[UserName]\n"
                    + "           ,[UserPassword])\n"
                    + "     VALUES\n"
                    + "           (?,?,?)";
            PreparedStatement st = c.prepareStatement(sql);

            st.setString(1, user.getUserID());
            st.setString(2, user.getUserName());
            st.setString(3, user.getUserPassword());
            st.executeUpdate();
            i = 0;

            JDBC.closeConnection(c);
        } catch (SQLException ex) {
            String errorMessage = ex.getMessage();

            if (errorMessage.contains("FOREIGN KEY constraint")) {
                i = 1;
            } else if (errorMessage.contains("PRIMARY KEY constraint")) {
                i = 2;
                System.out.println(errorMessage);
            }
        }
        return i;
    }

    public String createUserID(String id) {
        String i = "";
        try {
            Connection c = JDBC.getConnection();
            Statement st = c.createStatement();
            String sql = "select top 1 UserID\n"
                    + "from Users\n"
                    + "where UserID like '" + id + "%'\n"
                    + "Order by UserID desc";
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                String a = rs.getString("UserID");
                if ("u".equals(a.substring(0,1))) {
                    a = a.substring(4);
                } else {
                    a = a.substring(5);
                }
                int num = Integer.valueOf(a);
                num++;
                i = id + num;
            }
            if (i.equals("")) {
                i = id + "0";
            }
            JDBC.closeConnection(c);
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("UserDAO createUserID");
        }
        return i;
    }

    public ArrayList<User> getAll() {
        ArrayList<User> list = new ArrayList<>();
        Connection c = JDBC.getConnection();
        String sql = "SELECT *\n"
                + "  FROM [dbo].[Users]";
        try {

            PreparedStatement st = c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                User user = new User(rs.getString("UserID"), rs.getString("UserName"));
                list.add(user);
            }
            JDBC.closeConnection(c);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public void delete(User user) {
        Connection c = JDBC.getConnection();
        String sql = "DELETE FROM [dbo].[Users]\n"
                + "      WHERE UserID= '" + user.getUserID() + "'";
        try {
            PreparedStatement st = c.prepareStatement(sql);
            int kq = st.executeUpdate();
//            System.out.println(kq);
            if (kq != 0) {
                JOptionPane.showMessageDialog(null, "Xóa thành công " + user.getUserID(), "DELETE SUCCESS", JOptionPane.INFORMATION_MESSAGE);
            }
            JDBC.closeConnection(c);
        } catch (SQLException e) {
            System.out.println(e);;
        }
    }

    public void update(User ca) {
        try {
            Connection c = JDBC.getConnection();
            String sql = "UPDATE [dbo].[Users]\n"
                    + "   SET [UserName] = ?\n"
                    + " WHERE UserID = '" + ca.getUserID() + "'";
            PreparedStatement st = c.prepareStatement(sql);

            st.setString(1, ca.getUserName());
            int kq = st.executeUpdate();
            JDBC.closeConnection(c);
            if (kq == 0) {
                JOptionPane.showMessageDialog(null, "Không tồn tại " + ca.getUserID(), "INPUT WRONG", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Sửa thành công " + ca.getUserID(), "UPDATE SUCCESS", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<User> findUser(User user) {
        ArrayList<User> list = new ArrayList<>();
        String sql = "select * from Users "
                + "where UserName like'%" + user.getUserName() + "%'";
        try {
            Connection c = JDBC.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                user = new User(rs.getString("UserID"), rs.getString("UserName"));
                list.add(user);
            }
            JDBC.closeConnection(c);
        } catch (SQLException e) {
            System.out.println(e);
        }

        return list;
    }
}
