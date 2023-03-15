
import java.util.Scanner;

public class vidu {

    public static void main(String[] args) {
        // khai báo biến
        int a, b;
        // nhập dữ liệu
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao 2 so a va b");
        a = sc.nextInt();
        b = sc.nextInt();
        //phép toán cộng trừ nhân chia trong java
        System.out.println(a + "+" + b + "=" + (a + b));
        System.out.println(a + "-" + b + "=" + (a - b));
        System.out.println(a + "*" + b + "=" + (a * b));
        System.out.println(a + "/" + b + "=" + ((float) a / b));
        System.out.println(a + "%" + b + "=" + (a % b));

    }
}
