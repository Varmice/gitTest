package com.itheima;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Example15 {
    public static void main(String[] args) {
        Map map = new HashMap();      // 创建HashMap集合
        map.put("1", "张三");               // 存储键和值
        map.put("2", "李四");
        map.put("3", "王五");
        Set keySet = map.keySet();         // 获取键的集合
        Iterator it = keySet.iterator();  // 获取Iterator对象
        while (it.hasNext()) {
            Object key = it.next();
            Object value = map.get(key);  // 获取每个键所对应的值
            System.out.println(key + ":" + value);
        }
    }
}