
import java.util.Scanner;


public class ViDu {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("nhap vao ho va ten ");
        String hoVaTen= sc.nextLine();
        System.out.println("nhap ma sinh vien");
        String maSV =sc.nextLine();
        System.out.println("nhap vao diem thi");
        Float diemthi=sc.nextFloat();
        System.out.println("ho va ten: "+hoVaTen);
        System.out.println("ma sinh vien "+maSV);
        System.out.println("diem thi "+diemthi);
    }
}
