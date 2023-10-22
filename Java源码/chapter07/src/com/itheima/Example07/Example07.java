package com.itheima;

import java.util.HashSet;
import java.util.Iterator;

public class Example07 {
    public static void main(String[] args) {
        HashSet hset = new HashSet();   // 创建HashSet集合
        hset.add("张三");                  // 向该Set集合中添加字符串
        hset.add("李四");
        hset.add("王五");
        hset.add("李四");                  // 向该Set集合中添加重复元素
        Iterator it = hset.iterator();  // 获取Iterator对象
        while (it.hasNext()) {          // 通过while循环，判断集合中是否有元素
            Object obj = it.next();// 如果有元素，就调用迭代器的next()方法获取元素
            System.out.println(obj);
        }
    }
}