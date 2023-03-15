
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;


public class ViDuDocDoituong {
    public static void main(String[] args) {
        try {
            File file =new File("C:\\Users\\zung\\Documents\\NetBeansProjects\\java_74\\file1.data");
            InputStream is =new FileInputStream(file);
            ObjectInputStream ois =new ObjectInputStream(is);
            SinhVien st = (SinhVien) ois.readObject();
            System.out.println(st.getHoten());
            System.out.println(st);
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
