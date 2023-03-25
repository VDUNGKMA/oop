/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author zung
 */
public class FileIO {
     public static void readFromFile(ArrayList listobj,String file){
         try {
             FileReader fr =new FileReader("file");
            BufferedReader br =new BufferedReader(fr);
            String s="";
             while ( (s=br.readLine())!= null) {                 
                 String mang [] =s.split("\\$");
                 
             }
         } catch (Exception e) {
         }
            
        }
}
