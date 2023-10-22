package com.itheima;

public class Example13 {
    public static void main(String[] args) {
        Thread thread=new Thread();
        thread.interrupt();
        //向控制台打印当前线程是否中断
        System.out.println(thread.isInterrupted());
    }
}