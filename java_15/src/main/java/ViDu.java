
import java.util.Scanner;


public class ViDu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap vao a");
        int a=sc.nextInt();
        
        String ketqua= a%2==0?"so chan":"so le"; 
        System.out.println("a la so "+ketqua);
    }
}
