package com.itheima;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

// 定义一个实现Callable接口的实现类
class MyThread04 implements Callable<Object> {
    // 重写Callable接口的call()方法
    public Object call() throws Exception {
        int i = 0;
        while (i++ < 5) {
            System.out.println(Thread.currentThread().getName()
                    + "的call()方法在运行");
        }
        return i;
    }
}

public class Example04 {
    public static void main(String[] args) throws InterruptedException,
            ExecutionException {
        MyThread04 myThread = new MyThread04(); // 创建Callable接口的实例对象
        //使用FutureTask封装MyThread04类
        FutureTask<Object> ft1 = new FutureTask<>(myThread);
        //使用Thread(Runnable target ,String name)构造方法创建线程对象
        Thread thread1 = new Thread(ft1, "thread");
        //调用线程对象的start()方法启动线程
        thread1.start();
        //通过FutureTask对象的方法管理返回值
        System.out.println(Thread.currentThread().getName()
                + "的返回结果："+ ft1.get());
        int a=0;
        while (a++<5) {
            System.out.println("main()方法在运行");
        }
    }
}