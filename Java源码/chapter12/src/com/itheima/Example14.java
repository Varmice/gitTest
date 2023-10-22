package com.itheima;

public class Example14 {
    public static void main(String[] args) {
       Thread thread = new Thread(new Runnable(){
            public void run() {
                for (int i=0;i<10;i++){
                    if (i==5){
                        Thread.currentThread().interrupt();
                        //向控制台打印线程是否中断
                        System.out.println("thread线程是否已中断----"
 							+Thread.currentThread().isInterrupted());
                    }
                }
            }
        }); 						// 创建MyThread的实例对象
        thread.start();			//启动thread对象
    }
}