
package com.itheima.Example12;

class Student{
    String name;    							//成员属性
    {
        System.out.println("我是构造块");    //与构造方法同级
    }
    //构造方法
    public Student(){
        System.out.println("我是Student类的构造方法");
    }
}
public class Example12  {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student();
    }
}

