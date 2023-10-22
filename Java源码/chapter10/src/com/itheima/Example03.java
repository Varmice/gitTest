package com.itheima;

import java.io.File;
import java.io.IOException;

public class Example03 {
    public static void main(String[] args) throws IOException {
        // 提供临时文件的前缀和后缀
        File f = File.createTempFile("itcast-", ".txt");
        f.deleteOnExit(); // JVM退出时自动删除文件f
        System.out.println("f是否为文件："+f.isFile());
        System.out.println("f的相对路径："+f.getPath());
    }
}