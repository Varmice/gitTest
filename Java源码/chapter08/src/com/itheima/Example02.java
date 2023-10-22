package com.itheima;

import java.util.ArrayList;
import java.util.List;

// 定义一个只存放Integer类型的类
class IntList {
    private List intList=new ArrayList();
    // 添加元素的方法
    public boolean add(Integer e){
        return intList.add(e);
    }
    // 获取元素的方法
    public Integer get(int index){
        return (Integer)intList.get(index);
    }
    // 获取存放元素的个数
    public int size(){
        return intList.size();
    }
}

public class Example02 {
    public static void main(String[] args) {
        // 创建一个只想保存字符串的Integer集合
        IntList intList = new IntList();
        intList.add(1);
        intList.add(2);
        //存放Integer类型之外的数据，将出现编译异常
//        intList.add("E");
        for (int i = 0; i < intList.size(); i++) {
            /*由于限制了存入intList中的数据类型，并且重写了get()方法，
            此时获取intList中的元素不用强制类型转换。*/
            Integer num = intList.get(i);
        }
    }
}