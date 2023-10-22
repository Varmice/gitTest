package com.itheima;

import java.util.Arrays;

public class Example24 {
    public static void main(String[] args) {
        int[] arr = { 9, 8, 3, 5, 2 };   // 初始化一个数组
        System.out.print("排序前：");
        printArray(arr);                    // 打印原数组
        Arrays.sort(arr);                   // 调用Arrays的sort()方法排序
        System.out.print("排序后：");
        printArray(arr);                    // 打印排序后数组
    }
    // 定义打印数组元素方法
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int x = 0; x < arr.length; x++) {
            if (x != arr.length - 1) {
                System.out.print(arr[x] + ", ");
            } else {
                System.out.println(arr[x] + "]");
            }
        }
    }
}