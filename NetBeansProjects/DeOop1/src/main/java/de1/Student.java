
package de1;


public class Student extends  Person{
    private String masv;
    private String email;
    private Float Dtk;

    public Student(String hoten, String ngaysinh, String diachi, String gioitinh,String masv,String email,float Dtk) {
        super(hoten, ngaysinh, diachi, gioitinh); //ham cha
        this.masv=masv;
        this.email=email;
        this.Dtk=Dtk;
    }
   

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Float getDtk() {
        return Dtk;
    }

    public void setDtk(Float Dtk) {
        this.Dtk = Dtk;
    }

    @Override
    public void hienthi() {
        super.hienthi(); 
        System.out.println("Ma sv: "+this.masv);
        System.out.println("Email: "+this.email);
        System.out.println("Diem Tong ket: "+this.Dtk);
    }
    
}
