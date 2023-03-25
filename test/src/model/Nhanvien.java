/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author zung
 */
public class Nhanvien extends Person{
    
    private String phongban;
    private float  hesoluong;
    private int  thamnien;
    private float luongcoban;

    public Nhanvien(String hoten, String ngaysinh, String diachi, String gioitinh,String phongban, float hesoluong, int thamnien, float luongcoban) {
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

    public float getHesoluong() {
        return hesoluong;
    }

    public void setHesoluong(float hesoluong) {
        this.hesoluong = hesoluong;
    }

    public int getThamnien() {
        return thamnien;
    }

    public void setThamnien(int thamnien) {
        this.thamnien = thamnien;
    }

    public float getLuongcoban() {
        return luongcoban;
    }

    public void setLuongcoban(float luongcoban) {
        this.luongcoban = luongcoban;
    }

    @Override
    public void showInfor() {
        super.showInfor(); 
        System.out.println("phong ban: "+this.phongban);
        System.out.println("he so luong "+this.hesoluong);
        System.out.println("tham nien "+this.hesoluong);
        System.out.println("luong co ban "+this.luongcoban);
    }
    public float luongthuclinh(){
        return luongcoban*hesoluong*(1+thamnien/100.0f);
    }
    

    
    
  
    
}
