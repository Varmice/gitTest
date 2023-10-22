package com.itheima;
import java.util.Arrays;

public class Example28 {
    public static void main(String[] args) {
        String[] arr = {"program", "creek", "is", "a", "java", "site"};
        Arrays.sort(arr, (m, n) -> Integer.compare(m.length(), n.length()));
        System.out.println("Lambda语句体中只有一条语句，参数类型可推断："+
                Arrays.toString(arr));
        Arrays.sort(arr, (String m, String n) -> {
            if (m.length() > n.length())
                return -1;
            else
                return 0;
        });
        System.out.println("Lambda语句体中有多条语句："+Arrays.toString(arr));
    }
}