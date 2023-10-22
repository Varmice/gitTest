package com.itheima;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Student{
    public String name;
    String id;

    public Student() {
    }

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void sayhi(){
        System.out.println(id + " " + name);
    }
}
public class DemoClass {
    public static void main(String[] args) throws ClassNotFoundException {
        Class <?> c = null;
        c = Class.forName("com.itheima.Student");
        System.out.println(c.getClass());
        Field[] cf=c.getFields();
        for (int i = 0; i < cf.length; i++) {
            System.out.println(cf[i].getName());
        }
        Method[] mm=c.getDeclaredMethods();
        for (int i = 0; i < mm.length; i++) {
            System.out.println(mm[i].getName());
        }

    }
}
