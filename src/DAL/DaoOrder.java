/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import model.Customer;
import model.Order;

/**
 *
 * @author CUONG
 */
public class DaoOrder extends DAOCONTENT {

    public List<Order> getAll() {
        List<Order> list = new ArrayList<>();
        String sql = "SELECT [OrderID]\n"
                + "      ,[UserID]\n"
                + "      ,[CustomerID]\n"
                + "      ,[OrderDate]\n"
                + "  FROM [dbo].[Orders]";
        try {

            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Order c = new Order(rs.getString("OrderID"), rs.getString("UserID"),
                        rs.getString("CustomerID"), rs.getString("OrderDate")
                );
                list.add(c);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return list;
    }

    public int insert(Order or) throws ParseException {
        int i = 0;
        String sql = "INSERT INTO [dbo].[Orders]\n"
                + "           ([OrderID]\n"
                + "           ,[UserID]\n"
                + "           ,[CustomerID]\n"
                + "           ,[OrderDate])\n"
                + "     VALUES\n"
                + "           (?,?,?,?)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date utilDate = dateFormat.parse(or.getOrderdate());
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
            st.setString(1, or.getOrderid());
            st.setString(2, or.getUserid());
            st.setString(3, or.getCustomerid());
            st.setDate(4, sqlDate);
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

    public void delete(Order or) {
        String sql = "DELETE FROM [dbo].[Orders]\n"
                + "      WHERE UserId= '" + or.getUserid() + "'";

        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

//    public void update(Order order) {
//
//        String sql = "UPDATE [dbo].[Orders]\n"
//                + "   SET [OrderID] = \n"
//                + "      ,[UserID] = \n"
//                + "      ,[CustomerID] = \n"
//                + "      ,[OrderDate] = \n"
//                + " WHERE ";
//        try {
//            PreparedStatement st = connection.prepareStatement(sql);
//            st.setInt(1, cuss.getCustomerId());
//            st.setString(2, cuss.getCustomerName());
//            st.setString(3, cuss.getCustomerPhone());
//            st.setString(4, cuss.getCustomerAddress());
//
//            st.executeUpdate();
//        } catch (SQLException e) {
//            System.out.println(e);
//        }
//    }
}