package Main;

import java.io.PrintWriter;

public class VidughiText {

    public static void main(String[] args) {
        try {
           
            PrintWriter pw = new PrintWriter("C:\\Users\\zung\\Documents\\NetBeansProjects\\java_71\\test_file.txt"); // tao file
            pw.println("Hello zung");
            pw.print("xin choa");
            pw.println(2.0);
            pw.println("Hello World");
            pw.println("Kioto");
            Student st =new Student("39f", "dung ng", 34);
            pw.println(st);
            
            pw.flush(); // ghi du lieu xuong file
            pw.close(); // dong file 
            
        } catch (Exception e) {
            e.printStackTrace();
           
        }

    }
}
