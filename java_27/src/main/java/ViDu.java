
import java.util.Scanner;


public class ViDu {
    public static void main(String[] args) {
        double mang1[];
        double [] mang2;
        mang1 =new double[10];
        Scanner sc =new Scanner(System.in);
        for(int i=0;i<mang1.length;i++){
            System.out.println("nhap pha thu thu "+i);
            mang1[i]=sc.nextDouble();
        }
        for(int i=0;i<mang1.length;i++){
            System.out.println("phan thu thu "+i+":"+mang1[i]);
        }
    }
}
