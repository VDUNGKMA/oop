
public abstract class Phuongtiendichuyen {
    protected String loaiphuongtien;
    protected HangSanXuat hangsanxuat;

    public Phuongtiendichuyen(String loaiphuongtien, HangSanXuat hangsanxuat) {
        this.loaiphuongtien = loaiphuongtien;
        this.hangsanxuat = hangsanxuat;
    }

    public String getLoaiphuongtien() {
        return loaiphuongtien;
    }

    public void setLoaiphuongtien(String loaiphuongtien) {
        this.loaiphuongtien = loaiphuongtien;
    }

    public HangSanXuat getHangsanxuat() {
        return hangsanxuat;
    }

    public void setHangsanxuat(HangSanXuat hangsanxuat) {
        this.hangsanxuat = hangsanxuat;
    }
    public String laytenhangsanxuat(){
        return  this.hangsanxuat.getTenhangsx();
    }
    public void batdau(){
        System.out.println("bat dau");
    }
    public void tangtoc(){
        System.out.println("tang toc ");
        
    }
    public abstract double layvantoc();
}
