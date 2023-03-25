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
public class Sinhvien {
    private  String masv;
    private String hoten;
    private  String ngaysinh;
    private  String gioitinh;
    private float diemtb;

    public Sinhvien(String masv, String hoten, String ngaysinh, String gioitinh, float diemtb) {
        this.masv = masv;
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.diemtb = diemtb;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
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

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public float getDiemtb() {
        return diemtb;
    }

    public void setDiemtb(float diemtb) {
        this.diemtb = diemtb;
    }
    public void showinfor(){
        System.out.println("ma sinh vien: "+this.masv);
        System.out.println("ho ten: "+this.hoten);
        System.out.println("ngay sinh: "+this.ngaysinh);
        System.out.println("gioi tinh: "+this.diemtb );
    }
}
