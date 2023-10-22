package com.itheima;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Example17 {
    public static void main(String[] args) {
        Map map = new HashMap();      // 创建HashMap集合
        map.put("1", "张三");     	 // 存储键和值
        map.put("3", "李四");
        map.put("2", "王五");
        map.put("4", "赵六");
        System.out.println("集合大小为："+map.size());
        System.out.println("判断是否包含传入的键（2）："+map.containsKey("2"));
        System.out.println("判断是否包含传入的值（王五）："+map.containsValue("王五"));
        System.out.println("移除键为1的值是："+map.remove("1"));
        Collection values = map.values();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            Object value = it.next();
            System.out.println(value);
        }
    }
}