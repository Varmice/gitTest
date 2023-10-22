
package com.itheima.Example14;

class Student {
    String name;                    					// 定义name属性
    int age;                         					// 定义age属性
    static String school = "A大学";    						// 定义school属性
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void info(){
        System.out.println("姓名:" + this.name+"，年龄:" +this. age+
                "，学校:" + school);
    }
}
public class Example14 {
    public static void main(String[] args) {
        Student stu1 = new Student("张三",18);    // 创建学生对象
        Student stu2 = new Student("李四",19);
        Student stu3 = new Student("王五",20);
        stu1.info();
        stu2.info();
        stu3.info();
        stu1.school = "B大学";//修改stu1对象的school的值
        System.out.println("修改stu1学生对象的学生信息为B大学后");
        stu1.info();
        stu2.info();
        stu3.info();
    }
}

