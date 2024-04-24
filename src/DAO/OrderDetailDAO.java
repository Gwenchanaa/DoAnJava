package DAO;

import DataCon.JDBC;
import Model.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class OrderDetailDAO {

    public static OrderDetailDAO getInstance() {
        return new OrderDetailDAO();
    }

    public int add(OrderDetail t) {
        int i = 0;
        try {
            Connection c = JDBC.getConnection();
            Statement st = c.createStatement();
            String sql = "insert into OrderDetails(OrderID, ProductID, OrderQuantity, OrderPrice) "
                    + "values('" + t.getOrderID() + "', '" + t.getProductID() + "', '" + t.getOrderQuantity()
                    + "', '" + t.getOrderPrice() + "') ";
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

    public int deleteTable1(String OrderID) {
        try {
            Connection c = JDBC.getConnection();
            Statement st = c.createStatement();
            String sql = "delete  from OrderDetails "
                    + "where ProductID = '" + OrderID + "'";
            System.out.println(sql);
            int kq = st.executeUpdate(sql);
            System.out.println(kq + " thay doi");
            if (kq != 0) {
                JOptionPane.showMessageDialog(null, "Xóa thành công ", "DELETE SUCCESS", JOptionPane.INFORMATION_MESSAGE);
            }
            JDBC.closeConnection(c);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    public ArrayList<OrderDetail> getDataForRightTable(String s) {
        ArrayList<OrderDetail> list = new ArrayList<>();
        try {
            Connection c = JDBC.getConnection();
            Statement st = c.createStatement();
            String sql = "select * "
                    + "from OrderDetails "
                    + "where OrderID = '" + s + "'";

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String OrderID = rs.getString("OrderID");
                String ProductID = rs.getString("ProductID");
                int OrderQuantity = rs.getInt("OrderQuantity");
                double OrderPrice = rs.getDouble("OrderPrice");
                OrderDetail r = new OrderDetail(OrderID, ProductID, OrderPrice, OrderQuantity);
                list.add(r);
            }

            JDBC.closeConnection(c);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public int UpdateProduct(String s) {
        try {
            Connection c = JDBC.getConnection();
            Statement st = c.createStatement();
            String sql = "update [dbo].[Products]\n"
                    + "set ProductQuantity = ProductQuantity - r.OrderQuantity\n"
                    + "from [dbo].[Products] as p\n"
                    + "join [dbo].[OrderDetails] as r\n"
                    + "on p.ProductID = r.ProductID "
                    + "where OrderID = '" + s + "'";

            int kq = st.executeUpdate(sql);
            JDBC.closeConnection(c);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public ArrayList<Object[]> BillHoaDon(String ID) {
        ArrayList<Object[]> list = new ArrayList<>();
        try {
            Connection c = JDBC.getConnection();
            Statement St = c.createStatement();
            String sql = "select ProductName, OrderQuantity, OrderPrice \n"
                    + "from (OrderDetails as con \n"
                    + "join Orders as cha\n"
                    + "on cha.OrderID = con.OrderID)\n"
                    + "join Products as p\n"
                    + "on p.ProductID = con.ProductID "
                    + "where cha.OrderID = '" + ID + "' ";

            ResultSet rs = St.executeQuery(sql);
            while (rs.next()) {
                String name = rs.getString("ProductName");
                int sl = rs.getInt("OrderQuantity");
                double gia = rs.getDouble("OrderPrice");

                list.add(new Object[]{name, sl, gia});

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public int deleteHoaDon(String OrderID) {
        try {
            Connection c = JDBC.getConnection();
            Statement st = c.createStatement();
            String sql = "update Products\n"
                    + "set ProductQuantity = ProductQuantity + OrderQuantity\n"
                    + "FROM (Orders\n"
                    + "JOIN OrderDetails \n"
                    + "ON Orders.OrderID = OrderDetails.OrderID)\n"
                    + "join Products\n"
                    + "on OrderDetails.ProductID = Products.ProductID \n"
                    + "where Orders.OrderID = '" + OrderID + "'";
            System.out.println(sql);
            int kq = st.executeUpdate(sql);
            System.out.println(kq + " thay doi");
            if (kq != 0) {
                JOptionPane.showMessageDialog(null, "Hoàn hàng", "CANCEL SUCCESS", JOptionPane.INFORMATION_MESSAGE);
            }
            JDBC.closeConnection(c);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    public int delete(String OrderID) {
        try {
            Connection c = JDBC.getConnection();
            Statement st = c.createStatement();
            String sql = "delete from OrderDetails "
                    + "where OrderID = '" + OrderID + "'";
            System.out.println(sql);
            int kq = st.executeUpdate(sql);
            System.out.println(kq + " thay doi");
            if (kq != 0) {
                JOptionPane.showMessageDialog(null, "Xóa thành công ", "DELETE SUCCESS", JOptionPane.INFORMATION_MESSAGE);
            }
            JDBC.closeConnection(c);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
    }
}
