/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author CUONG
 */

public class Order {
    private int MADONHANG;
    private int MAKH;
    private int MASP;
    private int TONGSOLUONG;
    private String NGAYTAOHD;
    private double TONGTIEN;

    public Order() {
    }

    public Order(int MADONHANG, int MAKH, int MASP, int TONGSOLUONG, String NGAYTAOHD, double TONGTIEN) {
        this.MADONHANG = MADONHANG;
        this.MAKH = MAKH;
        this.MASP = MASP;
        this.TONGSOLUONG = TONGSOLUONG;
        this.NGAYTAOHD = NGAYTAOHD;
        this.TONGTIEN = TONGTIEN;
    }

    public int getMADONHANG() {
        return MADONHANG;
    }

    public void setMADONHANG(int MADONHANG) {
        this.MADONHANG = MADONHANG;
    }

    public int getMAKH() {
        return MAKH;
    }

    public void setMAKH(int MAKH) {
        this.MAKH = MAKH;
    }

    public int getMASP() {
        return MASP;
    }

    public void setMASP(int MASP) {
        this.MASP = MASP;
    }

    public int getTONGSOLUONG() {
        return TONGSOLUONG;
    }

    public void setTONGSOLUONG(int TONGSOLUONG) {
        this.TONGSOLUONG = TONGSOLUONG;
    }

    public String getNGAYTAOHD() {
        return NGAYTAOHD;
    }

    public void setNGAYTAOHD(String NGAYTAOHD) {
        this.NGAYTAOHD = NGAYTAOHD;
    }

    public double getTONGTIEN() {
        return TONGTIEN;
    }

    public void setTONGTIEN(double TONGTIEN) {
        this.TONGTIEN = TONGTIEN;
    }
    
}
