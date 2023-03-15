package main;

import java.util.Objects;


public class SinhVien implements Comparable<SinhVien>{
    private String hoten;
    private String masinhvien;
    private int namsinh;
    private float diem;

    public SinhVien(String masinhvien,  String hoten, int namsinh, float diem) {
        this.hoten = hoten;
        this.masinhvien = masinhvien;
        this.namsinh = namsinh;
        this.diem = diem;
    }

    public SinhVien(String masinhvien) {
        this.masinhvien = masinhvien;
    }
    
    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getMasinhvien() {
        return masinhvien;
    }

    public void setMasinhvien(String masinhvien) {
        this.masinhvien = masinhvien;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "hoten=" + hoten + ", masinhvien=" + masinhvien + ", namsinh=" + namsinh + ", diem=" + diem + '}';
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.masinhvien.compareTo(masinhvien);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SinhVien other = (SinhVien) obj;
        return Objects.equals(this.masinhvien, other.masinhvien);
    }
    
    
}
