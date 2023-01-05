package src;

public class SinhvienMatma extends Sinhvien {

    private String donvi;
    private Float luong;

    public SinhvienMatma(String masv, String hoten, String ngaysinh, String gioitinh, Float dtb,String donvi,Float luong) {
        super(masv, hoten, ngaysinh, gioitinh, dtb);
        this.donvi=donvi;
        this.luong=luong;
    }

    public String getDonvi() {
        return donvi;
    }

    public void setDonvi(String donvi) {
        this.donvi = donvi;
    }

    public Float getLuong() {
        return luong;
    }

    public void setLuong(Float luong) {
        this.luong = luong;
    }

    @Override
    public void hienthi() {
        super.hienthi();
        System.out.println("don vi: " + this.donvi);
        System.out.println("luong: " + this.luong);
    }

}
