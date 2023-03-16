/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import model.Nhanvien;

/**
 *
 * @author zung
 */
public class test {
    public static void main(String[] args) {
         ArrayList listnv =new ArrayList();
        try {
            FileReader fr = new FileReader("nhanvien.txt");
            BufferedReader br = new BufferedReader(fr);
            String s = "";
            while ((s = br.readLine()) != null) {
                String[] mang = s.split("\\$");
                Nhanvien nv = new Nhanvien(mang[0], mang[1], mang[2], mang[3],
                        mang[4], Float.parseFloat(mang[5]), Integer.parseInt(mang[6]),
                        Float.parseFloat(mang[7]));
                listnv.add(nv); 
                nv.showInfor();
            }
            br.close();
            fr.close();

        } catch (Exception e) {
          
            
        }
        for(int i=0;i<listnv.size();i++){
            Nhanvien nv =(Nhanvien) listnv.get(i);
            nv.showInfor();
        }

    }
}
