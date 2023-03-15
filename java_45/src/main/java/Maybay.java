
public class Maybay extends Phuongtiendichuyen{
    private String loainhienlieu;

    public Maybay(String loainhienlieu, String loaiphuongtien, HangSanXuat hangsanxuat) {
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
        return 300;
    }
    public void catcanh(){
        System.out.println("cat canh");
    }
    public void hacanh(){
        System.out.println("ha canh");
    }
    
}
