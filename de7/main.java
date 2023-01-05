/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

import java.util.ArrayList;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ArrayList<Thisinh> listSV =new ArrayList<Thisinh>();
        System.out.println("nhap so luong thi sinh");
        int n= Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
        System.out.println("ban muon nhap thi sinh A hay C ");
        String s= sc.nextLine();
        if(s.equals("A")||s.equals("a")){
           
            Thisinh tsa =new ThisinhkhoiA();
            tsa.nhap();
            listSV.add(tsa);
        }
        else if(s.equals("C")||s.equals("c")) {
            Thisinh tsc =new ThisinhkhoiC();
            tsc.nhap();
            listSV.add(tsc);
        }
        else 
                System.out.println("ban da nhap sai");
         System.out.println("--------------------------------");
    }
        System.out.println("danh sach thi trung tuyen");
        for(Thisinh ts :listSV){
            if(ts.check()==true)
                ts.hienthi();
        }
       
}
}