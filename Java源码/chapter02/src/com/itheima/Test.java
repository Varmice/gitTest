package com.itheima;

public class Test {
    public static void main(String[] args){
      /*  int i, j;                           		// 定义两个循环变量
        for (i = 1; i <= 9; i++) {      			// 外层循环
            for (j = 1; j <= i; j++) { 			    // 内层循环
                System.out.print("*"); 			    // 打印*
            }
            System.out.print("\n");     			// 换行
        }*/

    //while循环
    int num=0;
        while (num<=10){
        if (num%2!=0){
            System.out.print(num+",");
        }
        num++;
    }
        System.out.println("");
    //do...while循环
    int num2=0;
        do {
        if(num2%2!=0){
            System.out.print(num2+",");
        }
        num2++;
    }while (num2<=10);
        System.out.println("");
    //for循环
        for (int i=1;i<=10;i++){
        if (i%2!=0){
            System.out.print(i+",");
        }
    }
}
}
