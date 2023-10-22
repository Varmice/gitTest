package com.itheima.test1;
abstract class Animal {
     void speak() {
        System.out.println();
    }

}
class Cat extends Animal {
    @Override
    public void speak() {
        System.out.println("miao");
    }
}

class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("wang");
    }
}

public class Polymorphic {

    public static void testAnimal(Animal animal) {
        animal.speak();
    }

    public static void main(String[] args) {
        Animal cat = new Cat();
        testAnimal(cat);
        Animal dog = new Dog();
        testAnimal(dog);
    }
}
