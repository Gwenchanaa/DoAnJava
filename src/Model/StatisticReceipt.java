/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ACER
 */
public class StatisticReceipt {

    private Receipt receipt;
    private Integer rsquanity;
    private Float rsincome;

    @Override
    public String toString() {
        return "StatisticReceipt{" + "receipt=" + receipt + ", rsquanity=" + rsquanity + ", rsincome=" + rsincome + '}';
    }

    public Receipt getReceipt() {
        return receipt;
    }

    public void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }

    public Integer getRsquanity() {
        return rsquanity;
    }

    public void setRsquanity(Integer rsquanity) {
        this.rsquanity = rsquanity;
    }

    public Float getRsincome() {
        return rsincome;
    }

    public void setRsincome(Float rsincome) {
        this.rsincome = rsincome;
    }

    public StatisticReceipt(Receipt receipt, Integer rsquanity, Float rsincome) {
        this.receipt = receipt;
        this.rsquanity = rsquanity;
        this.rsincome = rsincome;
    }

   

}
