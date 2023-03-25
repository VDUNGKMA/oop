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
public class nhanvien extends person{
    private String phongban;
    private int hesoluong;
    private float thamnien;
    private float luongcoban;

    public nhanvien( String hoten, String ngaysinh, String diachi, String gioitinh,String phongban, int hesoluong, float thamnien, float luongcoban) {
        super(hoten, ngaysinh, diachi, gioitinh);
        this.phongban = phongban;
        this.hesoluong = hesoluong;
        this.thamnien = thamnien;
        this.luongcoban = luongcoban;
    }

    public String getPhongban() {
        return phongban;
    }

    public void setPhongban(String phongban) {
        this.phongban = phongban;
    }

    public int getHesoluong() {
        return hesoluong;
    }

    public void setHesoluong(int hesoluong) {
        this.hesoluong = hesoluong;
    }

    public float getThamnien() {
        return thamnien;
    }

    public void setThamnien(float thamnien) {
        this.thamnien = thamnien;
    }

    public float getLuongcoban() {
        return luongcoban;
    }

    public void setLuongcoban(float luongcoban) {
        this.luongcoban = luongcoban;
    }

    @Override
    public void showinfor() {
        super.showinfor(); 
        System.out.println("phong ban: "+this.phongban);
        System.out.println("he so luong "+this.hesoluong);
        System.out.println("tham nien "+this.thamnien);
        System.out.println("luong co ban "+this.luongcoban);
        
    }
    public float luongthuclinh(){
        return luongcoban*hesoluong*(1+thamnien/100f);
    }
    
    
}
