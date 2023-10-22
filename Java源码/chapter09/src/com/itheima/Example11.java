package com.itheima;

import java.lang.reflect.Method;

//class Person{
//    private String name;
//    private int age;
//    public Person(){}
//    public Person(String name){
//        this.name = name;
//    }
//    public Person(String name,int age){
//        this.setName(name);
//        this.setAge(age);
//    }
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public int getAge() {
//        return age;
//    }
//    public void setAge(int age) {
//        this.age = age;
//    }
//    public String toString() {
//        return "姓名："+this.name+",年龄："+this.age;
//    }
//}
public class Example11 {
    public static void main(String args[]){
        Class<?> c = null;
        Object obj = null;
        try{
            c = Class.forName("com.itheima.Person");	//对象c为Class类型
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        try{
           obj = c.newInstance();					//实例化Class对象
        }catch(InstantiationException e){
            e.printStackTrace();
        }catch(IllegalAccessException e){
            e.printStackTrace();
        }
        setter(obj,"name","张三",String.class);
        setter(obj,"age",18,int.class);
        System.out.print("姓名：");
        getter(obj,"name");
        System.out.print("年龄：");
        getter(obj,"age");
        }
public static void setter(Object obj,String att,Object value,Class<?>
 							type){
        try {
         Method met= obj.getClass().getMethod("set"+initStr(att),type);
         met.invoke(obj,value);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void getter(Object obj,String att){
        try {
            Method met= obj.getClass().getMethod("get"+initStr(att));
            System.out.println(met.invoke(obj));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static String initStr(String old){
        String str= old.substring(0,1).toUpperCase()+old.substring(1);
        return str;
    }
}