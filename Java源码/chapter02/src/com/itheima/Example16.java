package com.itheima;

public class Example16 {
    public static void main(String[] args) {
        int x = 1;                              // 定义变量x，初始值为1
        while (x <= 4) {                        // 循环条件
            System.out.println("x = " + x);     // 条件成立，打印x的值
            if (x == 3) {
                break;
            }
            x++;                                // x进行自增
        }

    }
}
