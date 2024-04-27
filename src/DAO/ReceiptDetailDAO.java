package DAO;

import DataCon.JDBC;
import Model.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ReceiptDetailDAO {

    public static ReceiptDetailDAO getInstance() {
        return new ReceiptDetailDAO();
    }

    public int add(ReceiptDetail t) {
        int i = 0;
        try {
            Connection c = JDBC.getConnection();
            Statement st = c.createStatement();
            String sql = "insert into ReceiptDetails(ReceiptID, ProductID, ReceiptQuantity, ReceiptPrice) "
                    + "values('" + t.getReceiptID() + "', '" + t.getProductID() + "', '" + t.getReceiptQuantity()
                    + "', '" + t.getReceiptPrice() + "') ";
//            System.out.println(sql);
            int kq = st.executeUpdate(sql);
//            System.out.println(kq + " thay doi");
            JDBC.closeConnection(c);
            i = 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return i;
    }

    public int deleteTable1(String ReceiptID) {
        try {
            Connection c = JDBC.getConnection();
            Statement st = c.createStatement();
            String sql = "delete  from ReceiptDetails "
                    + "where ProductID = '" + ReceiptID + "'";
//            System.out.println(sql);
            int kq = st.executeUpdate(sql);
//            System.out.println(kq + " thay doi");
            if (kq != 0) {
                JOptionPane.showMessageDialog(null, "Xóa thành công ", "DELETE SUCCESS", JOptionPane.INFORMATION_MESSAGE);
            }
            JDBC.closeConnection(c);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    public int updateTable1(String ReceiptID, String num) {
        try {
            Connection c = JDBC.getConnection();
            Statement st = c.createStatement();
            String sql = "update ReceiptDetails "
                    + "set ReceiptQuantity =" + num
                    + " where ProductID = '" + ReceiptID + "'";
//            System.out.println(sql);
            int kq = st.executeUpdate(sql);
//            System.out.println(sql);
//            System.out.println(kq + " thay doi");
            if (kq != 0) {
                JOptionPane.showMessageDialog(null, "Sửa thành công ", "UPDATE SUCCESS", JOptionPane.INFORMATION_MESSAGE);
            }
            JDBC.closeConnection(c);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    public int delete(String ReceiptID) {
        try {
            Connection c = JDBC.getConnection();
            Statement st = c.createStatement();
            String sql = "update  ReceiptDetails "
                    + "set ReceiptQuantity = 0"
                    + "where ReceiptID = '" + ReceiptID + "'";
//            System.out.println(sql);
            int kq = st.executeUpdate(sql);
//            System.out.println(kq + " thay doi");
            if (kq != 0) {
//                JOptionPane.showMessageDialog(null, "Xóa thành công ", "DELETE SUCCESS", JOptionPane.INFORMATION_MESSAGE);
            }
            JDBC.closeConnection(c);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    public ArrayList<ReceiptDetail> getDataForRightTable(String s) {
        ArrayList<ReceiptDetail> list = new ArrayList<>();
        try {
            Connection c = JDBC.getConnection();
            Statement st = c.createStatement();
            String sql = "select * "
                    + "from ReceiptDetails "
                    + "where ReceiptID = '" + s + "'";

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String ReceiptID = rs.getString("ReceiptID");
                String ProductID = rs.getString("ProductID");
                int ReceiptQuantity = rs.getInt("ReceiptQuantity");
                double ReceiptPrice = rs.getDouble("ReceiptPrice");
                ReceiptDetail r = new ReceiptDetail(ReceiptID, ProductID, ReceiptQuantity, ReceiptPrice);
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
                    + "set ProductQuantity = ProductQuantity + r.ReceiptQuantity\n"
                    + "from [dbo].[Products] as p\n"
                    + "join [dbo].[ReceiptDetails] as r\n"
                    + "on p.ProductID = r.ProductID "
                    + "where ReceiptID = '" + s + "'";

            int kq = st.executeUpdate(sql);
            JDBC.closeConnection(c);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public ArrayList<Object[]> BillPhieuNhap(String ID) {
        ArrayList<Object[]> list = new ArrayList<>();
        try {
            Connection c = JDBC.getConnection();
            Statement St = c.createStatement();
            String sql = "select ProductName, ReceiptQuantity, ReceiptPrice \n"
                    + "from (ReceiptDetails as con \n"
                    + "join Receipts as cha\n"
                    + "on cha.ReceiptID = con.ReceiptID)\n"
                    + "join Products as p\n"
                    + "on p.ProductID = con.ProductID "
                    + "where cha.ReceiptID = '" + ID + "' ";

            ResultSet rs = St.executeQuery(sql);
            while (rs.next()) {
                String name = rs.getString("ProductName");
                int sl = rs.getInt("ReceiptQuantity");
                double gia = rs.getDouble("ReceiptPrice");

                list.add(new Object[]{name, sl, gia});

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public int deletePhieuNhap(String ReceiptID) {
        try {
            Connection c = JDBC.getConnection();
            Statement st = c.createStatement();
            String sql = "update Products\n"
                    + "set ProductQuantity = ProductQuantity - ReceiptQuantity\n"
                    + "FROM (Receipts\n"
                    + "JOIN ReceiptDetails \n"
                    + "ON Receipts.ReceiptID = ReceiptDetails.ReceiptID)\n"
                    + "join Products\n"
                    + "on ReceiptDetails.ProductID = Products.ProductID \n"
                    + "where Receipts.ReceiptID = '" + ReceiptID + "'";
//            System.out.println(sql);
            int kq = st.executeUpdate(sql);
//            System.out.println(kq + " thay doi");
            if (kq != 0) {
                JOptionPane.showMessageDialog(null, "Hoàn hàng", "CANCEL SUCCESS", JOptionPane.INFORMATION_MESSAGE);
            }
            JDBC.closeConnection(c);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
    }
}
