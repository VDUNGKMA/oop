
package De3Oop;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args) {
        ArrayList listnv =new ArrayList();
        try {
            FileReader fr =new FileReader("nhanvien.dat");
             BufferedReader br =new BufferedReader(fr); // tao bo nho dem de doc file roi truyen vao arraylist
             //doc file
             String s="";
             while((s = br.readLine())!=null){
                 String[] array =s.split("\\$");
                 NhanVien nv =new NhanVien(array[0], array[1], array[2], array[3], array[4],
                         Float.parseFloat(array[5]) ,Integer.parseInt(array[6]), Float.parseFloat(array[7]));
                 listnv.add(nv);
             }
             br.close();
             fr.close();
             JOptionPane.showMessageDialog(null, "doc file thanh cong");
        } catch (Exception e) {
        }
//        for(int i=0;i<listnv.size();i++){
//            NhanVien nv =(NhanVien) listnv.get(i);
//            nv.hienthi();
//            System.out.println("-------------");
//        }
        table tb =new table();
        tb.setVisible(true);
        tb.setdata(listnv);
    }
}
