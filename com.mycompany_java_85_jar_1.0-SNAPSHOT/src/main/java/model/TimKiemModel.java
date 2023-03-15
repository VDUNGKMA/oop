
package model;


public class TimKiemModel {
    private String vanban;
    private  String tukhoa;
    private String ketqua;

    public TimKiemModel() {
        this.vanban = "";
        this.tukhoa = "";
        this.ketqua = "";
    }

    public String getVanban() {
        return vanban;
    }

    public void setVanban(String vanban) {
        this.vanban = vanban;
    }

    public String getTukhoa() {
        return tukhoa;
    }

    public void setTukhoa(String tukhoa) {
        this.tukhoa = tukhoa;
    }

    public String getKetqua() {
        return ketqua;
    }

    public void setKetqua(String ketqua) {
        this.ketqua = ketqua;
    }
    public void timKiem(){
        int dem=0;
        int vitri=0;
        while (true) {            
            int i=this.vanban.indexOf(this.tukhoa,vitri);
            if(i==-1)
                break;
            else {
                dem++;
                vitri=i+1;
            }
            this.ketqua="Ket qua: co "+dem+this.tukhoa;
        }
        System.out.println(ketqua);
    }
   
    
}
