
package com.itheima.Example03;
class Student{
    String name;       						// 声明姓名属性
    int age;           						// 声明年龄属性
    void read() {
        System.out.println("大家好，我是"+name+"，年龄"+age);
    }
}
public class Example03 {
    public static void main(String[] args) {
        Student stu = new Student();	// 创建学生对象
        stu.name = "张三";	              // 为对象的name属性赋值
        stu.age = -18;	                  // 为对象的age属性赋值
        stu.read();	                       // 调用对象的方法
    }
}

