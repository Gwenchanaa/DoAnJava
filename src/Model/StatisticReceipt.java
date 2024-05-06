/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ACER
// */
public class StatisticReceipt {

//    private Receipt receipt;
    private Product product;
    private Integer rsquanity;
    private Double inventory;

//    public Receipt getReceipt() {
//        return receipt;
//    }

//    public void setReceipt(Receipt receipt) {
//        this.receipt = receipt;
//    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getRsquanity() {
        return rsquanity;
    }

    public void setRsquanity(Integer rsquanity) {
        this.rsquanity = rsquanity;
    }

    public Double getInventory() {
        return inventory;
    }

    public void setInventory(Double inventory) {
        this.inventory = inventory;
    }

    public StatisticReceipt( Product product, Integer rsquanity, Double inventory) {
//        this.receipt = receipt;
        this.product = product;
        this.rsquanity = rsquanity;
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return "StatisticReceipt{" + ", product=" + product + ", rsquanity=" + rsquanity + ", inventory=" + inventory + '}';
    }

  
    

  

   

}
