
package model;


public class ThucDonModel {
    private String luachon;
    private double tongTien;

    public ThucDonModel() {
        this.luachon = "";
        this.tongTien = 0;
    }

    public String getLuachon() {
        return luachon;
    }

    public void setLuachon(String luachon) {
        this.luachon = luachon;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }
    
}
