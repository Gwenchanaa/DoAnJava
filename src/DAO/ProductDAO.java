package DAO;

import DataCon.JDBC;
import Model.Product;
import UI.AdminProduct;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ProductDAO {

    public static ProductDAO getInstance() {
        return new ProductDAO();
    }

    public int add(Product t) {
        int i = 0; // để xác định lỗi của text nào và set LabelThongBao về rỗng
        try {
            Connection c = JDBC.getConnection();
            Statement st = c.createStatement();
            String sql = "insert into Products(CategoryID, ProductID, ProductName, ProductQuantity, ProductPrice, ProductImage) "
                    + "values('" + t.getCategoryID() + "', '" + t.getProductID() + "', '" + t.getProductName()
                    + "', '" + t.getProductQuantity() + "', '" + t.getPrice() + "', '" + t.getProductImage() + "') ";
            System.out.println(sql);
            int kq = st.executeUpdate(sql);
            System.out.println(kq + " thay doi");
            JDBC.closeConnection(c);
            i = 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            String errorMessage = ex.getMessage();

            if (errorMessage.contains("FOREIGN KEY constraint")) {
                i = 1;
            } else if (errorMessage.contains("PRIMARY KEY constraint")) {
                System.out.println("pro");
                i = 2;
            }
        }
        return i;
    }

    public int update(Product t) {
        try {
            Connection c = JDBC.getConnection();
            Statement st = c.createStatement();
            String sql = "update Products "
                    + "set "
                    + "CategoryID = '" + t.getCategoryID() + "', "
                    + "ProductName = '" + t.getProductName() + "', "
                    + "ProductQuantity = '" + t.getProductQuantity() + "', "
                    + "ProductPrice = '" + t.getPrice() + "', "
                    + "ProductImage = '" + t.getProductImage() + "' "
                    + "where ProductID = '" + t.getProductID() + "'";
            System.out.println(sql);
            int kq = st.executeUpdate(sql);
            System.out.println(kq + " thay đổi");
            JDBC.closeConnection(c);
            if (kq == 0) {
                JOptionPane.showMessageDialog(null, "Không tồn tại "+t.getProductID(), "INPUT WRONG", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Sửa thành công " + t.getProductID(), "UPDATE SUCCESS", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    public int delete(Product t) {
        try {
            Connection c = JDBC.getConnection();
            Statement st = c.createStatement();
            String sql = "delete  from Products "
                    + "where ProductID = '" + t.getProductID() + "' and CategoryID = '" + t.getCategoryID() + "' ";
            System.out.println(sql);
            int kq = st.executeUpdate(sql);
            System.out.println(kq + " thay doi");
            if (kq != 0) {
                JOptionPane.showMessageDialog(null, "Xóa thành công " + t.getProductID(), "DELETE SUCCESS", JOptionPane.INFORMATION_MESSAGE);
            }
            JDBC.closeConnection(c);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    public ArrayList<Product> searh(ArrayList<String> list) {
        ArrayList<Product> searchResult = new ArrayList<>();
        try {
            Connection c = JDBC.getConnection();
            Statement st = c.createStatement();
            String sql = "select *  from Products "
                    + "where CategoryID like '%" + list.get(0) + "' and ProductID like '%" + list.get(1) + "' and ProductName like '%"
                    + list.get(2) + "'"
                    + " and ProductImage like '" + list.get(5) + "' "
                    + "or CategoryID like '%" + list.get(0) + "%' and ProductID like '%" + list.get(1) + "%' and ProductName like '%"
                    + list.get(2) + "%'"
                    + " and ProductImage like '%" + list.get(5) + "'";
            System.out.println(sql);
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String idCate = rs.getString("CategoryID");
                String id = rs.getString("ProductID");
                String name = rs.getString("ProductName");
                double price = rs.getDouble("ProductPrice");
                int quantity = rs.getInt("ProductQuantity");
                String path = rs.getString("ProductImage");
                Product p = new Product(idCate, id, name, quantity, price, path);
                searchResult.add(p);
            }
            JDBC.closeConnection(c);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return searchResult;
    }

    public ArrayList<Product> getDataFromTable() {
        ArrayList<Product> list = new ArrayList<>();

        try {
            Connection c = JDBC.getConnection();
            Statement st = c.createStatement();
            String sql = "select * from Products";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String CategoryID = rs.getString("CategoryID");
                String ProductID = rs.getString("ProductID");
                String ProductName = rs.getString("ProductName");
                double ProductPrice = rs.getDouble("ProductPrice");
                int ProductQuantity = rs.getInt("ProductQuantity");
                String ProductImage = rs.getString("ProductImage");
                Product p = new Product(CategoryID, ProductID, ProductName, ProductQuantity, ProductPrice, ProductImage);
                list.add(p);
            }

            JDBC.closeConnection(c);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

//    public ArrayList<Product> searchFunction(String idS, String nameS, double priceS, int key, int keyProperty) {
//        ArrayList<Product> list = new ArrayList<>();
//
//        try {
//            Connection c = JDBC.getConnection();
//            Statement st = c.createStatement();
//            String sql = "select * from Products ";
//            if( key == 3){
//                sql = sql + "where ProductID = '" + idS +"' and ProductName like '%" + nameS +"%' and ProductPrice = " + priceS;
//            }
//            
//            if ( key == 1 && keyProperty == 1){
//                sql = sql + "where ProductID = '" + idS +"' ";
//            } 
//            if ( key == 1 && keyProperty == 2){
//                sql = sql + "where ProductName like '%" + nameS +"%' ";
//            } 
//            if ( key == 1 && keyProperty == 3){
//                sql = sql + "where ProductPrice = " + priceS;
//            } 
//            ResultSet rs = st.executeQuery(sql);
//            System.out.println(sql);
//            while (rs.next()) {
//                String id = rs.getString("ProductID");
//                String name = rs.getString("ProductName");
//                double price = rs.getDouble("ProductPrice");
//                int quantity = rs.getInt("ProductQuantity");
//                String path = rs.getString("ProductImage");
//                Product p = new Product(id,name,price,quantity,path);
//                list.add(p);
//            }
//            
//            JDBC.closeConnection(c);
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        return list;
//    }
}
