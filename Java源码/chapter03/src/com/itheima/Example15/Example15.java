
package com.itheima.Example15;

class Student {
    private String name;                         		// 声明name属性
    private int age;                              		// 声明age属性
    private static String school = "A大学";   		    // 定义school属性
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void info(){
        System.out.println("姓名:" +this.name+"，年龄:" + this.age+
                "，学校:" + school);
    }
    public static String getSchool() {
        return school;
    }
    public static void setSchool(String s) {
        school = s;
    }
}
class Example15 {
    public static void main(String[] args) {
        Student stu1 = new Student("张三",18);      // 创建学生对象stu1
        Student stu2 = new Student("李四",19);      // 创建学生对象stu2
        Student stu3 = new Student("王五",20);      // 创建学生对象stu3
        System.out.println("----修改前----");
        stu1.info();
        stu2.info();
        stu3.info();
        System.out.println("----修改后----");
        Student.setSchool("B大学");              //为静态属性school重新赋值
        stu1.info();
        stu2.info();
        stu3.info();
    }
}

