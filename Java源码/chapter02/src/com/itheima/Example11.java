package com.itheima;

public class Example11 {
    public static void main(String[] args) {
        int week = 2;
        switch (week){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                //当week值为1、2、3、4、5中任意一个时，处理方式相同
                System.out.println("今天是工作日");
                break;
            case 6:
            case 7:
                //当week值为6、7中任意一个时，处理方式相同
                System.out.println("今天是休息日");
                break;
        }
    }
}
