package com.itheima;

public class Example14 {
    public static void main(String[] args) {
        int sum = 0;   							// 定义变量sum，用于存储累加的和
        for (int i = 1; i <= 4; i++) {       	// i的值会从1变到5
            sum += i; 							// 实现sum与i的累加
        }
        System.out.println("sum = " + sum); 	// 打印累加的和
    }
}
