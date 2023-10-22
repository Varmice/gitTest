package com.itheima;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Wangzhan {
    public static void main(String[] args) {
        String html = "<input type=\"text\" class=\"s_ipt\" name=\"wd\" id=\"kw\" maxlength=\"100\"  a=\"b\" autocomplete=\"off\">";
        Pattern pattern = Pattern.compile("\\w+[=][\"][^\"]*[\"]");
//        Pattern pattern = Pattern.compile("\\w+\\s*=\\s*\"[^\"]*\"");
        Matcher matcher = pattern.matcher(html);
        while (matcher.find()) {
            String attr = matcher.group();
            int index = attr.indexOf('=');
            String key = attr.substring(0, index).trim();
            String value = attr.substring(index + 1).replace("\"", "").trim();
            System.out.println(key + " " + value);
        }
    }
}