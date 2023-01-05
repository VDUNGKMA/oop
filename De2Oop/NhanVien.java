
package De2Oop;


public class NhanVien  extends Person{
    private String phongban;
    private Float hesoluong;
    private int thamnien;
    private Float luongcoban;
    public NhanVien(String Hoten, String Ngaysinh, String Diachi, String Gioitinh,String phongban,Float hesoluong,int thamnien,Float luongcoban) {
        super(Hoten, Ngaysinh, Diachi, Gioitinh);
        this.phongban=phongban;
        this.hesoluong=hesoluong;
        this.thamnien=thamnien;
        this.luongcoban=luongcoban;
    }

    public String getPhongban() {
        return phongban;
    }

    public void setPhongban(String phongban) {
        this.phongban = phongban;
    }

    public Float getHesoluong() {
        return hesoluong;
    }

    public void setHesoluong(Float hesoluong) {
        this.hesoluong = hesoluong;
    }

    public int getThamnien() {
        return thamnien;
    }

    public void setThamnien(int thamnien) {
        this.thamnien = thamnien;
    }

    public Float getLuongcoban() {
        return luongcoban;
    }

    public void setLuongcoban(Float luongcoban) {
        this.luongcoban = luongcoban;
    }
    public Float luongthuclinh(){
        return this.luongcoban *this.getHesoluong()*(1+this.getThamnien()/100.0f);
    }
    @Override
    public void hienthi() {
        super.hienthi(); 
        System.out.println("Phong ban: "+this.phongban);
        System.out.println("he so luong: "+this.hesoluong);
        System.out.println("tham nien: "+this.thamnien);
        System.out.println("luong co ban: "+this.luongcoban);
        System.out.println("luong thuc linh: +"+this.luongthuclinh());
    }
    
}
