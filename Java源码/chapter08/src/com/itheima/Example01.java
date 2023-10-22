package com.itheima;

import java.util.ArrayList;
import java.util.List;

public class Example01{
    public static void main(String[] args) {
        // 创建一个只保存Integer类型的List集合
        List intList = new ArrayList();
        intList.add(1);
        intList.add(2);
        //因为失误存放了字符串之外的数据
        intList.add("3");
        for (int i = 0; i < intList.size(); i++) {
            /*因为List里面默认取出的全部Object对象，所以使用之前需要进行强制类型转换。
            * 集合内最后一个元素进行转换时候将出现类型转换异常
            * */
            Integer num=(Integer)intList.get(i);
        }
    }
}