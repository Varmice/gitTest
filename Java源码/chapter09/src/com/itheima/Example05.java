package com.itheima;

interface China {
    public static final String NATION = "CHINA";
    public static final String AUTHOR = "张三";
}

//class Person implements China {
//    private String name;
//    private int age;
//    public Person(String name, int age) {
//        this.setName(name);
//        this.setAge(age);
//    }
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

public class Example05 {
    public static void main(String args[]) {
        Class<?> c = null;
        try {
            c = Class.forName("com.itheima.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Class<?> cons[] = c.getInterfaces();
        for (int i = 0; i < cons.length; i++) {
            System.out.println("实现的接口名称：" + cons[i].getName());
        }
    }
}