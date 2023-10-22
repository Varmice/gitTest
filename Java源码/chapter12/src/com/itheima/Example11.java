package com.itheima;

public class Example11 {
    public static void main(String[] args) throws InterruptedException {
        // 创建线程
        Thread thread = new Thread(new JoinRunnable(),"thread");
        thread.start(); // 开启线程
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName()+"输出："+i);
            if (i == 2) {
                thread.join(3000); // 调用join()方法并将参数设置为3000
            }
        }
    }
}

class JoinRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"输出："+i);
        }
    }
}
