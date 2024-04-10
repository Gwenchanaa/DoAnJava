/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import model.Catergory;
import model.Order;

/**
 *
 * @author CUONG
 */
public class DaoCaterory extends DAOCONTENT {

    public List<Catergory> getAll() {
        List<Catergory> list = new ArrayList<>();
        String sql = "SELECT [CategoryID]\n"
                + "      ,[CategoryName]\n"
                + "  FROM [dbo].[Categories]";
        try {

            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Catergory c = new Catergory(rs.getInt("CategoryID"), rs.getString("CategoryName")
                );
                list.add(c);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return list;
    }

    public int insert(Catergory or)  {
        int i = 0;
        String sql = "INSERT INTO [dbo].[Categories]\n"
                + "           ([CategoryID]\n"
                + "           ,[CategoryName])\n"
                + "     VALUES\n"
                + "           (?,?)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);

            st.setInt(1, or.getId());
            st.setString(2, or.getName());

            st.executeUpdate();
            i = 0;
        } catch (SQLException ex) {
            String errorMessage = ex.getMessage();

            if (errorMessage.contains("FOREIGN KEY constraint")) {
                i = 1;
            } else if (errorMessage.contains("PRIMARY KEY constraint")) {
                System.out.println("pro");
                i = 2;
                System.out.println(i);
                System.out.println(errorMessage);

            }
        }
        return i;

    }

    public void delete(Catergory or) {
        String sql = "DELETE FROM [dbo].[Orders]\n"
                + "      WHERE CategoryID= '" + or.getId()+ "'";

        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void update(Catergory ca)  {

        String sql = "UPDATE [dbo].[Categories]\n"
                + "   SET [CategoryID] = ?\n"
                + "      ,[CategoryName] = ?\n"
                + " WHERE CategoryID = '"+ca.getId()+"'";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
         

            st.setInt(1, ca.getId());
            st.setString(2, ca.getName());


            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public List<Catergory> finCustomersByName(Catergory c) {
        List<Catergory> list = new ArrayList<>();
        String sql = "select * from categories where categories.CategoryName like'%" + c.getName()+ "%'";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                c = new Catergory(rs.getInt("CategoryID"), rs.getString("CategoryName"));
                list.add(c);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return list;

    }
}
