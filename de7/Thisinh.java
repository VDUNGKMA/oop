
package src;

import java.util.Scanner;


public class Thisinh {
    protected String hoten;
    protected String ngaysinh;
    protected String diachi;

    public Thisinh() {
    }
    
    public Thisinh(String hoten, String ngaysinh, String diachi) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
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
    public void nhap(){
        
    }
    public void hienthi(){
        
    }
    public Boolean check(){
        return true;
    }
}
