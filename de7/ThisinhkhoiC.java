package src;

import java.util.Scanner;

public class ThisinhkhoiC extends Thisinh {

    private Float van;
    private Float su;
    private Float dia;

    public ThisinhkhoiC() {
    }

    public ThisinhkhoiC(String hoten, String ngaysinh, String diachi,Float van ,Float su ,Float dia) {
        super(hoten, ngaysinh, diachi);
        this.van=van;
        this.su=su;
        this.dia=dia;
       
    }

    public Float getVan() {
        return van;
    }

    public void setVan(Float van) {
        this.van = van;
    }

    public Float getSu() {
        return su;
    }

    public void setSu(Float su) {
        this.su = su;
    }

    public Float getDia() {
        return dia;
    }

    public void setDia(Float dia) {
        this.dia = dia;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ho ten: ");
        this.hoten = sc.nextLine();
        System.out.println("nhap ngay sinh");
        this.ngaysinh = sc.nextLine();
        System.out.println("nhap dia chi: ");
        this.diachi = sc.nextLine();
        System.out.println("nhap diem van: ");
        this.van = sc.nextFloat();
        System.out.println("nhap diem su : ");
        this.su = sc.nextFloat();
        System.out.println("nhap diem dia: ");
        this.dia = sc.nextFloat();
    }

    public void hienthi() {
        System.out.println("hoten: " + this.hoten);
        System.out.println("ngay sinh: " + this.ngaysinh);
        System.out.println("dia chi: " + this.diachi);
        System.out.println("diem van: " + this.van);
        System.out.println("diem su: " + this.su);
        System.out.println("diem dia: " + this.dia);
        System.out.println("-----------------------------");

    }

 
    public Boolean check() {
        if(this.van+this.su+this.dia >=20)
            return true;
        return false;
    }
    
}
