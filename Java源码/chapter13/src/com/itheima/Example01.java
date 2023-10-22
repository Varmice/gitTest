package com.itheima;

import java.net.InetAddress;

public class Example01 {
  public static void main(String[] args) throws Exception {
   InetAddress localAddress = InetAddress.getLocalHost();
   InetAddress remoteAddress = InetAddress.getByName("www.itcast.cn");
   System.out.println("本机的IP地址：" + localAddress.getHostAddress());
   System.out.println("www.itcast.cn的IP地址：" + 
						remoteAddress.getHostAddress());
   System.out.println("3秒是否可达主机名为www.itcast.cn的IP地址：" + 
						remoteAddress.isReachable(3000));
	}
}