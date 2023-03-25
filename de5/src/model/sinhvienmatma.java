/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author zung
 */
public class sinhvienmatma extends Sinhvien{
    private String donvi;
    private  float luong;

    public sinhvienmatma(String masv, String hoten, String ngaysinh, String gioitinh, float diemtb,String donvi,float luong) {
        super(masv, hoten, ngaysinh, gioitinh, diemtb);
        this.donvi=donvi;
        this.luong=luong;
    }

    public String getDonvi() {
        return donvi;
    }

    public void setDonvi(String donvi) {
        this.donvi = donvi;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }

    @Override
    public void showinfor() {
        super.showinfor(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("don vi: "+this.donvi);
        System.out.println("luong "+this.luong);
    }

    
    
}
