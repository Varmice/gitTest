package com.itheima;

import java.lang.reflect.Constructor;

//class Person{
//    private String name;
//    private int age;
//    public Person(String name,int age){
//         this.setName(name);
//         this.setAge(age);
//    }
//    public String getName() {
//        return name;
//   }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public int getAge() {
//        return age;
//    }
//   public void setAge(int age) {
//       this.age = age;
//   }
//    public String toString() {
//        return "姓名："+this.name+",年龄："+this.age;
//    }
//}
class Example04 {
  public static void main(String args[]){
      Class<?> c = null; 
     try{
          c = Class.forName("com.itheima.Person"); //实例化对象c
      }catch(ClassNotFoundException e){
         e.printStackTrace();
      }
     Person per = null;
     Constructor<?> cons[] = null;		//声明Constructor类对象数组cons
     cons = c.getConstructors();		//获取Person类的全部构造方法
      try{
        per = (Person)cons[0].newInstance("张三",30); //实例化Person对象per
      }catch (Exception e){
         e.printStackTrace();
      }
     System.out.println(per);
  }
}