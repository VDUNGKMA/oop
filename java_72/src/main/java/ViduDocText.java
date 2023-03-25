
import java.io.BufferedReader;
import java.io.File;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;


public class ViduDocText {
    public static void main(String[] args) {
//        File f= new File("C:\\Users\\zung\\Documents\\NetBeansProjects\\java_72\\test_file.txt");
//        try {
//           BufferedReader br = Files.newBufferedReader(f.toPath(), StandardCharsets.UTF_8);
//          
//            String line =null;
//            while (true) {                
//                line =br.readLine();
//                if(line ==null)
//                    break;
//                else
//                    System.out.println(line);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
// cach 2
                File f2= new File("C:\\Users\\zung\\Documents\\NetBeansProjects\\java_72\\test_file.txt");
                try {
                    List<String> allText = Files.readAllLines(f2.toPath(),StandardCharsets.UTF_8);
                    for (Object line : allText) {
                        System.out.println(line);
                    }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
