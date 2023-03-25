/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.nhanvien;

public class FileIO {

    public static void readFromFile(ArrayList listObj, String file) {
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String s = "";
            while ((s = br.readLine()) != null) {
                String mang[] = s.split("\\$");
                nhanvien nv = new nhanvien(mang[0], mang[1], mang[2], mang[3], mang[4],
                        Integer.parseInt(mang[5]), Float.parseFloat(mang[6]), Float.parseFloat(mang[7]));
                listObj.add(nv);
            }
            br.close();
            fr.close();
            JOptionPane.showMessageDialog(null, "luu file thanh cong");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "luu file that bai");
        }
    }
}
