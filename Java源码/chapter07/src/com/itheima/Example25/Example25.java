package com.itheima;

import java.util.Arrays;

public class Example25 {
    public static void main(String[] args) {
        int[] arr = { 9, 8, 3, 5, 2 };
        Arrays.sort(arr);                            // 对数组进行排序
        int index = Arrays.binarySearch(arr, 3); // 查找指定元素3
        System.out.println("元素3的索引是:" + index);
    }
}