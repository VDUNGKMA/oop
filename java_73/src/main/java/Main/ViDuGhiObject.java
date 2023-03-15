
package Main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ViDuGhiObject {
    public static void main(String[] args) {
        try {
             File file =new File("C:\\Users\\zung\\Documents\\NetBeansProjects\\java_73\\file.data");
        OutputStream os =new FileOutputStream(file);
        ObjectOutputStream oos =new ObjectOutputStream(os);
        SinhVien sv =new SinhVien("001", "hoten", 34, 46);
        oos.writeObject(sv);
        oos.flush();
        oos.close();
        } catch (Exception e) {
        }
       
        
    }
}
