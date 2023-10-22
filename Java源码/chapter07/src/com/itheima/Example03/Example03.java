package com.itheima;

import java.util.ArrayList;
import java.util.Iterator;

public class Example03 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList(); // 创建ArrayList集合
        list.add("张三");                     // 向该集合中添加字符串
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        Iterator it = list.iterator(); // 获取Iterator对象
        while (it.hasNext()) {           // 判断ArrayList集合中是否存在下一个元素
            Object obj = it.next();     // 取出ArrayList集合中的元素
            System.out.println(obj);
        }
    }
}