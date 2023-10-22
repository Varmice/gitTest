package com.itheima;

import java.lang.reflect.Method;

//class Person {
//    private String name;
//    private int age;
//    public Person(){}
//    public Person(String name){
//        this.name = name;
//    }
//    public Person(String name,int age){
//        this.setName(name);
//        this.setAge(age);
//    }
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public int getAge() {
//        return age;
//    }
//    public void setAge(int age) {
//        this.age = age;
//    }
//    public void sayHello(){
//        System.out.println("Hello World!");
//    }
//    public String toString() {
//        return "姓名："+this.name+",年龄："+this.age;
//    }
//}
public class Example10 {
    public static void main(String args[]){
        Class<?> c = null;
        try{
            c = Class.forName("com.itheima.Person");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        try{
            Method met = c.getMethod("sayHello");
            met.invoke(c.newInstance());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}