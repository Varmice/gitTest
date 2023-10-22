package com.itheima;

import java.lang.reflect.Method;
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
public class Example08{
    public static void main(String args[]){
        Class<?> c = null;                               //声明Class对象c
        try{
            c = Class.forName("com.itheima.Person"); //实例化Class对象c
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
 	   //获取全部方法，存储到Method类数组对象m中
        Method m[] = c.getMethods();                   
        for (int i = 0;i < m.length; i++){        //遍历数组m循环输出方法信息
            Class<?> r = m[i].getReturnType();    //获取方法的返回值类型
            Class<?> p[] = m[i].getParameterTypes(); //获取全部的参数类型
           int xx = m[i].getModifiers();                //获取方法的权限修饰符
           System.out.print(Modifier.toString(xx)+" ");  //还原修饰符
           System.out.print(r.getName()+" ");           //获取方法名称
           System.out.print(m[i].getName());            
           System.out.print("(");
           for (int x = 0; x<p.length;x++){             //循环输出方法的参数
               System.out.print(p[x].getName()+" "+"arg"+x);
               if (x<p.length-1) {
                   System.out.print(",");
               }
           }
 		  //获取方法抛出的全部异常
           Class<?> ex[] = m[i].getExceptionTypes();  
           if(ex.length>0){                                //判断是否有异常
               System.out.print(") throws ");
           }else{
               System.out.print(") ");
           }
           for (int j = 0;j<ex.length;j++){
               System.out.print(ex[j].getName());       //输出异常信息
               if(j<ex.length-1){
                   System.out.print(",");
               }
           }
            System.out.println();
        }
    }
}