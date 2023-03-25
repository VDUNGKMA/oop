/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author zung
 */
public class NumBer {
    private int max;
    private int min;
    private int value;

    public NumBer(int max, int min, int value) {
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
    public boolean check_nguyen_to(int n){
        if(n<2)
            return false;
        if(n==2)
            return true;
        else{
            for (int i = 2; i < n/2; i++) {
                if(n%i==0)
                {
                    return false;
                }
            }
        }
        return true;
    }
    
}
