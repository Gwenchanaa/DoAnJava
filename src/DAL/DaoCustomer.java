/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Customer;

/**
 *
 * @author CUONG
 */
public class DaoCustomer extends DAOCONTENT {

    public List<Customer> getAll() {
        List<Customer> list = new ArrayList<>();
        String sql = "SELECT [CustomerID]\n"
                + "      ,[CustomerName]\n"
                + "      ,[CustomerPhone]\n"
                + "      ,[CustomerAddress]\n"
                + "  FROM [dbo].[Customers]";
        try {

            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Customer c = new Customer(rs.getInt("CustomerId"), rs.getString("CustomerName"),
                        rs.getString("CustomerPhone"), rs.getString("CustomerAddress")
                );
                list.add(c);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return list;
    }

    public int insert(Customer cus) {
          int i = 0;
        String sql = "INSERT INTO [dbo].[Customers]\n"
                + "           ([CustomerID]\n"
                + "           ,[CustomerName]\n"
                + "           ,[CustomerPhone]\n"
                + "           ,[CustomerAddress])\n"
                + "     VALUES\n"
                + "           (?,?,?,?)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);

            st.setInt(1, cus.getCustomerId());
            st.setString(2, cus.getCustomerName());
            st.setString(3, cus.getCustomerPhone());
            st.setString(4, cus.getCustomerAddress());
            st.executeUpdate();
          i = 0;
        } catch (SQLException ex) {
            String errorMessage = ex.getMessage();

            if (errorMessage.contains("FOREIGN KEY constraint")) {
                i = 1;
            } else if (errorMessage.contains("PRIMARY KEY constraint")) {
                System.out.println("pro");
                i = 2;
                System.out.println(i);
                System.out.println(errorMessage);

            }
        }
        return i;
        
    }

    public void delete(Customer cuss) {
        String sql = "DELETE FROM [dbo].[Customers]\n"
                + "      WHERE CustomerID = '" + cuss.getCustomerId()+ "'";

        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void update(Customer cuss) {

        String sql = "UPDATE [dbo].[Customers]\n"
                + "   SET [CustomerID] = ?\n"
                + "      ,[CustomerName] = ?\n"
                + "      ,[CustomerPhone] =?\n"
                + "      ,[CustomerAddress] = ?\n"
                + " WHERE CustomerId = '"+cuss.getCustomerId()+"'";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, cuss.getCustomerId());
            st.setString(2, cuss.getCustomerName());
            st.setString(3, cuss.getCustomerPhone());
            st.setString(4, cuss.getCustomerAddress());

            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public List<Customer> finCustomersByName(Customer c) {
        List<Customer> list = new ArrayList<>();
        String sql = "select * from Customers where Customers.CustomerName like'%" + c.getCustomerName() + "%'";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                c = new Customer(rs.getInt("CustomerId"), rs.getString("CustomerName"),
                        rs.getString("CustomerPhone"), rs.getString("CustomerAddress"));
                list.add(c);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return list;

    }

}
