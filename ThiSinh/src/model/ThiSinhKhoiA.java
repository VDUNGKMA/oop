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
public class ThiSinhKhoiA extends ThiSinh{
    private float diemtoan;
    private float diemly;
    private float diemhoa;

    public ThiSinhKhoiA(String hoten, String ngaysinh, String diachi,float diemtoan,float diemly,float diemhoa) {
        super(hoten, ngaysinh, diachi);
        this.diemtoan=diemtoan;
        this.diemly=diemly;
        this.diemhoa=diemhoa;
    }

    public ThiSinhKhoiA() {
        
    }
    
    public float getDiemtoan() {
        return diemtoan;
    }

    public void setDiemtoan(float diemtoan) {
        this.diemtoan = diemtoan;
    }

    public float getDiemly() {
        return diemly;
    }

    public void setDiemly(float diemly) {
        this.diemly = diemly;
    }

    public float getDiemhoa() {
        return diemhoa;
    }

    public void setDiemhoa(float diemhoa) {
        this.diemhoa = diemhoa;
    }

    @Override
    public void showinfor() {
        super.showinfor(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("diem toan "+this.diemtoan);
        System.out.println("diem ly "+this.diemly);
        System.out.println("diem hoa "+this.diemhoa);
    }

    @Override
    public void nhapinfor() {
        Scanner sc =new Scanner(System.in);
        super.nhapinfor(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("nhap diem toan: ");
        diemtoan =sc.nextFloat();
        System.out.println("nhap diem ly: ");
        diemly=sc.nextFloat();
        System.out.println("nhap diem hoa: ");
        diemhoa=sc.nextFloat();
        
    }

    @Override
    public boolean check() {
        return (this.diemhoa+this.diemtoan+this.diemly)>=20;
    }
    
    
}
