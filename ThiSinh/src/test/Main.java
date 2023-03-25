/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.Scanner;
import model.ThiSinh;
import model.ThiSinhKhoiA;
import model.ThiSinhKhoiC;

/**
 *
 * @author zung
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<ThiSinh> listsv;
        listsv = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong sv ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("ban muon nhap thi sinh khoi a hay c: ");
            String s = sc.nextLine();
            if (s.equals("C") || s.equals("c")) {
                ThiSinh tskc = new ThiSinhKhoiC();
                tskc.nhapinfor();
                listsv.add(tskc);
                 System.out.println("--------------------");
            }
            if (s.equals("A") || s.equals("a")) {
                ThiSinh tska = new ThiSinhKhoiA();
                tska.nhapinfor();
                listsv.add(tska);
                System.out.println("--------------------");
            }

        }
         System.out.println("danh sach thi sinh trung tuyen:");
        for (ThiSinh thiSinh : listsv) {
            
           
            if (thiSinh.check() == true) {
                thiSinh.showinfor();
                System.out.println("--------------------");
            }
        }

    }

}
