  package Model;

import DataCon.JDBC;
import Model.Product;
import UI.AdminProduct;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class StatisticProduct {

    private Product product;
     
    private Integer quanity;
    private Float income;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "ThongkeDAO{" + "product=" + product + ", quanity=" + quanity + ", income=" + income + '}';
    }

    public Integer getQuanity() {
        return quanity;
    }

    public void setQuanity(Integer quanity) {
        this.quanity = quanity;
    }

    public Float getIncome() {
        return income;
    }

    public void setIncome(Float income) {
        this.income = income;
    }

    public StatisticProduct(Product product, Integer quanity, Float income) {
        this.product = product;
        this.quanity = quanity;
        this.income = income;
    }

}
