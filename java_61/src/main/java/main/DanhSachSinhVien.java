package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {

    private ArrayList<SinhVien> danhSach;

    public DanhSachSinhVien() {
        this.danhSach = new ArrayList<>();
    }

    public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }

    // them sinh vien vao danh sach
    public void themSinhVien(SinhVien sv) {
        this.danhSach.add(sv);
    }
    // in ra danh sach sinh vien

    public void indanhsachsinhvien() {
        for (SinhVien sinhVien : danhSach) {
            System.out.println(sinhVien);
        }

    }

    // kiem tra danh sach co rong hay khong
    public boolean kiemtrarong() {
        return this.danhSach.isEmpty();
    }

    // lay ra so luong sinh vien trong danh sach
    public int laySoLuongSinhVien() {
//        int dem=0;
//        for (SinhVien sinhVien : danhSach) {
//            dem++;
//        }
//        return dem;
        return this.danhSach.size();
    }

    //lam rong danh sach sinh  vien
    public void lamRongDanhSach() {
        this.danhSach.clear();
    }

    // kiem tra sinh vien co ton tai trong ds khong qua ma sinh vien
    public boolean kiemTraTonTai(SinhVien sv) {
        return this.danhSach.contains(sv);
    }

    // xoa 1 sinh vien ra khoi ds dua tren msv
    public boolean xoaSinhVien(SinhVien sv) {
        return this.danhSach.remove(sv);
    }

    //tim kiem sinh vien dua tren Ten duoc nhap tu ban phim
    public void timKiemSinhVien(String Ten) {
        for (SinhVien sinhVien : danhSach) {
            if (sinhVien.getHoten().indexOf(Ten) >= 0) {
                System.out.println(sinhVien);
            }
        }
    }

    // sap xep sinh vien giam dan theo diem
    public void sapXepSinhVienGiamDanTheoDiem() {
        Collections.sort(danhSach, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                if (sv1.getDiem() > sv2.getDiem()) {
                    return -1;
                } else if (sv1.getDiem() < sv2.getDiem()) {
                    return 1;
                } else {
                    return 0;
                }

            }
        });
    }

}
