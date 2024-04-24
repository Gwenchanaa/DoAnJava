package DAO;

import DataCon.JDBC;
import Model.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class OrderDAO {

    public static OrderDAO getInstance() {
        return new OrderDAO();
    }

    public ArrayList<Product> getDataForLeftTable() {
        ArrayList<Product> list = new ArrayList<>();
        try {
            Connection c = JDBC.getConnection();
            Statement st = c.createStatement();
            String sql = "select ProductID, ProductName, ProductQuantity,ProductPrice from Products";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String ProductID = rs.getString("ProductID");
                String ProductName = rs.getString("ProductName");
                int ProductQuantity = rs.getInt("ProductQuantity");
                double ProductPrice = rs.getDouble("ProductPrice");
                Product p = new Product(ProductID, ProductName, ProductQuantity, ProductPrice);
                p.toString();
                list.add(p);
            }
            JDBC.closeConnection(c);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public int add(Order t) {
        int i = 0;
        try {
            Connection c = JDBC.getConnection();
            Statement st = c.createStatement();
            String sql = "insert into Orders(OrderID, UserID, CustomerID, OrderDate) "
                    + "values('" + t.getOrderID() + "', '" + t.getUserID() + "', '" + t.getCustomerID()
                    + "', '" + t.getOrderDate() + "') ";
            System.out.println(sql);
            int kq = st.executeUpdate(sql);
            System.out.println(kq + " thay doi");
            JDBC.closeConnection(c);
            i = 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return i;
    }

    public String creatOrderID() {
        String i = "";
        try {
            Connection c = JDBC.getConnection();
            Statement st = c.createStatement();
            String sql = "select top 1 OrderID\n"
                    + "from Orders\n"
                    + "order by OrderID desc ";
            System.out.println(sql);
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                String a = rs.getString("OrderID");
                a = a.substring(6);
                int num = Integer.valueOf(a);
                num++;
                i = "HD" + num;
            }
            if (i.equals("")) {
                i = "HD0";
            }
            JDBC.closeConnection(c);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return i;
    }

    // cho cột tổng bill vô
    public int updateOrderTotalPrice(String OrderID, double OrderPrice) {
        try {
            Connection c = JDBC.getConnection();
            Statement st = c.createStatement();
            String sql = "update Orders "
                    + "set "
                    + "TotalPrice = '" + OrderPrice + "' "
                    + "where OrderID = '" + OrderID + "'";
            System.out.println(sql);
            int kq = st.executeUpdate(sql);
            System.out.println(kq + " thay đổi");
            JDBC.closeConnection(c);
//            if (kq == 0) {
//                JOptionPane.showMessageDialog(null, "Không tồn tại " + t.getProductID(), "INPUT WRONG", JOptionPane.WARNING_MESSAGE);
//            } else {
//                JOptionPane.showMessageDialog(null, "Sửa thành công " + t.getProductID(), "UPDATE SUCCESS", JOptionPane.INFORMATION_MESSAGE);
//            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    public ArrayList<Order> getDataForTableOrder() {
        ArrayList<Order> list = new ArrayList<>();
        try {
            Connection c = JDBC.getConnection();
            Statement st = c.createStatement();
            String sql = "select * from Orders";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String OrderID = rs.getString("OrderID");
                String UserID = rs.getString("UserID");
                String CustomerID = rs.getString("CustomerID");
                String OrderDate = rs.getDate("OrderDate").toString();
                Order r = new Order(OrderID, UserID, CustomerID, OrderDate);
                r.toString();
                list.add(r);
            }
            JDBC.closeConnection(c);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public String DisplayBillOrder(String ID) {
        String moneyStr = "";
        try {
            Connection c = JDBC.getConnection();
            Statement st = c.createStatement();
            String sql = "select TotalPrice from Orders\n"
                    + "where OrderID = '" + ID + "'";
            System.out.println(sql);
            ResultSet rs = st.executeQuery(sql);
            rs.next();
            double money = rs.getDouble("TotalPrice");
            moneyStr = String.valueOf(money);
            moneyStr = moneyStr + " Đ";
            JDBC.closeConnection(c);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return moneyStr;
    }

    public int update(Order r) {
        try {
            Connection c = JDBC.getConnection();
            Statement st = c.createStatement();
            String sql = "update Orders "
                    + "set "
                    + "CustomerID = '" + r.getCustomerID() + "', "
                    + "UserID = '" + r.getUserID() + "', "
                    + "OrderDate = '" + r.getOrderDate() + "' "
                    + "where OrderID = '" + r.getOrderID() + "'";
            System.out.println(sql);
            int kq = st.executeUpdate(sql);
            System.out.println(kq + " thay đổi");
            JDBC.closeConnection(c);
            if (kq != 0) {
                JOptionPane.showMessageDialog(null, "Sửa thành công " + r.getOrderID(), "UPDATE SUCCESS", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    public int delete(Order r) {
        try {
            Connection c = JDBC.getConnection();
            Statement st = c.createStatement();
            String sql = "delete  from Orders "
                    + "where OrderID = '" + r.getOrderID() + "' ";
            System.out.println(sql);
            int kq = st.executeUpdate(sql);
            System.out.println(kq + " thay doi");
            if (kq != 0) {
//                JOptionPane.showMessageDialog(null, "Xóa thành công", "DELETE SUCCESS", JOptionPane.INFORMATION_MESSAGE);
            }
            JDBC.closeConnection(c);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
    }
}
