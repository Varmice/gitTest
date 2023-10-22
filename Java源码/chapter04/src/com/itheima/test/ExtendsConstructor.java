package com.itheima.test;
class Animal{
    String name;
    int age;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }
    public void speak(){
        System.out.println("anmila speak.");
    }
}
class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak(){
        System.out.println("dog speak.");
    }

    public void eat(){
        System.out.println("dog eat.");
    }
}
public class ExtendsConstructor {
    public static void main(String[] args) {
        Animal an = new Dog("hei");
         Dog dog1 = (Dog) an;
        an.speak();
        dog1.eat();

        
    }
}
