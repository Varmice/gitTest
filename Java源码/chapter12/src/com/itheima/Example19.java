package com.itheima;

import java.util.concurrent.locks.ReentrantLock;

public class Example19 {
    public static void main(String[] args) {
        // 创建ReentrantLockTest对象
        ReentrantLockTest reentrantLockTest = new ReentrantLockTest(); 
        // 创建并开启四个线程
        new Thread(reentrantLockTest,"线程一").start();
        new Thread(reentrantLockTest,"线程二").start();
        new Thread(reentrantLockTest,"线程三").start();
        new Thread(reentrantLockTest,"线程四").start();
    }
}

// 定义ReentrantLockTest类实现Runnable接口
class ReentrantLockTest implements Runnable {
    private int tickets = 10;
    private ReentrantLock reentrantLock = new ReentrantLock();
    public void run() {
        while (true) {
            saleTicket(); // 调用售票方法
            if (tickets <= 0) {
                break;
            }
        }
    }
    // 定义一个同步方法saleTicket()
    private  void saleTicket() {
        //调用lock()方法为票数加锁
        reentrantLock.lock();
        if (tickets > 0) {
            try {
                Thread.sleep(300); // 经过的线程休眠300毫秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "---卖出的票"
                    + tickets--);
        }
        //调用lock()方法为票数释放锁
        reentrantLock.unlock();
    }
}