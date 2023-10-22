package com.itheima;

public class Demo2 {
    public static void main(String[] args) {
        int m,n,r;
        m = 18;
        n = 4;
        r = m % n;
        while(r != 0){
            m = n;
            n = r;
            r = m % n;
        }
        System.out.println(n);
    }
}
