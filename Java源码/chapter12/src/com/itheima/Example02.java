package com.itheima;

public class Example02 {
	public static void main(String[] args) {
		MyThread02 myThread = new MyThread02(); // 创建MyThread02的线程对象
		myThread.start(); // 开启线程
		while (true) { // 通过死循环语句打印输出
			System.out.println("main()方法在运行");
		}
	}
}

class MyThread02 extends Thread {
	public void run() {
		while (true) { // 通过死循环语句打印输出
			System.out.println("MyThread类的run()方法在运行");
		}
	}
}