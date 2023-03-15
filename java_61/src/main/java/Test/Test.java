package Test;
import java.util.Scanner;
import main.DanhSachSinhVien;
import main.SinhVien;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luachon = 0;
        DanhSachSinhVien dssv = new DanhSachSinhVien();
        do {
            System.out.println("MENU");
            System.out.println("1. Thêm sinh viên vào danh sách.\n"
                    + "2."
                    + "In danh sach sinh vien\n"
                    + "3.Kiêm danh tra sách danh sinh sách có rong hay không.\n"
                    + "4.Lay lai so luong sinh vien trong danh sach\n"
                    + "5.Lam rong danh sach sinh vien\n"
                    + "6. Kiêm tra sinh viên có tôn tai trong danh sách hay không, dua trên ma sinh vien\n"
                    + "7. Xóa môt sinh viên ra khoi danh sách dua trên mã sinh viên\n"
                    + "8. Tim kiêm tãt cá sinh viên dua trên Tên duoc nhap tù bàn phim.\n"
                    + "9.Xuat ra danh sach sinh vien co diem tu cao den thap.\n"
                    + "10.Thoat");
            luachon = sc.nextInt();
            sc.nextLine();
            switch (luachon) {
                case 1:
                    System.out.println("nhap ma sinh vien");
                    String masinhvien = sc.nextLine();
                    System.out.println("nhap ho ten ");
                    String hotensinhvien = sc.nextLine();
                    System.out.println("nhap nam sinh ");
                    int namsinh = sc.nextInt();
                    System.out.println("nhap diem ");
                    float diem = sc.nextFloat();
                    SinhVien sv = new SinhVien(masinhvien, hotensinhvien, namsinh, diem);
                    dssv.themSinhVien(sv);
                    break;
                case 2:
                    dssv.indanhsachsinhvien();
                    break;
                case 3:
                    System.out.println("danh sach rong "+dssv.kiemtrarong());
                    break;
                case 4:
                    System.out.println("so luong sinh vien trong danh sach:"+dssv.laySoLuongSinhVien());
                    break;
                case 5:
                    dssv.lamRongDanhSach();
                    break;
                case 6:
                    System.out.println("nhap ma sinh vien can tim ");
                    String msv1 =sc.nextLine();
                    SinhVien sv1 =new SinhVien(msv1);
                    System.out.println("sinh vien co ton tai trong danh sach"+dssv.kiemTraTonTai(sv1));
                    break;
                case 7:
                     System.out.println("nhap ma sinh vien can xoa ");
                    String msv2 =sc.nextLine();
                    SinhVien sv2 =new SinhVien(msv2);
                    System.out.println("xoa sinh vien trong danh sach "+dssv.xoaSinhVien(sv2));
                    break;
                case 8:
                    System.out.println("nhap ten sinh vien can tim kiem ");
                    String ten =sc.nextLine();
                    dssv.timKiemSinhVien(ten);
                    break;
                case 9:
                    dssv.sapXepSinhVienGiamDanTheoDiem();
                    dssv.indanhsachsinhvien();
                    break;
                case 10:
                    System.exit(0);
                    break;

            }
        } while (true);
    }
}
