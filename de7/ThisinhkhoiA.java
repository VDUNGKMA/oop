package src;

import java.util.Scanner;

public class ThisinhkhoiA extends Thisinh {

    private Float toan;
    private Float ly;
    private Float hoa;

    public ThisinhkhoiA() {
    }
    
    public ThisinhkhoiA(String hoten, String ngaysinh, String diachi, Float toan, Float ly, Float hoa) {
        super(hoten, ngaysinh, diachi);
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public Float getToan() {
        return toan;
    }

    public void setToan(Float toan) {
        this.toan = toan;
    }

    public Float getLy() {
        return ly;
    }

    public void setLy(Float ly) {
        this.ly = ly;
    }

    public Float getHoa() {
        return hoa;
    }

    public void setHoa(Float hoa) {
        this.hoa = hoa;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ho ten: ");
        this.hoten = sc.nextLine();
        System.out.println("nhap ngay sinh");
        this.ngaysinh = sc.nextLine();
        System.out.println("nhap dia chi: ");
        this.diachi = sc.nextLine();
        System.out.println("nhap diem toan: ");
        this.toan = sc.nextFloat();
        System.out.println("nhap diem ly : ");
        this.ly = sc.nextFloat();
        System.out.println("nhap diem hoa: ");
        this.hoa = sc.nextFloat();
    }

    public void hienthi() {
        System.out.println("hoten: " + this.hoten);
        System.out.println("ngay sinh: " + this.ngaysinh);
        System.out.println("dia chi: " + this.diachi);
        System.out.println("diem toan: " + this.toan);
        System.out.println("diem ly: " + this.ly);
        System.out.println("diem hoa: " + this.hoa);
        System.out.println("--------------------------");

    }

    public Boolean check() {
        if(this.toan+this.ly+this.hoa >=20)
            return true;
        return false;
    }
    
}
