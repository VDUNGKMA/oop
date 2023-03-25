
public class HinhTron  extends Hinh{
    private double r;


    public HinhTron(double r, ToaDo toado) {
        super(toado);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double tinhdientich() {
        return Math.PI* Math.pow(r, 2);
    }

   
    
    
}
