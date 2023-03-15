
public class HoaDonCaphe {
    private String loaicaphe;
    private double giatien;
    private double soluong;
    // constructer
    public HoaDonCaphe(String loaicaphe,double giatien,double soluong){
        this.loaicaphe=loaicaphe;
        this.giatien=giatien;
        this.soluong=soluong;
    }
    public double tinhtongtien(){
        return this.giatien*this.soluong;
    }
    public boolean kiemtrasoluonglonhon(double khoiluong){
        return this.soluong >khoiluong;
    }
    public boolean kiemtrasoluonghoadonlonhon500k(){
        return this.tinhtongtien() >500;
    }
    public double sotiengiamgia(double tylegiam){
        if(this.kiemtrasoluonghoadonlonhon500k()==true)
            return (tylegiam/100)*this.tinhtongtien();
        else
            return 0;
    }
    public double sotientralaikhach(double tylegiam){
        return this.tinhtongtien()-this.sotiengiamgia(tylegiam);
    }
}
