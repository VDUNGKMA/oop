
package src;


public class SinhvienATTTT extends Sinhvien{
    private Float hocphi;
    public SinhvienATTTT(String masv, String hoten, String ngaysinh, String gioitinh, Float dtb,Float hocphi) {
        super(masv, hoten, ngaysinh, gioitinh, dtb);
        this.hocphi=hocphi;
    }

    public Float getHocphi() {
        return hocphi;
    }

    public void setHocphi(Float hocphi) {
        this.hocphi = hocphi;
    }

    @Override
    public void hienthi() {
        super.hienthi(); 
        System.out.println("hoc phi: "+this.getHocphi());
    }

   
    
    
}
