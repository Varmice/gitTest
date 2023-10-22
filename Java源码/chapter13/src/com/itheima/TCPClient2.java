package com.itheima;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCPClient2 {
    public static void main(String[] args) throws Exception {
        Socket client = null;                               //声明Socket对象
        client = new Socket("localhost",7788);           //指定连接的主机端口号
        BufferedReader buf = null;      //声明BufferedReader对象，用于接收信息
        buf = new BufferedReader(
                new InputStreamReader(
                        client.getInputStream()              //取得客户端的输入流
                )
        );
        String str = buf.readLine();                        //读取信息
        System.out.println("服务器端输出内容:"+str);
        client.close();                                        //关闭Socket
        buf.close();                                            //关闭输入流
    }
}