package Main;

import java.io.File;
import java.nio.file.Path;

public class Vidu_xoa_file {
    public static void xoafile(File f){
        if(f.isFile()){
           // System.out.println("da xao file"+f.getAbsolutePath());
            f.delete();
        }
        else if(f.isDirectory()){
         File [] mangcon=   f.listFiles();
            for (File file : mangcon) {
                System.out.println(file.getName());
                xoafile(file);
            }
        }
        f.delete();
    }

    public static void main(String[] args) {
        // lay duong dan file can xoa
        File f1 = new File("C:\\Users\\zung\\Documents\\NetBeansProjects\\java_69\\F1");
        File f0_1 = new File("C:\\Users\\zung\\Documents\\NetBeansProjects\\java_69\\F0_1");
        File f = new File("C:\\Users\\zung\\Documents\\NetBeansProjects\\java_69\\Vidu.txt");
        // su dung class Files de xoa file
        Path p0 = f1.toPath();
        Path p1 = f0_1.toPath();
        Path p2 = f.toPath();
        Vidu_xoa_file.xoafile(f1);
//        try {
//           
//            Files.delete(p1);
//            Files.delete(p2);
//        } catch (IOException ex) {
//            Logger.getLogger(Vidu_xoa_file.class.getName()).log(Level.SEVERE, null, ex);
//        }

    }
}
