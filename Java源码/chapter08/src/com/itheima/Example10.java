package com.itheima;//package com.itheima;
//
//import java.util.ArrayList;
//import java.util.Collection;
//
//public class Example10{
//    // 设定类型通配符的下限，此时传入的类型实参，必须是Number类型或者Number类型的父类
// public static void getElement(Collection<? super Number> coll){}
// public static void main(String[] args) {
//        // 创建Collection对象，传入Number类型的类型实参
//        Collection<Number> list1 = new ArrayList<Number>();
//        // 创建Collection对象，传入Object类型的类型实参
//        Collection<Object> list2 = new ArrayList<Object>();
//        // 创建Collection对象，传入Integer类型的类型实参
//        Collection<Integer> list3 = new ArrayList<Integer>();
//        getElement(list1);
//        getElement(list2);
//        getElement(list3);
//    }
//}