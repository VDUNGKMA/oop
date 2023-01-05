package src;

public class Sinhvien {

    protected String masv;
    protected String hoten;
    protected String ngaysinh;
    protected String gioitinh;
    protected Float dtb;

    public Sinhvien(String masv, String hoten, String ngaysinh, String gioitinh, Float dtb) {
        this.masv = masv;
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.dtb = dtb;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public Float getDtb() {
        return dtb;
    }

    public void setDtb(Float dtb) {
        this.dtb = dtb;
    }
    
    public void hienthi(){
        System.out.println("ma sv: "+this.masv);
        System.out.println("ho ten: "+this.hoten);
        System.out.println("ngay sinh: "+this.ngaysinh);
        System.out.println("gioi tinh: "+this.gioitinh);
        System.out.println("diem trung binh: "+this.dtb);
    }
}
