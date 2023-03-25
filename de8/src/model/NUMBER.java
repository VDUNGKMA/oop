/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.awt.event.ActionListener;
import java.util.Scanner;

/**
 *
 * @author zung
 */
public class NUMBER {
    private int max;
    private int min;
    private int value;

    

    public NUMBER(int max, int min, int value) {
        this.max = max;
        this.min = min;
        this.value = value;
    }
    
    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    public void input(){
        Scanner sc =new Scanner(System.in);
        System.out.println("nhap vao gia tri max: ");
        max=sc.nextInt();
        System.out.println("nhap vao gia tri min: ");
        min=sc.nextInt();
        System.out.println("nhap vao gia tri value: ");
        value=sc.nextInt();
        
    }
    public boolean check_exception(){
        return this.min <this.value && this.value <this.max;
    }
    public boolean check_nguyento(){
        if(this.value <2){
            return false;
        }
        else if(this.value==2){
            return true;
        }
        else {
            for (int i = 2; i < value/2; i++) {
                if(value%2==0)
                    return false;
                
        }
    }
        return true;
    }
    
    
    
}
