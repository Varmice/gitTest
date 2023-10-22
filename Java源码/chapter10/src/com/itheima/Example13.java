package com.itheima;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Example13{
	public static void main(String[] args) throws Exception {
		// 创建一个字节输入流，用于读取当前目录下source文件夹中的文件a.png
		InputStream in = new FileInputStream("source/a.png");
		// 创建一个文件字节输出流，用于将读取的数据写入当前目录的target文件中
		OutputStream out = new FileOutputStream("target/b.png");
		// 以下是用缓冲区读写文件
		byte[] buff = new byte[1024];	// 定义一个字节数组，作为缓冲区
		// 定义一个int类型的变量len记住读取读入缓冲区的字节数
		int len;
		long begintime = System.currentTimeMillis();
		while ((len = in.read(buff)) != -1) { // 判断是否读到文件末尾
			out.write(buff, 0, len);  // 从第一个字节开始，向文件写入len个字节
		}
		long endtime = System.currentTimeMillis();
		System.out.println("复制文件所消耗的时间是：" + (endtime - begintime) + 
		"毫秒");
		in.close();
		out.close();
	}
}