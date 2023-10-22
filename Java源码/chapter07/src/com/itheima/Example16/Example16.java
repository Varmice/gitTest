package com.itheima;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Example16 {
    public static void main(String[] args) {
        Map map = new HashMap();         // 创建HashMap集合
        map.put("1", "张三");       		// 存储键和值
        map.put("2", "李四");
        map.put("3", "王五");
        Set entrySet = map.entrySet();
        Iterator it = entrySet.iterator();              // 获取Iterator对象
        while (it.hasNext()) {
            // 获取集合中键值对映射关系
            Map.Entry entry = (Map.Entry) (it.next());
            Object key = entry.getKey();                // 获取Entry中的键
            Object value = entry.getValue();           // 获取Entry中的值
            System.out.println(key + ":" + value);
        }
    }
}