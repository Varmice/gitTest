package com.itheima;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Example10{
	public static void main(String[] args) throws Exception {
		// 创建一个文件字节输出流，并指定输出文件名称
		OutputStream out = new FileOutputStream("example.txt");
		String str = "传智教育";
		byte[] b = str.getBytes();
		for (int i = 0; i < b.length; i++) {
			out.write(b[i]);
		}
		out.close();
	}
}