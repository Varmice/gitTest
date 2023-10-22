package com.itheima;

//class Person{
//   private String name;
//   private int age;
//   public String getName() {
//        return name;
//   }
//   public void setName(String name) {
//        this.name = name;
//    }
//   public int getAge() {
//        return age;
//   }
//   public void setAge(int age) {
//        this.age = age;
//   }
//   public String toString() {
//        return "姓名："+this.name+",年龄："+this.age;
//   }
//}
class Example02 {
  public static void main(String args[]){
      Class<?> c = null; 				//声明Class类对象c
     try{
          c = Class.forName("com.itheima.Person");//调用forName()方法实例化c
      }catch(ClassNotFoundException e){
         e.printStackTrace();
      }
     Person per = null;					//声明Person类对象per
      try{
        per = (Person)c.newInstance();//通过c调用newInstance()方法实例化per
      }catch (Exception e){
         e.printStackTrace();
      }
      per.setName("张三");
      per.setAge(30);
      System.out.println(per);
   }
 }