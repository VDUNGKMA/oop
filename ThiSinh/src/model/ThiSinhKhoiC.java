/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.Scanner;

/**
 *
 * @author zung
 */
public class ThiSinhKhoiC extends ThiSinh{
    private float diemvan;
    private float diemsu;
    private float diemdia;

    public ThiSinhKhoiC( String hoten, String ngaysinh, String diachi,float diemvan, float diemsu, float diemdia) {
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
    public void showinfor() {
        super.showinfor(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("diem van "+this.diemvan);
        System.out.println("diem su"+this.diemsu);
        System.out.println("diem dia "+this.diemdia);
    }

    @Override
    public void nhapinfor() {
        Scanner sc =new Scanner(System.in);
        super.nhapinfor(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("nhap diem van: ");
        diemvan =sc.nextFloat();
        System.out.println("nhap diem su: ");
        diemsu=sc.nextFloat();
        System.out.println("nhap diem dia: ");
        diemdia=sc.nextFloat();
        
    }

    @Override
    public boolean check() {
        return (this.diemvan+this.diemsu+this.diemdia)>=20;
    }
    
    
}
