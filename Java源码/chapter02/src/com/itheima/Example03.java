package com.itheima;

public class Example03 {
    public static void main(String[] args) {
        byte b1 = 3; //定义一个byte类型的变量
        byte b2 = 4;
//        byte b3 = b1 + b2;
        byte b3 = (byte)(b1 + b2); //两个byte类型的变量相加，赋值给一个byte类型的变量
        System.out.println("b3="+b3);
    }
}
