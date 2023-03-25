
public class ConNguoi {
    private String hoten;
    private int namsinh;

    public ConNguoi(String hoten, int namsinh) {
        this.hoten = hoten;
        this.namsinh = namsinh;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }
    public void an(){
        System.out.println("an uong");
    }
    public void ngu(){
        System.out.println("ngu dem va trua");
    }
    public void lambaitap(){
        System.out.println("lam bai tap ve nha vao toi");
    }
}
