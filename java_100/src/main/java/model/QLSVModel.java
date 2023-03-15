
package model;

import java.util.ArrayList;

public class QLSVModel {
    private ArrayList<ThiSinh> dsThiSinh;
    private String luachon;

    public QLSVModel() {
        this.dsThiSinh =new ArrayList<>();
        this.luachon="";
    }

    public QLSVModel(ArrayList<ThiSinh> dsThiSinh) {
        this.dsThiSinh = dsThiSinh;
    }

    public ArrayList<ThiSinh> getDsThiSinh() {
        return dsThiSinh;
    }

    public void setDsThiSinh(ArrayList<ThiSinh> dsThiSinh) {
        this.dsThiSinh = dsThiSinh;
    }
    public void Insert(ThiSinh thiSinh){
        this.dsThiSinh.add(thiSinh);
    }
    public void delete(ThiSinh thiSinh){
        this.dsThiSinh.remove(thiSinh);
    }
    public void update(ThiSinh thiSinh){
        this.dsThiSinh.remove(thiSinh);
        this.dsThiSinh.add(thiSinh);
    }

    public String getLuachon() {
        return luachon;
    }

    public void setLuachon(String luachon) {
        this.luachon = luachon;
    }
}
