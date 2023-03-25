
public class ViDu {

    public static void main(String[] args) {
        String s1 = "abc123";
        String s2 = "123abc";
        String s3 = "abc123";
        //ham equals() so sanh 2 chuoi tra ve true false
        System.out.println("s1 vs s2 :" + s1.equals(s2));
        System.out.println("s2 vs s3 :" + s2.equals(s3));
        System.out.println("s1 vs s3 :" + s1.equals(s3));
        

    }
}
