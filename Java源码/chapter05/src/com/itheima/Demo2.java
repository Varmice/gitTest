package com.itheima;
class Aminal{
    void say(){
        System.out.println("animal");
    }
}
class Dog extends Aminal{
    void say(){
        System.out.println("dog");
    }
}
class  Cat extends Aminal{
    void say(){
        System.out.println("cat");
    }
}
public class Demo2 {
    public static void main(String[] args) {
        Aminal an = new Dog();
        an.say();
        Cat cat =null;
//        cat = (Cat) an;
//        cat.say();
        Dog dog = (Dog) an;
        dog.say();
    }
}
