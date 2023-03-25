
import java.util.Scanner;


public class ViDu {
    public static void main(String[] args) {
        // ham kiem tra chan le
        Scanner sc =new Scanner(System.in);
        int a;
        System.out.println("nhap vao 2 so a va b");
        a=sc.nextInt();
        int check=a/2;
        if(check*2==a)
               System.out.println(a+" la so chan");
        else
                System.out.println(a+" la so le");
    }
}
