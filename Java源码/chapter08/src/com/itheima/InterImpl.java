package com.itheima;

//public class InterImpl implements Inter<String> {
//    @Override
//    public void show(String s) {
//        System.out.println(s);
//    }
//}

public class InterImpl<T> implements Inter<T> {
    @Override
    public void show(T t) {
        System.out.println(t);
    }
}