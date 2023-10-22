package com.itheima;

// 定义泛型类Person
class Person<T> {
    private T info;
    public Person(T info) {
        this.info = info;
    }
    public T getInfo() {
        return info;
    }
}

public class Example08{
    public static void main(String[] args) {
        // 创建Person对象，传入String类型的类型实参
        Person<?> person = new Person<String>("M1");
        System.out.println( person.getInfo()+"..."+person.getInfo().getClass());
        // 创建Person对象，传入Integer类型的类型实参
        person=new Person<Integer>(666);
        System.out.println( person.getInfo()+"..."+person.getInfo().getClass());
    }
}