package Main;

import java.io.File;
import java.util.Scanner;

public class ViDuGhiDoiTuong {

    public static void main(String[] args) {
        int luachon = 0;
        Scanner sc = new Scanner(System.in);
        DanhSachSinhVien ds = new DanhSachSinhVien();
        while (true) {
            System.out.println("1.them sinh vien");
            System.out.println("2.in sinh vien");
            System.out.println("3.luu sinh vien vao file");
            luachon = sc.nextInt();
            sc.nextLine();
            switch (luachon) {
                case 1:
                    String id;
                    System.out.println("nhap id");
                    id = sc.nextLine();
                    System.out.println("nhap ho ten ");
                    String name;
                    name = sc.nextLine();
                    System.out.println("nhap nam sinh ");
                    int namsinh = sc.nextInt();
                    System.out.println("nhap diem tb");
                    float diemtb = sc.nextFloat();
                    SinhVien sv = new SinhVien(id, name, namsinh, diemtb);
                    ds.themsinhvien(sv);
                    break;
                case 2:
                    ds.indanhsachsinhvien();
                    break;
                case 3:
                    String tenfile;
                    System.out.println("nhap ten file");
                    tenfile=sc.nextLine();
                    File f= new File(tenfile);
                    ds.ghidanhsachsinhvien(f);
                    break;
                case 0:
                    System.exit(luachon);                   
            }

        }

        //
    }
}
