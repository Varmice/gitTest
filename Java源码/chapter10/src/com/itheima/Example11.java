package com.itheima;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Example11{
	public static void main(String[] args) throws Exception {
          //创建文件输出流对象，并指定输出文件名称和开启文件内容追加功能
		OutputStream out = new FileOutputStream("example.txt ", true);
		String str = "欢迎你!";
         //将字符串存入byte类型的数组中
		byte[] b = str.getBytes();
		for (int i = 0; i < b.length; i++) {
			out.write(b[i]);
		}
		out.close();
	}
}