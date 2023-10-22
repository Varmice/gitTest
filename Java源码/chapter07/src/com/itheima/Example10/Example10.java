package com.itheima;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Example10 {
    public static void main(String[] args) {
        LinkedHashSet set = new LinkedHashSet();
        set.add("张三");                   // 向该Set集合中添加字符串
        set.add("李四");
        set.add("王五");
        Iterator it = set.iterator();  // 获取Iterator对象
        while (it.hasNext()){           // 通过while循环，判断集合中是否有元素
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}