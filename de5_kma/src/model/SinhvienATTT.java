/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author zung
 */
public class SinhvienATTT extends Sinhvien {
    private  float hocphi;

    public SinhvienATTT( String masv, String hoten, String ngaysinh, String gioitinh, float diemtb,float hocphi) {
        super(masv, hoten, ngaysinh, gioitinh, diemtb);
        this.hocphi = hocphi;
    }

    public float getHocphi() {
        return hocphi;
    }

    public void setHocphi(float hocphi) {
        this.hocphi = hocphi;
    }

    @Override
    public void showinfor() {
        super.showinfor(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("hoc phi: "+this.hocphi);
    }
    
}
