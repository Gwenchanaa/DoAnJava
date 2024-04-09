/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Customer;

/**
 *
 * @author CUONG
 */
public class DaoOrder extends DAOCONTENT{
    public List<Customer> getAll() {
        List<Customer> list = new ArrayList<>();
        String sql = "SELECT TOP (1000) [MAKH]\n"
                + "      ,[HOKH]\n"
                + "      ,[TENLOT]\n"
                + "      ,[TENKH]\n"
                + "      ,[PASSWD]\n"
                + "      ,[SDT]\n"
                + "      ,[EMAIL]\n"
                + "      ,[MADONHANG]\n"
                + "  FROM [DATABASE].[dbo].[KHACHHANG]";
        try {

            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Customer c = new Customer(rs.getInt("MAKH"), rs.getString("HOKH"),
                        rs.getString("TENLOT"), rs.getString("TENKH"),
                        rs.getString("PASSWD"), rs.getString("SDT"), rs.getString("Email"),
                        rs.getInt("MADONHANG"));
                list.add(c);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return list;
    }
    
}
