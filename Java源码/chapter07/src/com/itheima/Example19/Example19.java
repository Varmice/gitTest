package com.itheima;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Example19 {
    public static void main(String[] args) {
        Map map = new TreeMap();      // 创建TreeMap集合
        map.put(3, "李四");                  // 存储键和值
        map.put(2, "王五");
        map.put(4, "赵六");
        map.put(3, "张三");
        Set keySet = map.keySet();
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            Object key = it.next();
            Object value = map.get(key); // 获取每个键所对应的值
            System.out.println(key+":"+value);
        }
    }
}