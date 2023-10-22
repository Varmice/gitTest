package com.itheima;

//class Person {
//    private String name;
//    private int age;
//
//    public Person(String name, int age) {
//        this.setName(name);
//        this.setAge(age);
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String toString() {
//        return "姓名：" + this.name + ",年龄：" + this.age;
//    }
//}

public class Example06 {
    public static void main(String args[]) {
        Class<?> c1 = null;                                 //声明Class对象
        try {
            c1 = Class.forName("com.itheima.Person");    //实例化Class对象
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Class<?> c2 = c1.getSuperclass();                //取得Person类的父类
        System.out.println("父类名称：" + c2.getName());
    }
}