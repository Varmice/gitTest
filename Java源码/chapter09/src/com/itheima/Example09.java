package com.itheima;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

//class Person{
//    private String name;
//    private int age;
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
public class Example09{
    public static void main(String[] args){
        Class<?> c1 = null;
        try{
            c1 = Class.forName("com.itheima.Person");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        {
 		   //获取本类属性，存储到Field类数组f当中
            Field f[] = c1.getDeclaredFields();       
            for (int i = 0;i<f.length;i++){            //循环输出属性信息
                Class<?> r = f[i].getType();           //获取属性的类型
                int mo = f[i].getModifiers();          //获取属性权限修饰符
                String priv = Modifier.toString(mo);  //转换属性的权限修饰符
                System.out.print("本类属性：");
                System.out.print(priv+" ");             //输出属性权限修饰符
                System.out.print(r.getName()+" ");     //输出属性类型
                System.out.print(f[i].getName());      //输出属性名称
                System.out.println(";");
            }
        }
    }
}