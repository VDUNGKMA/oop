/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author zung
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<ThiSinh> listthisinh;
        listthisinh =new ArrayList<>();
        Scanner sc =new Scanner(System.in);
        System.out.println("nhap so luong thi sinh");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("chon khoi A hoac C");
            String s=sc.nextLine();
            if (s.equals("A")||s.equals("a")) {
                ThiSinh thisinhkhoia =new ThiSinhKhoiA();
                thisinhkhoia.nhapthongtin();
                listthisinh.add(thisinhkhoia);
            }
            if (s.equals("C")||s.equals("c")) {
                ThiSinh thisinhkhoic =new ThiSinhKhoiC();
                thisinhkhoic.nhapthongtin();
                listthisinh.add(thisinhkhoic);
            }
            else{
                System.out.println("chon sai lua chon");
            }
        }
        
        
        for (ThiSinh thiSinh : listthisinh) {
            if (thiSinh.kiemtra()==true) {
                thiSinh.inthongtin();
            }

            
        }
    }

}
