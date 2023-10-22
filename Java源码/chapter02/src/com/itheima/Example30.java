package com.itheima;

public class Example30 {
    public static void main(String[] args) {
        int[] arr = { 9, 8, 3, 5, 2 };
        //冒泡排序前,先循环打印数组元素
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); //用于换行
        // 进行冒泡排序
        // 外层循环定义需要比较的轮数(两数对比,要比较 n-1 轮)
        for (int i= 1; i < arr.length; i++) {
            //内层循环定义第 i 轮需要比较的两个数
            for (int j = 0; j < arr.length -i; j++) {
                if (arr[j] > arr[j + 1]) { //比较相邻元素
                    // 下面 3 行代码用于交换相邻两个元素
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        //完成冒泡排序后,再次循环打印数组元素
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
