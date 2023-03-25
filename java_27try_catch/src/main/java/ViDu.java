
import java.util.Scanner;


public class ViDu {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=0;
        try {
             System.out.println("nhap vao n");
            n=sc.nextInt();
        } catch (Exception e) {
            System.out.println("du lieu dau vao khong dung");
        }
        //finally dùng để thông báo message ra màn hình cho dù nó có lỗi hay ko
        finally {
            
            System.out.println("du ko lỗi nhưng vẫn chạy dòng có từ khóa finally");
        }
        System.out.println("gia tri nhap la "+n);
        System.out.println("ket thuc chuong trinh");
    }
}
