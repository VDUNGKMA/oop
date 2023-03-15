
import java.util.Scanner;


public class ViDu {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s;
        System.out.println("nhap vao chuoi");
        s=sc.nextLine();
        System.out.println("--------");
        //ham length-->do dai chuoi
        System.out.println(s.length());
        int dodai =s.length();
        
        //ham chartat(vi tri) --> lay ra 1 ki tu tai vi tri
        for(int i=0;i<dodai;i++){
            System.out.println("vi tri "+i+":"+s.charAt(i));
        }
        //ham getchars(vitribatdau,vtriketthuc,mangluudulieu,vitribatdauluumang)
        char [] arr =new char[100];
        s.getChars(1, 5, arr, 0);
       
        for (char c : arr) {
            System.out.println(c);
        }
       
    }
}
