package DAO;

import DataCon.JDBC;
import Model.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ReceiptDAO {

    public static ReceiptDAO getInstance() {
        return new ReceiptDAO();
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

    public int add(Receipt t) {
        int i = 0;
        try {
            Connection c = JDBC.getConnection();
            Statement st = c.createStatement();
            String sql = "insert into Receipts(ReceiptID, ReceiptCompany, UserID, ReceiptDate) "
                    + "values('" + t.getReceiptID() + "', '" + t.getReceiptCompany() + "', '" + t.getUserID()
                    + "', '" + t.getReceiptDate() + "') ";
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

    public int delete(Receipt r) {
        try {
            Connection c = JDBC.getConnection();
            Statement st = c.createStatement();
            String sql = "delete  from Receipts "
                    + "where ReceiptID = '" + r.getReceiptID() + "' ";
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

    public String creatReceiptID() {
        String i = "";
        try {
            Connection c = JDBC.getConnection();
            Statement st = c.createStatement();
            String sql = "select top 1 ReceiptID\n"
                    + "from Receipts\n"
                    + "order by ReceiptID desc ";
            System.out.println(sql);
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                String a = rs.getString("ReceiptID");
                a = a.substring(2);
                int num = Integer.valueOf(a);
                num++;
                i = "PN" + num;
            }
            if (i.equals("")) {
                i = "PN0";
            }
            JDBC.closeConnection(c);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return i;
    }

    // cho cột tổng bill vô
    public int updateReceiptTotalPrice(String ReceiptID, double ReceiptPrice) {
        try {
            Connection c = JDBC.getConnection();
            Statement st = c.createStatement();
            String sql = "update Receipts "
                    + "set "
                    + "TotalPrice = '" + ReceiptPrice + "' "
                    + "where ReceiptID = '" + ReceiptID + "'";
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

    public int update(Receipt r) {
        try {
            Connection c = JDBC.getConnection();
            Statement st = c.createStatement();
            String sql = "update Receipts "
                    + "set "
                    + "ReceiptCompany = '" + r.getReceiptCompany() + "', "
                    + "UserID = '" + r.getUserID() + "', "
                    + "ReceiptDate = '" + r.getReceiptDate() + "' "
                    + "where ReceiptID = '" + r.getReceiptID() + "'";
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

    public ArrayList<Receipt> getDataForTableReceipt() {
        ArrayList<Receipt> list = new ArrayList<>();
        try {
            Connection c = JDBC.getConnection();
            Statement st = c.createStatement();
            String sql = "select * from Receipts";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String ReceiptID = rs.getString("ReceiptID");
                String ReceiptCompany = rs.getString("ReceiptCompany");
                String UserID = rs.getString("UserID");
                String ReceiptDate = rs.getDate("ReceiptDate").toString();
                Receipt r = new Receipt(ReceiptID, ReceiptCompany, UserID, ReceiptDate);
                r.toString();
                list.add(r);
            }
            JDBC.closeConnection(c);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public String DisplayBillReceipt(String ID) {
        String moneyStr = "";
        try {
            Connection c = JDBC.getConnection();
            Statement st = c.createStatement();
            String sql = "select TotalPrice from Receipts\n"
                    + "where ReceiptID = '"+ID+"'";
            System.out.println(sql);
            ResultSet rs = st.executeQuery(sql);
            rs.next();
            double money = rs.getDouble("TotalPrice");
            moneyStr = String.valueOf(money);
            moneyStr = moneyStr +" Đ";
            JDBC.closeConnection(c);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return moneyStr;
    }
}
