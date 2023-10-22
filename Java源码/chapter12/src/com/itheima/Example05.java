package com.itheima;/*
package com.itheima;

public class Example05 {
	public static void main(String[] args) {
		new TicketWindow().start(); // 创建并开启第一个线程对象TicketWindow
		new TicketWindow().start(); // 创建并开启第二个线程对象TicketWindow
		new TicketWindow().start(); // 创建并开启第三个线程对象TicketWindow
		new TicketWindow().start(); // 创建并开启第四个线程对象TicketWindow
	}
}
class TicketWindow extends Thread {
	private int tickets = 100;
	public void run() {
		while (tickets > 0) { // 通过while循环判断票数并打印语句
				Thread th = Thread.currentThread(); // 获取当前线程
				String th_name = th.getName(); // 获取当前线程的名字
				System.out.println(th_name + " 正在发售第 " + tickets-- + " 张票 ");
		}
	}
}*/
