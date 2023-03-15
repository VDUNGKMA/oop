

import java.io.Serializable;


public class SinhVien implements Serializable{
    private String id;
    private String hoten;
    private int namsinh;
    private float diemtb;

    public SinhVien(String id, String hoten, int namsinh, float diemtb) {
        this.id = id;
        this.hoten = hoten;
        this.namsinh = namsinh;
        this.diemtb = diemtb;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public float getDiemtb() {
        return diemtb;
    }

    public void setDiemtb(float diemtb) {
        this.diemtb = diemtb;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "id=" + id + ", hoten=" + hoten + ", namsinh=" + namsinh + ", diemtb=" + diemtb + '}';
    }

   
    
}
