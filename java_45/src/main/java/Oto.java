
public class Oto extends Phuongtiendichuyen{
    private String loainhienlieu;

    public Oto(String loainhienlieu, String loaiphuongtien, HangSanXuat hangsanxuat) {
        super(loaiphuongtien, hangsanxuat);
        this.loainhienlieu = loainhienlieu;
    }

    public String getLoainhienlieu() {
        return loainhienlieu;
    }

    public void setLoainhienlieu(String loainhienlieu) {
        this.loainhienlieu = loainhienlieu;
    }
    
    
    @Override
    public double layvantoc() {
        return 100;
    }
    
}
