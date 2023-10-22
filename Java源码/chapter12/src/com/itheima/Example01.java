package com.itheima;

public class Example01 {
	public static void main(String[] args) {
		MyThread01 myThread = new MyThread01(); 	// 创建MyThread01实例对象
		myThread.run();                         		// 调用MyThread01类的run()方法
		while (true) {                          		// 该循环是一个死循环，打印输出语句
			System.out.println("Main方法在运行");
		}
	}
}

class MyThread01 {
	public void run() {
		while (true) {                          		// 该循环是一个死循环，打印输出语句
			System.out.println("MyThread类的run()方法在运行");
		}
	}
}