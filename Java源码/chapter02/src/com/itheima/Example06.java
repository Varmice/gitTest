package com.itheima;

public class Example06 {
    public static void main(String[] args) {
        int x = 0;                      //定义变量x，初始值为0
        int y = 0;                      //定义变量y，初始值为0
        int z = 0;                      //定义变量z，初始值为0
        boolean a,b;                    //定义布尔型变量a和b
        a = x > 0 & y++ > 1;            //逻辑运算符&对表达式进行运算
        System.out.println(a);
        System.out.println("y = "+y);
        b = x > 0 && z++ > 1;
        System.out.println(b);          //逻辑运算符&&对表达式进行运算
        System.out.println("z = "+z);
    }
}
