
package com.itheima.Example04;

//// 定义Animal类
class Animal {
    //定义动物叫的方法
    public void shout() {
        System.out.println("动物发出叫声");
    }
}
// 定义Dog类继承Animal类
class Dog extends Animal {
    //重写父类Animal中的shout()方法
//    private void shout() {
//        System.out.println("汪汪汪……");
//    }
}
public class Example04 {
    public static void main(String[] args) {
        Dog dog = new Dog();    // 创建Dog类的实例对象
        dog.shout();            // 调用Dog类重写的shout()方法
    }
}

