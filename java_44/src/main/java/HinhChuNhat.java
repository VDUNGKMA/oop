
public class HinhChuNhat extends  Hinh{
    private double chieudai;
    private double chieurong;

    public HinhChuNhat(double chieudai, double chieurong, ToaDo toado) {
        super(toado);
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }

    public double getChieudai() {
        return chieudai;
    }

    public void setChieudai(double chieudai) {
        this.chieudai = chieudai;
    }

    public double getChieurong() {
        return chieurong;
    }

    public void setChieurong(double chieurong) {
        this.chieurong = chieurong;
    }

    @Override
    public double tinhdientich() {
        return this.chieudai* this.chieurong;
    }

   
    
}
