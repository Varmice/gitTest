package com.itheima;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Example08 {
    public static void main(String[] args) {
        new Receive().start();
        new Send().start();
    }
}

class Receive extends Thread {
    public void run() {
        try {
            //创建socket相当于创建码头
            DatagramSocket socket = new DatagramSocket(6666);
            //创建packet相当于创建集装箱
            DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
            while(true) {
                socket.receive(packet);//接收货物
                byte[] arr = packet.getData();
                int len = packet.getLength();
                String ip = packet.getAddress().getHostAddress();
                System.out.println(ip + ":" + new String(arr,0,len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Send extends Thread {
    public void run() {
        try {
            //创建socket相当于创建码头
            DatagramSocket socket = new DatagramSocket();
            Scanner sc = new Scanner(System.in);
            while(true) {
                String str = sc.nextLine();
                if("quit".equals(str))
                    break;
                DatagramPacket packet = new DatagramPacket(str.getBytes(),
                           str.getBytes().length, InetAddress.getByName
                           ("127.0.0.1"), 6666);
                socket.send(packet);//发货
            }
            socket.close();
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }
}