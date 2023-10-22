
package com.itheima.Example09;

class Student {
    private String name;
    private int age;
    // 定义构造方法
    public Student(String name,int age) {
        name = name;
        age = age;
    }
    public String read(){
        return "我是:"+name+",年龄:"+age;
    }
}
public class Example09 {
    public static void main(String[] args) {
        Student stu = new Student("张三", 18);
        System.out.println(stu.read());
    }
}

