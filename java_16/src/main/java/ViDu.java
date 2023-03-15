
import java.util.Scanner;


public class ViDu {
    public static void main(String[] args) {
        double a,b;
        Scanner sc =new Scanner(System.in);
        System.out.println("nhap vao a va b");
        a=sc.nextDouble();
        b=sc.nextDouble();
        
        //ham lay gia tri tuyet doi
        System.out.println("|a|="+Math.abs(a));
        System.out.println("can duoi cua a= "+Math.ceil(a));
        System.out.println("max(a,b)="+Math.max(a, b));
        System.out.println("can tren cua a "+Math.floor(a));
        System.out.println("a^b="+Math.pow(a, b));
        System.out.println("log10(a)="+Math.log10(a));
    }
}
