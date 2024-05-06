package DAO;

import DataCon.JDBC;
import Model.Product;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProductDAO {

    public static ProductDAO getInstance() {
        return new ProductDAO();
    }

    public int add(Product t) {
        int i = 0; // để xác định lỗi của text nào và set LabelThongBao về rỗng
        try {
            Connection c = JDBC.getConnection();
            String sql = "insert into Products(CategoryID, ProductID, ProductName, ProductQuantity, ProductPrice, ProductImage) "
                    + "values(?, ?, ?, ?, ?, ?) "
                    + "update Products "
                    + "set Statuss = 1 "
                    + "where ProductID = '" + t.getProductID()+"'";

            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, t.getCategoryID());
            ps.setString(2, t.getProductID());
            ps.setString(3, t.getProductName());
            ps.setInt(4, t.getProductQuantity());
            ps.setDouble(5, t.getPrice());
            ps.setString(6, t.getProductImage());

            int kq = ps.executeUpdate();
            JDBC.closeConnection(c);
            i = 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            String errorMessage = ex.getMessage();

            if (errorMessage.contains("FOREIGN KEY constraint")) {
                i = 1;
            } else if (errorMessage.contains("PRIMARY KEY constraint")) {
//                System.out.println("pro");
                i = 2;
            }
        }
        return i;
    }

    public int update(Product t) {
        try {
            Connection c = JDBC.getConnection();
            String sql = "update Products "
                    + "set "
                    + "CategoryID = ?, "
                    + "ProductName = ?, "
                    + "ProductQuantity = ?, "
                    + "ProductPrice = ?, "
                    + "ProductImage = ? "
                    + "where ProductID = ?";

            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, t.getCategoryID());
            ps.setString(2, t.getProductName());
            ps.setInt(3, t.getProductQuantity());
            ps.setDouble(4, t.getPrice());
            ps.setString(5, t.getProductImage());
            ps.setString(6, t.getProductID());

            int kq = ps.executeUpdate();
            JDBC.closeConnection(c);
            if (kq == 0) {
                JOptionPane.showMessageDialog(null, "Không tồn tại " + t.getProductID(), "INPUT WRONG", JOptionPane.WARNING_MESSAGE);
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
//            System.out.println(sql);
            int kq = st.executeUpdate(sql);
//            System.out.println(kq + " thay doi");
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
                    + "where CategoryID like '%" + list.get(0) + "%' and ProductID like '%" + list.get(1) + "%' and ProductName like '%"
                    + list.get(2) + "%' and ProductQuantity like '%" + list.get(3) + "%' and ProductPrice like '%" + list.get(4) + "%'";

//            System.out.println(sql);
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

    public String getImagePath(String ProductID) {
        String path = "";
        try {
            Connection c = JDBC.getConnection();
            Statement st = c.createStatement();
            String sql = "select ProductImage "
                    + "from Products "
                    + "where ProductID = '" + ProductID + "'";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                path = rs.getString("ProductImage");
            }
            JDBC.closeConnection(c);
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("ProductDAO getImagePath");
        }
        return path;
    }

    public String createProductID() {
        String id = "";
        try {
            Connection c = JDBC.getConnection();
            Statement st = c.createStatement();
            String sql = "SELECT COUNT(*) AS id\n"
                    + "FROM Products";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                id = rs.getString("id");
            }
            int intId = Integer.parseInt(id);
            intId = intId + 1;

            id = "pro" + String.valueOf(intId);
            JDBC.closeConnection(c);
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("ProductDAO createProductID");
        }
        return id;
    }

    public ArrayList<String> getCategories() {
        ArrayList<String> list = new ArrayList<>();
        try {
            Connection c = JDBC.getConnection();
            Statement st = c.createStatement();
            String sql = "SELECT CategoryID "
                    + "FROM Categories";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String cate = rs.getString("CategoryID");
                list.add(cate);
            }
            list.add("");
            JDBC.closeConnection(c);
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("ProductDAO getCategories");
        }
        return list;
    }

    public String getNameProductFromID(String id) {
        String name = "";
        try {
            Connection c = JDBC.getConnection();
            Statement st = c.createStatement();
            String sql = "SELECT ProductName "
                    + "FROM Products "
                    + "where ProductID = '" + id + "'";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                name = rs.getString("ProductName");
            }
            JDBC.closeConnection(c);
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("ProductDAO getNameProductFromID");
        }
        return name;
    }
}
