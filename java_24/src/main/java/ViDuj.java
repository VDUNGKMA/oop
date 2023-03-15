
import java.util.Scanner;


public class ViDuj {
    public static void main(String[] args) {
        int n;
        Scanner sc =new Scanner(System.in);
        System.out.println("nhap vao so n ");
        n=sc.nextInt();
        String nhiphan="";
        while(n>0){
            nhiphan = (n%2) +nhiphan;
            n=n/2;  
        }
        System.out.println("so he nhi phan la:"+nhiphan);
    }
}
