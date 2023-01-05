package De3Oop;


public class Person {

    protected String Hoten ;
    protected String Ngaysinh ;
    protected String Diachi ;
    protected  String Gioitinh ;

    public Person(String Hoten, String Ngaysinh, String Diachi, String Gioitinh) {
        this.Hoten = Hoten;
        this.Ngaysinh = Ngaysinh;
        this.Diachi = Diachi;
        this.Gioitinh = Gioitinh;
    }
    public void hienthi(){
        System.out.println("Ho ten: "+this.Hoten);
        System.out.println("Ngay sinh: "+this.Ngaysinh);
        System.out.println("Dia chi: "+this.Diachi);
        System.out.println("Gioi tinh: "+this.Gioitinh);
    }
}
