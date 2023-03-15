
import java.util.Scanner;


public class BaitapHinhTron {
    public static void main(String[] args) {
        double r, dienTich,chuVi;
        Scanner sc =new Scanner(System.in);
        System.out.println("nhap vao ban kinh r ");
        r=sc.nextDouble();
        
        //Tính chu vi
        chuVi =2*Math.PI*r;
        //Tinh diện tích
        dienTich = Math.PI *Math.pow(r, 2);
        System.out.println("Chu vi hinh tron="+chuVi);
        System.out.println("Dien tich hinh tron="+dienTich);
    }
}
