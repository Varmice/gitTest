package com.itheima;

// 定义泛型类Goods
class Goods<T> {
    // 类型形参变量作用于属性的类型
    private T info ;
    // 类型形参变量作用于构造方法的参数类型
    public Goods(T info) {
        this.info = info;
    }
    // 类型形参变量作用于方法的参数类型
    public void setInfo(T info){
        this.info = info ;
    }
    // 类型形参变量作用于方法的返回值类型
    public T getInfo(){
        return this.info ;
    }
}

public class Example04 {
    public static void main(String[] args) {
        // 创建Godds对象
        Goods goods = new Goods<Integer>(666);
        System.out.println(goods.getInfo()+"..."+goods.getInfo().getClass());
        goods.setInfo("热卖商品");
        System.out.println(goods.getInfo()+"..."+goods.getInfo().getClass());
    }
}