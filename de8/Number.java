package src;

import java.util.Scanner;

public class Number {

    private int min;
    private int max;
    private int value;

    public Number(int min, int max, int value) {
        this.min = min;
        this.max = max;
        this.value = value;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap gia tri min; ");
        this.min = sc.nextInt();
        System.out.println("nhap gia tri max: ");
        this.max = sc.nextInt();
        System.out.println("nhap value: ");
        this.value = sc.nextInt();
    }

    public Boolean kiemtranguyento() {
        if (this.value < 2) {
            return false;
        } else if (this.value == 2) {
            return true;
        }
        for (int i = 2; i < this.value / 2; i++) {
            if (this.value % i == 0) {
                return false;
            }
        }

        return true;
    }

}
