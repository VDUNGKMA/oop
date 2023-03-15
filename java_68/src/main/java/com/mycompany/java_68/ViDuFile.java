package com.mycompany.java_68;

import java.io.File;
import java.util.Scanner;

public class ViDuFile {
    
    File file;

    public ViDuFile(String tenfile) {
        this.file = new File(tenfile);
    }
    public boolean kiemTraThucThi(){
        return this.file.canExecute();
    }
    public boolean kiemTraDoc(){
        return this.file.canRead();
        
    }
    public boolean  kiemTraGhi(){
        return this.file.canWrite();
    }
    public String inDuongDan(){
        return this.file.getAbsolutePath();
    }
    public String inTenfile(){
        return this.file.getName();
    }
    public boolean kiemtra_la_thumuc(){
       return this.file.isDirectory();
    }
    public void inDanhSachFileCon(){
        if(this.file.isDirectory()){
            System.out.println("cac tap tin con /thu muc la:");
           File [] mangCon=this.file.listFiles();
            for (File file1 : mangCon) {
                System.out.println(file1.getAbsolutePath());
            }
        }
            
        else if(this.file.isFile()){
                System.out.println("day khong phai thu muc khong the in tap tin con");
                }
    }
    public void inCayThuMuc(){
        this.inChiTietCayThuMuc(this.file ,1 );
    }
    public void inChiTietCayThuMuc(File f,int bac){
        for(int i=0 ;i<bac ;i++){
            System.out.print("\t");
        }
        System.out.print("|__");
        System.out.println(f.getName());
        if(f.canRead()&&f.isDirectory()){
            File [] mangcon= f.listFiles();
            for (File file1 : mangcon) {
                inChiTietCayThuMuc(file1, bac+1);
            }
        }
    }
    public static void main(String[] args) {
        
        
        int luachon = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao 1 file ");
        String tenfile =sc.nextLine();
        ViDuFile vdf =new ViDuFile(tenfile);
        do {
            System.out.println("MENU------");
            System.out.println("1.kiem tra file co the thuc thi");
            System.out.println("2.kiem tra file co the doc");
            System.out.println("3.kiem tra file co the ghi");
            System.out.println("4.In duong dan");
            System.out.println("5.in ten file");
            System.out.println("6.kiem tra file laf tap tin hay thu muc ");
            System.out.println("7.in ra danh sach file con");
            System.out.println("8. in ra cay thu muc");
            System.out.println("0.Thoat");
            luachon =sc.nextInt();
            switch (luachon) {
                case 1:
                    System.out.println( vdf.kiemTraThucThi());
                    break;
                    case 2:
                        System.out.println(vdf.kiemTraDoc());
                    break;
                     case 3:
                         System.out.println(vdf.kiemTraGhi());
                    break; 
                     case 4:
                         System.out.println(vdf.inDuongDan());
                    break; 
                     case 5:
                         System.out.println("ten file: "+vdf.inTenfile());
                    break; 
                     case 6:
                         System.out.println("day la thu muc "+vdf.kiemtra_la_thumuc());
                    break;
                     case 7:
                         vdf.inDanhSachFileCon();
                    break;
                     case 8:
                         vdf.inCayThuMuc();
                    break;
                     case 0:
                         System.exit(luachon);
                default:
                    throw new AssertionError();
            }
        } while (luachon != 0);
        
    }

    

    
}
