package DAO;

import DataCon.JDBC;
import Model.*;
import java.sql.*;
import java.util.ArrayList;

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

    public String creatReceiptID() {
        String i = "";
        try {
            Connection c = JDBC.getConnection();
            Statement st = c.createStatement();
            String sql = "select count(*) as num "
                    + "from Receipts ";
            System.out.println(sql);
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                int count = rs.getInt("num");
                i = "PN" + count;
            }
            JDBC.closeConnection(c);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return i;
    }
}
