package com.itheima;

import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class Example02 {
    public static void main(String[] args) throws Exception {
       URL url = new 
			URL("http","www.itcast.cn",80,"/subject/uidszly/index.html");
        InputStream input = url.openStream();
        Scanner scan = new Scanner(input);
        scan.useDelimiter("\n");
        while(scan.hasNext()){
            System.out.println(scan.next());
        }
    }
}