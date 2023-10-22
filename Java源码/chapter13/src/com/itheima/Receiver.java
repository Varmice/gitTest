package com.itheima;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

// 接收端程序
public class Receiver {
	public static void main(String[] args) throws Exception {
		byte[] buf = new byte[1024]; // 创建一个字节数组，用于接收数据
         // 定义一个DatagramSocket对象，端口号为8954
		DatagramSocket ds = new DatagramSocket(8954);
         // 定义一个DatagramPacket对象，用于接收数据
		DatagramPacket dp = new DatagramPacket(buf, buf.length);
		System.out.println("等待接收数据");
		ds.receive(dp);                 	 // 接收数据
         /*
 		 调用DatagramPacket的方法获得接收到的信息
          包括数据的内容、长度、发送的IP地址和端口号
 		*/
		String str = new String(dp.getData(), 0, dp.getLength()) +
         " from "+ dp.getAddress().getHostAddress() + ":" + dp.getPort();
		System.out.println(str); 		 // 打印接收到的信息
		ds.close();                 		 // 关闭数据报连接
	}
}