package com.itheima;

public class ArrayMax {
    public static void main(String[] args) {
        int[] a = {89,78,85,67,92,74,99,81};
        double sum = 0;
        for(int i=0;i<a.length;i++){
            System.out.printf("%3d",a[i]);
            sum = sum + a[i];
        }
        System.out.println(sum/ a.length);
    }
}
