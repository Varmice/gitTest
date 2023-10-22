package com.itheima;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

//class Person{
//    private String name;
//    private int age;
//    public Person(){}						//无参构造方法
//    public Person(String name) {			//有一个参数的构造方法
//        this.name = name;
//    }
//    public Person(String name, int age){	//有两个参数的构造方法
//    this.setName(name);
//    this.setAge(age);
//}
//public String getName() {
//    return name;
//}
//public void setName(String name) {
//    this.name = name;
//}
//public int getAge() {
//    return age;
//}
//public void setAge(int age) {
//    this.age = age;
//}
//public String toString() {
//    return "姓名："+this.name+",年龄："+this.age;
//}
//}
public class Example07 {
    public static void main(String args[]){
        Class<?> c1 = null;                                //声明Class对象c1
        try{
           c1 = Class.forName("com.itheima.Person");   //实例化c1
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
 	    //获取全部构造方法，存储到Constructor类数组con中
        Constructor<?> con[]  = c1.getConstructors();
        for (int i = 0;i < con.length;i++){             //循环打印构造方法信息
            //获取构造方法详细信息并输出
		   Class<?> p[] = con[i].getParameterTypes();
            System.out.print("构造方法：");
//            System.out.print(con[i].getModifiers()+" "); //获取构造方法权限
            int mo = con[i].getModifiers();
            System.out.print(Modifier.toString(mo) + " ");
            System.out.print(con[i].getName());           //获取构造方法名称
            System.out.print("（");
            for (int j = 0;j < p.length; j++){
 			  //打印构造方法参数信息
                System.out.print(p[j].getName()+ " arg" +i);
                if (j < p.length-1){
                    System.out.print(",");
                }
            }
            System.out.println("）{}");
        }
    }
}