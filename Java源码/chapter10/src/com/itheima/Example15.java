package com.itheima;

import java.io.FileWriter;

public class Example15 {
	public static void main(String[] args) throws Exception {
		// 创建一个FileWriter对象用于向文件中写入数据
		FileWriter writer = new FileWriter("writer.txt");
//		FileWriter writer = new FileWriter("writer.txt",true);
		String str = "你好，传智教育";
		writer.write(str);  // 将字符数据写入到文本文件中
		writer.write("\r\n");  // 将输出语句换行
		writer.close(); // 关闭写入流，释放资源
	}
}