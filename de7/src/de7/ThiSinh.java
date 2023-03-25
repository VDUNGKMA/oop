/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de7;

import java.util.Scanner;

/**
 *
 * @author zung
 */
public class ThiSinh {

    private String hoten;
    private String ngaysinh;
    private String diachi;

    public ThiSinh(String hoten, String ngaysinh, String diachi) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
    }
   
    public ThiSinh() {
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

    public void nhapthongtin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ho ten: ");
        hoten = sc.nextLine();
        System.out.println("nhap ngay sinh ");
        ngaysinh = sc.nextLine();
        System.out.println("nhap dia chi ");
        diachi = sc.nextLine();
        sc.nextLine();
    }

    public void inthongtin() {
        System.out.println("ho ten: " + this.hoten);
        System.out.println("ngay sinh: " + this.ngaysinh);
        System.out.println("dia hi: " + this.diachi);

    }
    public boolean kiemtra(){
        return true;
    }
}
