
package Main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class DanhSachSinhVien {
  private  ArrayList<SinhVien> ds;

    public DanhSachSinhVien() {
        this.ds=new ArrayList<>();
    }
    
    
    public DanhSachSinhVien(ArrayList<SinhVien> ds) {
        this.ds = ds;
    }
    public void themsinhvien(SinhVien sv){
        this.ds.add(sv);
    }
    public void indanhsachsinhvien(){
        for (SinhVien d : ds) {
            System.out.println(d);
        }
    }
    public void ghidanhsachsinhvien(File file){
        try {
            OutputStream os =new FileOutputStream(file);
            ObjectOutputStream oos =new ObjectOutputStream(os);
            for (SinhVien sinhvien : ds) {
                oos.writeObject(sinhvien);
            }
            oos.flush();
            oos.close();
        } catch (Exception e) {
        }
    }

    

    
    
}
