package com.itheima;//package com.itheima;
//
//import java.util.TreeSet;
//class Student implements Comparable{
//    private String name;
//    private int age;
//    public Student(String name,int age) {
//        this.name = name;
//        this.age = age;
//    }
//    // 重写toString()方法
//    public String toString() {
//        return name + ":" + age;
//    }
//    //重写Comparable接口的compareTo()方法
//    public int compareTo(Object obj) {
//        Student stu = (Student)obj;
//        //定义比较方式，先比较age，再比较name
//        if(this.age - stu.age > 0){
//            return 1;
//        }
//        if(this.age - stu.age == 0){
//            return this.name.compareTo(stu.name);
//        }
//        return -1;
//    }
//}
//public class Example12 {
//    public static void main(String[] args) {
//        TreeSet ts = new TreeSet();
//        ts.add(new Student("Lucy",18));
//        ts.add(new Student("Tom",20));
//        ts.add(new Student("Bob",20));
//        ts.add(new Student("Tom",20));
//        System.out.println(ts);
//    }
//}