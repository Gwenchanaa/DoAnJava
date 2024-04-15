package DAO;

import DataCon.JDBC;
import Model.Product;
import Model.Receipt;
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
            Statement st = c.createStatement();
            String sql = "SELECT \n"
                    + "    p.*,\n"
                    + "    SUM(od.TotalPrice) AS TotalPrice,\n"
                    + "    SUM(od.TotalQuantity) AS TotalQuantity\n"
                    + "FROM \n"
                    + "    Products p\n"
                    + "INNER JOIN \n"
                    + "    OrderDetails od ON p.ProductID = od.ProductID\n"
                    + "GROUP BY \n"
                    + "    p.ProductID, p.ProductName, p.ProductQuantity, p.ProductPrice, p.ProductImage, p.CategoryID;";

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
                list.add(sp);

            }

            JDBC.closeConnection(c);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    public ArrayList<StatisticReceipt> getStatisticReceipts(Date start, Date end) {
        ArrayList<StatisticReceipt> list1 = new ArrayList<>();

        try {
            Connection c = JDBC.getConnection();
            Statement st = c.createStatement();
            String sql = "SELECT \n"
                    + "    p.ProductID,\n"
                    + "    p.ProductName,\n"
                    + "    p.ProductImage,\n"
                    + "    p.CategoryID,\n"
                    + "    SUM(rd.ReceiptQuantity) AS TotalReceiptQuantity,\n"
                    + "    SUM(rd.ReceiptPrice) AS TotalReceiptPrice\n"
                    + "FROM \n"
                    + "    ReceiptDetails rd\n"
                    + "INNER JOIN \n"
                    + "    Products p ON rd.ProductID = p.ProductID\n"
                    + "GROUP BY \n"
                    + "    p.ProductID, p.ProductName, p.ProductImage, p.CategoryID;";

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String ReceiptID = rs.getString("ReceiptID");
                String ProductID = rs.getString("ProductID");
                String ProductName = rs.getString("ProductName");
//                double ReceiptPrice = rs.getDouble("ReceiptPrice");
//                int ReceiptQuantity = rs.getInt("ReceiptQuantity");
                float ReceiptPrice = rs.getFloat("ReceiptPrice");
                int ReceiptQuantity = rs.getInt("ReceiptQuantity");
                String ProductImage = rs.getString("ProductImage");
//                Receipt r = new Receipt(ReceiptID, ProductID, ProductName, ReceiptQuantity);
          
//                StatisticReceipt rec = new StatisticReceipt(r, ReceiptQuantity, ReceiptPrice);
//                list1.add(rec);

            }

            JDBC.closeConnection(c);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list1;
    }

    public static void main(String[] args) {
        ThongkeDAO tk = new ThongkeDAO();
        ArrayList<StatisticProduct> list = tk.getStatisticProducts(null, null);
        for (StatisticProduct sp : list) {
            System.out.println(sp.toString());
        }
    }

//    public ArrayList<StatisticReceipt> getStatisticReceipts(Date bd, Date kt) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
}
