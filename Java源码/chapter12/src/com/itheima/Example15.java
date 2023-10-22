package com.itheima;

public class Example15 {
	public static void main(String[] args) {
		SaleThread saleThread = new SaleThread(); // 创建SaleThread对象
		// 创建并开启四个线程
		new Thread(saleThread, "线程一").start();
		new Thread(saleThread, "线程二").start();
		new Thread(saleThread, "线程三").start();
		new Thread(saleThread, "线程四").start();
	   }
}

// 定义SaleThread类实现Runnable接口
class SaleThread implements Runnable {
	private int tickets = 10; 						// tickets表示总票数：10张票
	public void run() {
		while (tickets > 0) {
			try {
				Thread.sleep(300); 					//线程休眠300毫秒
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "---卖出的票"
					+ tickets--);
		}
	}
}