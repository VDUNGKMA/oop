
import java.util.Scanner;


public class vidu {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a,b;
        System.out.println("nhap 2 so a va b");
        a=sc.nextInt();
        b=sc.nextInt();
       // xuat ket qua so sanh
        System.out.println(a>b ?"true":"false");
        System.out.println(a>b&&a%2==0?"a la so chan va lon hon b":"a khac");
    }
}
