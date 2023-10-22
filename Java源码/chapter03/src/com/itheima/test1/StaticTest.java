package com.itheima.test1;
class P{
    static String name;
    int age;

    public P() {
    }

    public P(int age) {
        this.age = age;
    }

    public static String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void setName(String name) {
        P.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public  void sayHi(){
        System.out.println("i am " + name + ", i am " + age + " years old.");
    }
}
public class StaticTest {
    public static void main(String[] args) {
        P p1 = new P();
        P p2 = new P(19);
        p2.name = "zs";
        p1.sayHi();
        p1.name = "ls";
        p2.sayHi();
    }
}
