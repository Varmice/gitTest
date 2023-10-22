package com.itheima;

class A{
}

class Example01 {
 public static void main(String args[]){
      Class<?> c1 = null;			//声明Class对象c1
      Class<?> c2 = null;			//声明Class对象c2
      Class<?> c3 = null;			//声明Class对象c3
     try{ 
          c1 = Class.forName("com.itheima.A");//通过第（1）种方式实例化c1对象
     }catch(ClassNotFoundException e){
          e.printStackTrace();
      }
      c2 = new A().getClass();			//通过第（2）种方式实例化c2对象
      c3 = A.class;						//通过第（3）种方式实例化c3对象
      System.out.println("类名称："+c1.getName());
      System.out.println("类名称："+c2.getName());
      System.out.println("类名称："+c3.getName());
  }
}