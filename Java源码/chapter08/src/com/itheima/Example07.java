package com.itheima;

class Student {
    // 静态泛型方法
    public static <T> void staticMethod(T t) {
        System.out.println(t + "..." + t.getClass());
    }
    // 泛型方法
    public <T> void otherMethod(T t) {
        System.out.println(t + "..." + t.getClass());
    }
}

public class Example07 {
    public static void main(String[] args) {
        // 使用方式一调用静态的泛型方法
        Student.staticMethod("staticMethod");
        // 使用方式二调用静态的泛型方法
        Student.<String>staticMethod("staticMethod");
        Student stu = new Student();
        // 使用方式一调用普通的泛型方法
        stu.otherMethod(666);
       // 使用方式二调用普通的泛型方法
        stu.<Integer>otherMethod(666);
    }
}