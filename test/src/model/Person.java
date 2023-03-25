/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author zung
 */
public class Person {
    private String hoten;
    private String ngaysinh;
    private String diachi;
    private  String gioitinh;

    public Person(String hoten, String ngaysinh, String diachi, String gioitinh) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }
    public void showInfor(){
        System.out.println("ho ten: "+this.hoten);
        System.out.println("ngay sinh: "+this.ngaysinh);
        System.out.println("dia chi: "+this.diachi);
        System.out.println("gioi tinh "+this.gioitinh);
    }
}
