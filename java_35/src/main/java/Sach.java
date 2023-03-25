
public class Sach {
    private String tenSach;
    private double giaBan;
    private int namXuatBan;
    private TacGia tacGia;

    public Sach(String tenSach, double giaBan, int namXuatBan, TacGia tacGia) {
        this.tenSach = tenSach;
        this.giaBan = giaBan;
        this.namXuatBan = namXuatBan;
        this.tacGia = tacGia;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public TacGia getTacGia() {
        return tacGia;
    }

    public void setTacGia(TacGia tacGia) {
        this.tacGia = tacGia;
    }
    public void intensach(){
        System.out.println("ten sach:"+this.tenSach);
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Sach other = (Sach) obj;
        return this.namXuatBan == other.namXuatBan;
    }
    public boolean sosanhnamxb(Sach sachkhac){
        return this.namXuatBan==sachkhac.namXuatBan;
    }
    public double giasaukhigiam(double x){
        return this.giaBan- this.giaBan*(x/100);
    }
    
    
  
}
