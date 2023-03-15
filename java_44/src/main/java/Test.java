
public class Test {
    public static void main(String[] args) {
        
        ToaDo toado1= new ToaDo(3, 4);
        Diem point =new Diem(toado1);
        HinhTron circle =new HinhTron(4.3, toado1);
        HinhChuNhat hcn =new HinhChuNhat(4, 3, toado1);
        System.out.println("dien tich diem:"+point.tinhdientich());
        System.out.println("dien tich hinh trong "+circle.tinhdientich());
        System.out.println("dien tich hcn "+hcn.tinhdientich());
        
    }
}
