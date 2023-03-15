
package model;

import java.util.Date;
import java.util.Objects;

public class ThiSinh {
    private int maThiSinh;
    private String tenThiSinh;
    private Tinh queQuan;
    private Date ngaySinh;
    private boolean gioiTinh;
    private float diemMon1,diemMon2,diemMon3;

    public ThiSinh() {
    }

    public ThiSinh(int maThiSinh, String tenThiSinh, Tinh queQuan, Date ngaySinh, boolean gioiTinh, float diemMon1, float diemMon2, float diemMon3) {
        this.maThiSinh = maThiSinh;
        this.tenThiSinh = tenThiSinh;
        this.queQuan = queQuan;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diemMon1 = diemMon1;
        this.diemMon2 = diemMon2;
        this.diemMon3 = diemMon3;
    }
    

    public int getMaThiSinh() {
        return maThiSinh;
    }

    public void setMaThiSinh(int maThiSinh) {
        this.maThiSinh = maThiSinh;
    }

    public String getTenThiSinh() {
        return tenThiSinh;
    }

    public void setTenThiSinh(String tenThiSinh) {
        this.tenThiSinh = tenThiSinh;
    }

    public Tinh getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(Tinh queQuan) {
        this.queQuan = queQuan;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public float getDiemMon1() {
        return diemMon1;
    }

    public void setDiemMon1(float diemMon1) {
        this.diemMon1 = diemMon1;
    }

    public float getDiemMon2() {
        return diemMon2;
    }

    public void setDiemMon2(float diemMon2) {
        this.diemMon2 = diemMon2;
    }

    public float getDiemMon3() {
        return diemMon3;
    }

    public void setDiemMon3(float diemMon3) {
        this.diemMon3 = diemMon3;
    }
    
    @Override
    public String toString() {
        return "ThiSinh{" + "maThiSinh=" + maThiSinh + ", tenThiSinh=" + tenThiSinh + ", queQuan=" + queQuan + ", ngaySinh=" + ngaySinh + ", gioiTinh=" + gioiTinh + ", diemMon1=" + diemMon1 + ", diemMon2=" + diemMon2 + ", diemMon3=" + diemMon3 + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.maThiSinh;
        hash = 53 * hash + Objects.hashCode(this.tenThiSinh);
        hash = 53 * hash + Objects.hashCode(this.queQuan);
        hash = 53 * hash + Objects.hashCode(this.ngaySinh);
        hash = 53 * hash + (this.gioiTinh ? 1 : 0);
        hash = 53 * hash + Float.floatToIntBits(this.diemMon1);
        hash = 53 * hash + Float.floatToIntBits(this.diemMon2);
        hash = 53 * hash + Float.floatToIntBits(this.diemMon3);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ThiSinh other = (ThiSinh) obj;
        if (this.maThiSinh != other.maThiSinh) {
            return false;
        }
        if (this.gioiTinh != other.gioiTinh) {
            return false;
        }
        if (Float.floatToIntBits(this.diemMon1) != Float.floatToIntBits(other.diemMon1)) {
            return false;
        }
        if (Float.floatToIntBits(this.diemMon2) != Float.floatToIntBits(other.diemMon2)) {
            return false;
        }
        if (Float.floatToIntBits(this.diemMon3) != Float.floatToIntBits(other.diemMon3)) {
            return false;
        }
        if (!Objects.equals(this.tenThiSinh, other.tenThiSinh)) {
            return false;
        }
        if (!Objects.equals(this.queQuan, other.queQuan)) {
            return false;
        }
        return Objects.equals(this.ngaySinh, other.ngaySinh);
    }

    
    
    
}
