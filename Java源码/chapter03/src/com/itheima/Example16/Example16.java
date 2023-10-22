
package com.itheima.Example16;

class Student{
    String name;    						//成员属性

    public Student(){      				    //构造方法
        System.out.println("我是Student类的构造方法");
    }
    {
        System.out.println("我是构造代码块");
    }
    static {
        System.out.println("我是静态代码块");
    }
}
class Example16{
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student();
        Student stu3 = new Student();
    }
}

