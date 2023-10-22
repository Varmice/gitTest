package com.itheima;

import java.util.ArrayList;
import java.util.List;

public class Example03 {
    public static void main(String[] args) {
        // 创建一个只保存Integer类型的List集合
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        //下面代码将出现编译时异常
//        intList.add("3");
        for (int i = 0; i < intList.size(); i++) {
            //下面的代码无需强制类型转换
            Integer num=intList.get(i);
        }
    }
}