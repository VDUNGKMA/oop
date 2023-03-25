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
public class ThiSinhKhoiC extends ThiSinh {

    private float diemvan;
    private float diemsu;
    private float diemdia;

    public ThiSinhKhoiC(float diemvan, float diemsu, float diemdia, String hoten, String ngaysinh, String diachi) {
        super(hoten, ngaysinh, diachi);
        this.diemvan = diemvan;
        this.diemsu = diemsu;
        this.diemdia = diemdia;
    }

    public ThiSinhKhoiC() {
    }

    public float getDiemvan() {
        return diemvan;
    }

    public void setDiemvan(float diemvan) {
        this.diemvan = diemvan;
    }

    public float getDiemsu() {
        return diemsu;
    }

    public void setDiemsu(float diemsu) {
        this.diemsu = diemsu;
    }

    public float getDiemdia() {
        return diemdia;
    }

    public void setDiemdia(float diemdia) {
        this.diemdia = diemdia;
    }

    @Override
    public void nhapthongtin() {
        Scanner sc = new Scanner(System.in);
        super.nhapthongtin();
        System.out.println("nhap diem van ");
        diemvan = sc.nextFloat();
        System.out.println("nhap diem su ");
        diemsu = sc.nextFloat();
        System.out.println("nhap diem dia ");
        diemdia = sc.nextFloat();
        sc.nextLine();
        System.out.println("----------------------");

    }

    public void inthongtin() {
        super.inthongtin(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("diem van: " + this.diemvan);
        System.out.println("diem su: " + this.diemsu);
        System.out.println("diem dia: " + this.diemdia);

    }

    @Override
    public boolean kiemtra() {
        return (this.diemvan+this.diemsu+this.diemdia)>=20;
    }
    

}
