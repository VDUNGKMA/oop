
public class Main {

    public static void main(String[] args) {
        HoaDonCaphe hoaDonCaphe1 = new HoaDonCaphe("trungnguyenlegen", 100, 4.4);
        HoaDonCaphe hdc2 = new HoaDonCaphe("G7", 120, 54);
        System.out.println("tong $:" + hoaDonCaphe1.tinhtongtien());
        System.out.println("tong $:" + hdc2.tinhtongtien());
        System.out.println("kiem tra khoi luong: " + hoaDonCaphe1.kiemtrasoluonglonhon(8));
        System.out.println("kiem tra khoi luong: " + hdc2.kiemtrasoluonglonhon(6));
        System.out.println("kiem tra so luong >500k " + hoaDonCaphe1.kiemtrasoluonghoadonlonhon500k());
        System.out.println("kiem tra so luong >500k " + hdc2.kiemtrasoluonghoadonlonhon500k());
        System.out.println("giam gia :" + hoaDonCaphe1.sotiengiamgia(20));
        System.out.println("giam gia :" + hdc2.sotiengiamgia(10));
        System.out.println("so tien tra lai khach " + hoaDonCaphe1.sotientralaikhach(20));
        System.out.println("so tien tra lai khach " + hdc2.sotientralaikhach(10));

    }
}
