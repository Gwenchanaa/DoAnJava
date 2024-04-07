package DAO;

import DataCon.JDBC;
import Model.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
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

    public int delete(String ProductID) {
        try {
            Connection c = JDBC.getConnection();
            Statement st = c.createStatement();
            String sql = "delete  from ReceiptDetails "
                    + "where ProductID = '" + ProductID + "'";
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
                    + "where ReceiptID = '" + s +"'";

            int kq = st.executeUpdate(sql);
            JDBC.closeConnection(c);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
