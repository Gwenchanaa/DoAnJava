package DAO;

import java.sql.PreparedStatement;
import java.sql.*;
import model.*;
import DataCon.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CustomerDAO {

    public static CustomerDAO getInstance() {
        return new CustomerDAO();
    }

    public int insert(Customer cus) {
        int i = 0;
        Connection c = JDBC.getConnection();
        System.out.println("helo");
        String sql = "INSERT INTO [dbo].[Customers]\n"
                + "           ([CustomerID]\n"
                + "           ,[CustomerName]\n"
                + "           ,[CustomerPhone]\n"
                + "           ,[CustomerAddress])\n"
                + "     VALUES\n"
                + "           (?,?,?,?)";
        try {
            PreparedStatement st = c.prepareStatement(sql);

            st.setString(1, cus.getCustomerID());
            st.setString(2, cus.getCustomerName());
            st.setString(3, cus.getCustomerPhone());
            st.setString(4, cus.getCustomerAddress());

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

    public String createCustomerID() {
        String i = "";
        try {
            Connection c = JDBC.getConnection();
            Statement st = c.createStatement();
            String sql = "select top 1 CustomerID\n"
                    + "from Customers\n"
                    + "Order by CustomerID desc";
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                String a = rs.getString("CustomerID");
                a = a.substring(3);
                int num = Integer.valueOf(a);
                num++;
                i = "cus" + num;
            }
            if (i.equals("")) {
                i = "cus0";
            }
            JDBC.closeConnection(c);
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("CustomerDAO createCustomerID");
        }
        return i;
    }

    public ArrayList<Customer> getAll() {
        ArrayList<Customer> list = new ArrayList<>();
        Connection c = JDBC.getConnection();
        String sql = "SELECT *\n"
                + "  FROM [dbo].[Customers]";
        try {

            PreparedStatement st = c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Customer cus = new Customer(rs.getString("CustomerID"), rs.getString("CustomerName"), rs.getString("CustomerPhone"), rs.getString("CustomerAddress"));
                list.add(cus);
            }
            JDBC.closeConnection(c);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public void delete(Customer cus) {
        Connection c = JDBC.getConnection();
        String sql = "DELETE FROM [dbo].[Customers]\n"
                + "      WHERE CustomerID= '" + cus.getCustomerID() + "'";
        try {
            PreparedStatement st = c.prepareStatement(sql);
            int kq = st.executeUpdate();
            System.out.println(kq);
            if (kq != 0) {
                JOptionPane.showMessageDialog(null, "Xóa thành công " + cus.getCustomerID(), "DELETE SUCCESS", JOptionPane.INFORMATION_MESSAGE);
            }
            JDBC.closeConnection(c);
        } catch (SQLException e) {
            System.out.println(e);;
        }
    }

    public void update(Customer ca) {
        try {
            Connection c = JDBC.getConnection();
            String sql = "UPDATE [dbo].[Customers]\n"
                    + "   SET [CustomerName] = ?\n,"
                    + "   [CustomerPhone] = ?\n,"
                    + "   [CustomerAddress] = ?\n"
                    + " WHERE CustomerID = '" + ca.getCustomerID() + "'";
            PreparedStatement st = c.prepareStatement(sql);

            st.setString(1, ca.getCustomerName());
            st.setString(2, ca.getCustomerPhone());
            st.setString(3, ca.getCustomerAddress());
            System.out.println(sql);
            int kq = st.executeUpdate();
            JDBC.closeConnection(c);
            if (kq == 0) {
                JOptionPane.showMessageDialog(null, "Không tồn tại " + ca.getCustomerID(), "INPUT WRONG", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Sửa thành công " + ca.getCustomerID(), "UPDATE SUCCESS", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<Customer> findCustomer(Customer cus) {
        ArrayList<Customer> list = new ArrayList<>();
        String sql = "select * from Customers "
                + "where CustomerName like'%" + cus.getCustomerName()+ "%'"
                + " and CustomerAddress like '%" + cus.getCustomerAddress() + "%'"
                + " and CustomerPhone like '%" + cus.getCustomerPhone() + "%'";
        System.out.println(sql);
        try {
            Connection c = JDBC.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                cus = new Customer(rs.getString("CustomerID"), rs.getString("CustomerName"), rs.getString("CustomerPhone"), rs.getString("CustomerAddress"));
                list.add(cus);
            }
            JDBC.closeConnection(c);
        } catch (SQLException e) {
            System.out.println(e);
        }

        return list;
    }
    
    public String getNameCustomer(String id){
        String name = "";
        try {
            Connection c = JDBC.getConnection();
            String sql = "select CustomerName from Customers where CustomerID = ?";
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                name = rs.getString("CustomerName");
            }
            
            JDBC.closeConnection(c);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return name;
    }
}
