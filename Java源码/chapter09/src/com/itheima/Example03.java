package com.itheima;

//class Person{
//    private String name;
//    private int age;
//    public Person(String name,int age){			//定义有参构造方法
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
class Example03 {
  public static void main(String args[]){
      Class<?> c = null; 
     try{
          c = Class.forName("com.itheima.Person");
      }catch(ClassNotFoundException e){
         e.printStackTrace();
      }
     Person per = null;
      try{
        per = (Person)c.newInstance();
      }catch (Exception e){
         e.printStackTrace();
      }
  }
}