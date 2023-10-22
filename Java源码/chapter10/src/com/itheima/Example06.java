package com.itheima;

import java.io.File;

public class Example06 {
    public static void main(String[] args) {
        // 创建一个代表目录的File对象
        File file = new File("D:\\javase03");
        fileDir(file);					 // 调用FileDir方法
    }
    public static void fileDir(File dir) {
        File[] files = dir.listFiles();   // 获得表示目录下所有文件的数组
        for (File file : files) {		 // 遍历所有的子目录和文件
            if (file.isDirectory()) {
                fileDir(file);			 // 如果是目录，递归调用fileDir()
            }
            System.out.println(file.getAbsolutePath()); // 输出文件的绝对路径
        }
    }
}