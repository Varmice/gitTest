
package com.itheima.Example11;

class Student {
    private String name;
    private int age;
    public Student () {
        System.out.println("调用了无参的构造方法");
    }
    public Student (String name,int age) {
        this();                  // 调用无参的构造方法
        this.name = name;
        this.age = age;
    }
    public String read(){
        return "我是:"+name+",年龄:"+age;
    }
}
public class Example11 {
    public static void main(String[] args) {
        Student stu = new Student("张三",18);    // 实例化 Student对象
        System.out.println(stu.read());
    }
}

