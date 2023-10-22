package com.itheima;

import java.lang.reflect.Field;

class Person {
    private String name;
    private int age;
    public Person(){}
    public Person(String name){
        this.name = name;
    }
    public Person(String name,int age){
        this.setName(name);
        this.setAge(age);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void sayHello(){
        System.out.println("Hello World!");
    }
    public String toString() {
        return "姓名："+this.name+",年龄："+this.age;
    }
}

public class Example12 {
    public static void main(String args[]) throws Exception{
        Class<?> c = null;                             //声明一个Class对象
        Object obj = null;                             //声明一个Object对象
        c = Class.forName("com.itheima.Person");   //实例化Class对象
        obj = c.newInstance();                         //实例化Object对象
        Field nameField = null;                        //表示name属性
        Field ageField = null;                         //表示age属性
        nameField = c.getDeclaredField("name");     //获取name属性
        ageField = c.getDeclaredField("age");        //获取age属性
        nameField.setAccessible(true);       //将name属性设置为可被外部访问
        nameField.set(obj,"张三");             //设置name属性值
        ageField.setAccessible(true);         //将age属性设置为可被外部访问
        ageField.set(obj,30);                   //设置age属性值
        System.out.println("姓名："+nameField.get(obj));
        System.out.println("年龄："+ageField.get(obj));
    }
}