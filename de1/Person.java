
package de1;

public class Person {
    protected  String hoten;
    protected  String ngaysinh;
    protected String diachi ;
    protected String gioitinh;

    public Person(String hoten, String ngaysinh, String diachi, String gioitinh) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
    }
    public void hienthi(){
        System.out.println("hoten: "+this.hoten);
        System.out.println("ngaysinh"+this.ngaysinh);
        System.out.println("dia chi: "+this.diachi);
        System.out.println("gioi tinh: "+this.gioitinh);
    }
}
