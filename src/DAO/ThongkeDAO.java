package DAO;

import DataCon.JDBC;
import Model.Product;
import Model.Receipt;
import Model.ReceiptDetail;
import Model.StatisticProduct;
import Model.StatisticReceipt;
import UI.AdminProduct;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import jdk.dynalink.beans.StaticClass;

public class ThongkeDAO {

    public ArrayList<StatisticProduct> getStatisticProducts(Date start, Date end) {
        ArrayList<StatisticProduct> list = new ArrayList<>();

        try {
            Connection c = JDBC.getConnection();
            PreparedStatement st = c.prepareStatement("SELECT\n"
                    + "    p.ProductID,\n"
                    + "    p.ProductName,\n"
                    + "    p.ProductQuantity,\n"
                    + "    p.ProductPrice,\n"
                    + "    p.ProductImage,\n"
                    + "    p.CategoryID,\n"
                    + "    p.Statuss,\n"
                    + "    SUM(od.OrderPrice) AS TotalPrice,\n"
                    + "    SUM(od.OrderQuantity) AS TotalQuantity\n"
                    + "FROM\n"
                    + "    Products p\n"
                    + "INNER JOIN\n"
                    + "    OrderDetails od ON p.ProductID = od.ProductID\n"
                    + "INNER JOIN\n"
                    + "    Orders o ON od.OrderID = o.OrderID\n"
                    + "WHERE\n"
                    + "    p.Statuss = 1\n"
                    + "    AND o.OrderDate >= ?\n"
                    + "    AND o.OrderDate <= ?\n"
                    + "GROUP BY\n"
                    + "    p.ProductID, p.ProductName, p.ProductQuantity, p.ProductPrice, p.ProductImage, p.CategoryID, p.Statuss");

            // Set the start and end date parameters
            st.setDate(1, new java.sql.Date(start.getTime()));
            st.setDate(2, new java.sql.Date(end.getTime()));

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                String CategoryID = rs.getString("CategoryID");
                String ProductID = rs.getString("ProductID");
                String ProductName = rs.getString("ProductName");
                double ProductPrice = rs.getDouble("ProductPrice");
                int ProductQuantity = rs.getInt("ProductQuantity");
                String ProductImage = rs.getString("ProductImage");
                Product p = new Product(CategoryID, ProductID, ProductName, ProductQuantity, ProductPrice, ProductImage);
                float totalPrice = rs.getFloat("TotalPrice");
                int totalQuantity = rs.getInt("TotalQuantity");
                StatisticProduct sp = new StatisticProduct(p, totalQuantity, totalPrice);
                list.add(sp);
            }

            JDBC.closeConnection(c);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    public ArrayList<StatisticProduct> getStatisticReceipts() {
        ArrayList<StatisticProduct> list1 = new ArrayList<>();

        try {
            Connection c = JDBC.getConnection();
            Statement st = c.createStatement();
            String sql = "SELECT\n"
                    + "    p.*,\n"
                    + "    SUM(od.OrderPrice) AS TotalPrice,\n"
                    + "    SUM(od.OrderQuantity) AS TotalQuantity\n"
                    + "FROM\n"
                    + "    Products p\n"
                    + "INNER JOIN\n"
                    + "    OrderDetails od ON p.ProductID = od.ProductID\n"
                    + "WHERE\n"
                    + "    p.Statuss = 1\n"
                    + "GROUP BY\n"
                    + "    p.ProductID, p.ProductName, p.ProductQuantity, p.ProductPrice, p.ProductImage, p.CategoryID, p.Statuss;";

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String CategoryID = rs.getString("CategoryID");
                String ProductID = rs.getString("ProductID");
                String ProductName = rs.getString("ProductName");
                double ProductPrice = rs.getDouble("ProductPrice");
                int ProductQuantity = rs.getInt("ProductQuantity");
                String ProductImage = rs.getString("ProductImage");
                Product p = new Product(CategoryID, ProductID, ProductName, ProductQuantity, ProductPrice, ProductImage);
                float totalPrice = rs.getFloat("TotalPrice");
                int totalQuantity = rs.getInt("TotalQuantity");
                StatisticProduct sp = new StatisticProduct(p, totalQuantity, totalPrice);
                list1.add(sp);

            }

            JDBC.closeConnection(c);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list1;
    }

// Import necessary packages and classes
    public ArrayList<StatisticReceipt> getStatisticDetailsReceipt(Date start, Date end) {
        ArrayList<StatisticReceipt> list2 = new ArrayList<>();

        try {
            Connection c = JDBC.getConnection();
            PreparedStatement st = c.prepareStatement("SELECT\n"
                    + "  Receipts.ReceiptID,\n"
                    + "  Receipts.ReceiptCompany,\n"
                    + "  Products.ProductName,\n"
                    + "  SUM(ReceiptDetails.ReceiptQuantity) AS TotalQuantity,\n"
                    + "  SUM(ReceiptDetails.ReceiptPrice) AS TotalPrice\n"
                    + "FROM\n"
                    + "  Receipts\n"
                    + "JOIN\n"
                    + "  ReceiptDetails ON Receipts.ReceiptID = ReceiptDetails.ReceiptID\n"
                    + "JOIN\n"
                    + "  Products ON ReceiptDetails.ProductID = Products.ProductID\n"
                    + "WHERE\n"
                    + "  Receipts.Statuss = 1\n"
                    + "  AND Receipts.ReceiptDate>= ?\n"
                    + "  AND Receipts.ReceiptDate <= ?\n"
                    + "GROUP BY\n"
                    + "  Receipts.ReceiptID,\n"
                    + "  Receipts.ReceiptCompany,\n"
                    + "  Products.ProductName");

            // Set the start and end date parameters
            st.setDate(1, new java.sql.Date(start.getTime()));
            st.setDate(2, new java.sql.Date(end.getTime()));

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                String ReceiptID = rs.getString("ReceiptID");
                String ReceiptCompany = rs.getString("ReceiptCompany");
                String ProductName = rs.getString("ProductName");
                double TotalPrice = rs.getDouble("TotalPrice");
                int TotalQuantity = rs.getInt("TotalQuantity");
                Receipt r = new Receipt(ReceiptID, ReceiptCompany, ReceiptID, ReceiptID);
                Product p = new Product(ProductName, ProductName, TotalQuantity, TotalPrice);
                StatisticReceipt re = new StatisticReceipt(r, p, TotalQuantity, TotalPrice);
                list2.add(re);
            }

            JDBC.closeConnection(c);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list2;
    }

    public static void main(String[] args) {
        ThongkeDAO tk = new ThongkeDAO();
        ArrayList<StatisticProduct> list = tk.getStatisticProducts(null, null);
        for (StatisticProduct sp : list) {
            System.out.println(sp.toString());
        }
        ArrayList<StatisticReceipt> list2 = tk.getStatisticDetailsReceipt(null, null);
        for (StatisticReceipt re : list2) {
            System.out.println(re.toString());
        }
    }

//    public ArrayList<StatisticReceipt> getStatisticReceipts(Date bd, Date kt) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
}
