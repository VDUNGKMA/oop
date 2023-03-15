
public class MayTinh {
    private HangSanXuat hangSanXuat;
    private NgaySanXuat ngaySanXuat;
    private double giaban;
    private int thoigianbaohanh;

    public MayTinh(HangSanXuat hangSanXuat, NgaySanXuat ngaySanXuat, double giaban, int thoigianbaohanh) {
        this.hangSanXuat = hangSanXuat;
        this.ngaySanXuat = ngaySanXuat;
        this.giaban = giaban;
        this.thoigianbaohanh = thoigianbaohanh;
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public NgaySanXuat getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(NgaySanXuat ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public double getGiaban() {
        return giaban;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }

    public int getThoigianbaohanh() {
        return thoigianbaohanh;
    }

    public void setThoigianbaohanh(int thoigianbaohanh) {
        this.thoigianbaohanh = thoigianbaohanh;
    }
    public boolean kiemtragiabanco1maytinhcothaphonkhong(MayTinh maytinhkhac){
      return this.giaban == maytinhkhac.giaban ;
    }     
    public String intenquocgia(){
       return this.hangSanXuat.intenquocgia();
       }
    //cach2 lây thẳng 
    public String laytenquocgia(){
        return this.hangSanXuat.getQuocgia().getTenquocgia();
    }
}
