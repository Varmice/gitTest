package com.itheima.test1;
class Student{
    private String name;
    private  int age;

    public Student(String name, int age) {
        this.name = name;
        if(age < 0){
            System.out.println("error.");
        }else {
            this.age = age;
        }
    }
}
public class Demo1 {
    public static void main(String[] args) {
        Student s1 = new Student("23",-18);

    }
}
