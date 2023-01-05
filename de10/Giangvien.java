
package src;


public class Giangvien {
    private String hoten;
    private String magiangvien;
    private String diachi;
    private String gioitinh;
    private String khoa;

    public Giangvien(String hoten, String magiangvien, String diachi, String gioitinh, String khoa) {
        this.hoten = hoten;
        this.magiangvien = magiangvien;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
        this.khoa = khoa;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getMagiangvien() {
        return magiangvien;
    }

    public void setMagiangvien(String magiangvien) {
        this.magiangvien = magiangvien;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }
    
}
