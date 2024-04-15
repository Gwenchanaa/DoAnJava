package DAO;

import DataCon.JDBC;
import Model.Product;
import Model.StatisticProduct;
import Model.StatisticReceipt;
import UI.AdminProduct;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Date;

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
            System.out.println(sql);
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

    public static void main(String[] args) {
        ThongkeDAO tk = new ThongkeDAO();
        ArrayList<StatisticProduct> list = tk.getStatisticProducts(null, null);
        for (StatisticProduct sp : list) {
            System.out.println(sp.toString());
        }
    }

    public ArrayList<StatisticReceipt> getStatisticReceipts(Date bd, Date kt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
