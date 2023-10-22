package com.itheima;

public class Example06 {
    public static void main(String[] args) {
        Inter<String> inter = new InterImpl();
        inter.show("hello");
        Inter<Integer> ii = new InterImpl();
        ii.show(12);
    }
}