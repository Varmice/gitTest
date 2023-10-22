package com.itheima;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
//public class TCPServer {
//    public static void main(String[] args) throws Exception {
//        Socket client = null;                        //声明Socket对象
//        OutputStream os = null;                      //声明OutputStream对象
//        //创建ServerSocket对象并指定端口号（7788）
//	   ServerSocket serverSocket = new ServerSocket(7788);
//        System.out.println("服务器正在运行，等待与客户端连接");
//        client = serverSocket.accept();             //程序阻塞，等待客户端连接
//        os = client.getOutputStream();              //获取客户端的输出流
//        System.out.println("开始与客户端交互数据");
//        // 当客户端连接到服务器端时，向客户端输出数据
//        os.write(("北京欢迎你！").getBytes());
//        Thread.sleep(5000);                           //模拟执行其他功能占用的时间
//        System.out.println("结束与客户端交互数据");
//        os.close();
//        client.close();
//    }
//}


public class TCPServer {
    public static void main(String[] args) throws Exception {
        //创建 ServerSocket 对象,监听指定的端口
        ServerSocket serverSocket = new ServerSocket(7788);
        //使用 while 循环不停地接收客户端发送的请求
        while (true) {
            //调用 ServerSocket 的 accept()方法等待客户端的连接
            final Socket client = serverSocket.accept();
            int port = client.getPort();
            System.out.println("与端口号为" + port + "的客户端连接成功!");
            //下面的代码用来开启一个新的线程
            new Thread() {
                public void run() {
                    OutputStream os = null; //定义一个输出流对象
                    try {
                        os = client.getOutputStream(); //获取客户端的输出流
                        System.out.println("开始与客户端交互数据");
                        os.write(("北京欢迎你!").getBytes());
                        Thread.sleep(5000); //使线程休眠 5000ms
                        System.out.println("结束与客户端交互数据");
                        os.close(); //关闭输出流
                        client.close(); //关闭 Socket 对象
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                };
            }.start();
        }
    }
}