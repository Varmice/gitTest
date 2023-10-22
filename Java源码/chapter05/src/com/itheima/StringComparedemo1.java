package com.itheima;

public class StringComparedemo1 {
    public static void main(String[] args) {
        String s1 ="abc";
        String s2 = "abc";
        System.out.println(s1 == s2);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        String s3 = new String("abc");
        System.out.println(s3 == s1);
        System.out.println(s3.hashCode());
        System.out.println(s3.equals(s1));


    }
}
