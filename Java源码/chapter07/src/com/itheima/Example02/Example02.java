package com.itheima;

import java.util.LinkedList;

public class Example02 {
    public static void main(String[] args) {
        LinkedList link = new LinkedList();   // 创建LinkedList集合
        link.add("张三");
        link.add("李四");
        link.add("王五");
        link.add("赵六");
        System.out.println(link.toString()); // 获取并打印该集合中的元素
        link.add(3, "Student");     // 向link集合中索引3处插入元素Student
        link.addFirst("First");     // 向link集合第一个位置插入元素First
        System.out.println(link);
        System.out.println(link.getFirst()); // 取出link集合中第一个元素
        link.remove(3);               // 移除link集合中指定索引位置为3的元素
        link.removeFirst();          // 移除link集合中第一个元素
        System.out.println(link);
    }
}