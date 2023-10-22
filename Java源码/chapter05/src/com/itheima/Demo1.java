package com.itheima;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        try {
        int m = sc.nextInt();
        int n = sc.nextInt();

            int r = m / n;
            System.out.println(r);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(Long.toHexString(8445097402741811912L));
    }
}
