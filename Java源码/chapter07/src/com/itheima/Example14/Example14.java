package com.itheima;

import java.util.HashMap;
import java.util.Map;

public class Example14 {
    public static void main(String[] args) {
        Map map = new HashMap(); // 创建HashMap对象
        map.put("1", "张三");          // 存储键和值
        map.put("2", "李四");
        map.put("3", "王五");
        System.out.println("1：" + map.get("1"));  // 根据键获取值
        System.out.println("2：" + map.get("2"));
        System.out.println("3：" + map.get("3"));
    }
}