package DAO;

import java.sql.PreparedStatement;
import java.sql.*;
import Model.*;
import DataCon.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CompanyDAO {

    public static CompanyDAO getInstance() {
        return new CompanyDAO();
    }

    public int insert(Company cus) {
        int i = 0;
        Connection c = JDBC.getConnection();
        String sql = "INSERT INTO [dbo].[Companies]\n"
                + "           ([CompanyID]\n"
                + "           ,[CompanyName])\n"
                + "     VALUES\n"
                + "           (?,?)";
        try {
            PreparedStatement st = c.prepareStatement(sql);

            st.setString(1, cus.getCompanyID());
            st.setString(2, cus.getCompanyName());

            st.executeUpdate();
            i = 0;
            JDBC.closeConnection(c);
        } catch (SQLException ex) {
            String errorMessage = ex.getMessage();
            if (errorMessage.contains("FOREIGN KEY constraint")) {
                i = 1;
                JOptionPane.showMessageDialog(null, "Đã tồn tại "+ cus.getCompanyID());
            } else if (errorMessage.contains("PRIMARY KEY constraint")) {
                i = 2;
                JOptionPane.showMessageDialog(null, "Đã tồn tại "+ cus.getCompanyID());
                System.out.println(errorMessage);
            }
        }
        return i;
    }

    public String createCompanyID() {
        String i = "";
        try {
            Connection c = JDBC.getConnection();
            Statement st = c.createStatement();
            String sql = "select top 1 CompanyID\n"
                    + "from Companies\n"
                    + "Order by CompanyID desc";
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                String a = rs.getString("CompanyID");
                a = a.substring(3);
                int num = Integer.valueOf(a);
                num++;
                i = "cty" + num;
            }
            if (i.equals("")) {
                i = "cty0";
            }
            JDBC.closeConnection(c);
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("CompanyDAO createCompanyID");
        }
        return i;
    }

    public ArrayList<Company> getAll() {
        ArrayList<Company> list = new ArrayList<>();
        Connection c = JDBC.getConnection();
        String sql = "SELECT *\n"
                + "  FROM [dbo].[Companies]";
        try {

            PreparedStatement st = c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Company cus = new Company(rs.getString("CompanyID"), rs.getString("CompanyName"));
                list.add(cus);
            }
            JDBC.closeConnection(c);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public void delete(Company cus) {
        Connection c = JDBC.getConnection();
        String sql = "DELETE FROM [dbo].[Companies]\n"
                + "      WHERE CompanyID= '" + cus.getCompanyID() + "'";
        try {
            PreparedStatement st = c.prepareStatement(sql);
            int kq = st.executeUpdate();
            System.out.println(kq);
            if (kq != 0) {
                JOptionPane.showMessageDialog(null, "Xóa thành công " + cus.getCompanyID(), "DELETE SUCCESS", JOptionPane.INFORMATION_MESSAGE);
            }
            JDBC.closeConnection(c);
        } catch (SQLException e) {
            System.out.println(e);;
        }
    }

    public void update(Company ca) {
        try {
            Connection c = JDBC.getConnection();
            String sql = "UPDATE [dbo].[Companies]\n"
                    + "   SET [CompanyName] = ?\n"
                    + " WHERE CompanyID = '" + ca.getCompanyID() + "'";
            PreparedStatement st = c.prepareStatement(sql);

            st.setString(1, ca.getCompanyName());
            System.out.println(sql);
            int kq = st.executeUpdate();
            JDBC.closeConnection(c);
            if (kq == 0) {
                JOptionPane.showMessageDialog(null, "Không tồn tại " + ca.getCompanyID(), "INPUT WRONG", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Sửa thành công " + ca.getCompanyID(), "UPDATE SUCCESS", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<Company> findCompany(Company cus) {
        ArrayList<Company> list = new ArrayList<>();
        String sql = "select * from Companies "
                + "where CompanyName like'%" + cus.getCompanyName()+ "%'";
        System.out.println(sql);
        try {
            Connection c = JDBC.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                cus = new Company(rs.getString("CompanyID"), rs.getString("CompanyName"));
                list.add(cus);
            }
            JDBC.closeConnection(c);
        } catch (SQLException e) {
            System.out.println(e);
        }

        return list;
    }
    
    public String getNameCompany(String id){
        String name = "";
        try {
            Connection c = JDBC.getConnection();
            
            String sql = "select CompanyName from Companies where CompanyID = ?";
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                name = rs.getString("CompanyName");
            }
            JDBC.closeConnection(c);
        } catch (SQLException ex) {
            String errorMessage = ex.getMessage();
        }
        return name;
    }
}
