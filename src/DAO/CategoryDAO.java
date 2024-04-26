package DAO;

import java.sql.PreparedStatement;
import java.sql.*;
import model.*;
import DataCon.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CategoryDAO {

    public static CategoryDAO getInstance() {
        return new CategoryDAO();
    }

    public int insert(Category cate) {
        int i = 0;
        Connection c = JDBC.getConnection();
        String sql = "INSERT INTO [dbo].[Categories]\n"
                + "           ([CategoryID]\n"
                + "           ,[CategoryName])\n"
                + "     VALUES\n"
                + "           (?,?)";
        try {
            PreparedStatement st = c.prepareStatement(sql);

            st.setString(1, cate.getCategoryID());
            st.setString(2, cate.getCategoryName());

            st.executeUpdate();
            i = 0;

            JDBC.closeConnection(c);
        } catch (SQLException ex) {
            String errorMessage = ex.getMessage();

            if (errorMessage.contains("FOREIGN KEY constraint")) {
                i = 1;
            } else if (errorMessage.contains("PRIMARY KEY constraint")) {
                i = 2;
                System.out.println(i);
                System.out.println(errorMessage);
            }
        }
        return i;
    }

    public String createCategoryID() {
        String i = "";
        try {
            Connection c = JDBC.getConnection();
            Statement st = c.createStatement();
            String sql = "select top 1 CategoryID\n"
                    + "from Categories\n"
                    + "Order by CategoryID desc";
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                String a = rs.getString("CategoryID");
               a = a.trim();
                int num = Integer.valueOf(a);
                num++;
                i = "Cate" + num;
            }
            if (i.equals("")) {
                i = "Cate0";
            }
            JDBC.closeConnection(c);
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("CategoryDAO createCategoryID");
        }
        return i;
    }

    public ArrayList<Category> getAll() {
        ArrayList<Category> list = new ArrayList<>();
        Connection c = JDBC.getConnection();
        String sql = "SELECT *\n"
                + "  FROM [dbo].[Categories]";
        try {

            PreparedStatement st = c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Category cate = new Category(rs.getString("CategoryID"), rs.getString("CategoryName"));
                list.add(cate);
            }
            JDBC.closeConnection(c);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public void delete(Category cate) {
        Connection c = JDBC.getConnection();
        String sql = "DELETE FROM [dbo].[Categories]\n"
                + "      WHERE CategoryID= '" + cate.getCategoryID() + "'";
        try {
            PreparedStatement st = c.prepareStatement(sql);
            int kq = st.executeUpdate();
            System.out.println(kq);
            if (kq != 0) {
                JOptionPane.showMessageDialog(null, "Xóa thành công " + cate.getCategoryID(), "DELETE SUCCESS", JOptionPane.INFORMATION_MESSAGE);
            }
            JDBC.closeConnection(c);
        } catch (SQLException e) {
            System.out.println(e);;
        }
    }

    public void update(Category ca) {
        try {
            Connection c = JDBC.getConnection();
            String sql = "UPDATE [dbo].[Categories]\n"
                    + "   SET [CategoryName] = ?\n"
                    + " WHERE CategoryID = '" + ca.getCategoryID() + "'";
            PreparedStatement st = c.prepareStatement(sql);

            st.setString(1, ca.getCategoryName());
            System.out.println(sql);
            int kq = st.executeUpdate();
            JDBC.closeConnection(c);
            if (kq == 0) {
                JOptionPane.showMessageDialog(null, "Không tồn tại " + ca.getCategoryID(), "INPUT WRONG", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Sửa thành công " + ca.getCategoryID(), "UPDATE SUCCESS", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<Category> findCategory(Category cate) {
        ArrayList<Category> list = new ArrayList<>();
        String sql = "select * from categories where categories.CategoryName like'%" + cate.getCategoryName()+ "%'";
        try {
            Connection c = JDBC.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                cate = new Category(rs.getString("CategoryID"), rs.getString("CategoryName"));
                list.add(cate);
            }
            JDBC.closeConnection(c);
        } catch (SQLException e) {
            System.out.println(e);
        }

        return list;
    }
}
