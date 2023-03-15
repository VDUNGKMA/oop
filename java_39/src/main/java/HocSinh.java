
public class HocSinh extends ConNguoi{
    
   private String tenlop,tentruong;

    public HocSinh( String hoten, int namsinh,String tenlop, String tentruong) {
        super(hoten, namsinh);
        this.tenlop = tenlop;
        this.tentruong = tentruong;
    }

    public String getTenlop() {
        return tenlop;
    }

    public void setTenlop(String tenlop) {
        this.tenlop = tenlop;
    }

    public String getTentruong() {
        return tentruong;
    }

    public void setTentruong(String tentruong) {
        this.tentruong = tentruong;
    }
   

    

    

   
    
    
}
