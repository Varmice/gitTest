package com.itheima;

import java.util.Scanner;

public class ArrayInput10data {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++){
            a[i] = sc.nextInt();
        }
        for (int x:a
             ) {
            System.out.print(x + " ");

        }
    }
}
