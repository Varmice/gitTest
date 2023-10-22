package com.itheima;

import java.io.File;

public class Example07 {
	public static void main(String[] args) {
		File file = new File("D:\\hello");
		if (file.exists()) {
			System.out.println(file.delete());
		}
	}
}