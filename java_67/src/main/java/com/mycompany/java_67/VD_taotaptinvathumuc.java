

package com.mycompany.java_67;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class VD_taotaptinvathumuc {

    public static void main(String[] args)  {
         File folder1 =new File("C:\\Users\\zung\\Documents\\NetBeansProjects\\java_67\\src\\main\\java");
         //kiem tra thu muc co ton tai hay khong
         System.out.println("kiem tra folder1 co ton tai hay khong "+folder1.exists());
         //tao thu muc 
         //phuong thuc mkdir()-->tao thu muc 
          File d1 =new File("C:\\Users\\zung\\Documents\\NetBeansProjects\\java_67\\src\\main\\java\\Directory_1");
          d1.mkdir();
          //tao nhieu thu muc cung 1 luc
           File d2 =new File("C:\\Users\\zung\\Documents\\NetBeansProjects\\java_67\\src\\main\\java\\Directory_1\\Directory_2\\Directory3");
          d2.mkdirs();
          // tao tap tin (co duoi .exe ,.doc,.xlss...)
           File file1 =new File("C:\\Users\\zung\\Documents\\NetBeansProjects\\java_67\\src\\main\\java\\Directory_1\\test1.txt");
        try {
            file1.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(VD_taotaptinvathumuc.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }
}
