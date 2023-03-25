
import java.util.Scanner;
import java.util.Stack;


public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<String> stackchuoi =new Stack<>();
        System.out.println("nhap vao 1 chuoi");
        String name =sc.nextLine();
        //day vao stack
       for(int i=0 ;i<name.length();i++){
           stackchuoi.push(name.charAt(i)+"");
       }
       // lay du lieu tu stak ra 
        for(int i=0 ;i<name.length();i++){
            System.out.println(stackchuoi.pop());
        }
        // chuyen tu co so 10 sang co so 2
        int a=0;
        System.out.println("nhap vao 1 so can chuyen doi");
        a=sc.nextInt();
        while (a>0) {            
            int sodu=a%2;
            stackchuoi.push(sodu+"");
            a/=2;
        }
        // khi dung pop() lay du lieu trong stack ra thi size cua no giam di 1 qua tung lan pop
        int n=stackchuoi.size();
        for(int i=0 ;i<n;i++){
            System.out.print(stackchuoi.pop());
        }
    }
}
