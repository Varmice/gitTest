package com.itheima;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Example16 {
    public static void main(String[] args) throws Exception {
        // 创建一个字节输入流in，并指定源文件为src.txt
        FileInputStream in = new FileInputStream("src.txt");
        // 将字节输入流in转换成字符输入流isr
        InputStreamReader isr = new InputStreamReader(in);
        // 创建一个字节输出流对象out，并指定目标文件为des.txt
        FileOutputStream out = new FileOutputStream("des.txt");
        // 将字节输出流out转换成字符输出流osw
        OutputStreamWriter osw = new OutputStreamWriter(out);
        int ch; 					// 定义一个变量用于记录读取的字符
        while ((ch = isr.read()) != -1) { 	// 循环判断是否读取到文件的末尾
            osw.write(ch);  // 将字符数据写入des.txt文件中
        }
        isr.close(); // 关闭字符输入流，释放资源
        osw.close(); // 关闭字符输出流，释放资源
    }
}