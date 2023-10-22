package com.itheima;

public class Demo3 {
    public static void main(String[] args) {
        int m,n;
        m = 12;
        n = 8;
        System.out.println(gcd(m,n));
    }
    public static int gcd(int m,int n){
        int r;
        r = m % n;
        while(r != 0){
            m = n;
            n = r;
            r = m % n;
        }
        return n;
    }
}
