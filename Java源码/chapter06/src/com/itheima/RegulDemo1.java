package com.itheima;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegulDemo1 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\d{11}");
        Matcher m = p.matcher("1234567890");
        System.out.println(m.matches());
    }
}
