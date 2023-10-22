package com.itheima;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("1.添加");
            System.out.println("2.删除");
            System.out.println("3.修改");
            System.out.println("4.截取");
            System.out.println("5.终止程序");
            int a;
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            if (a == 1) {
                add();
            } else if (a == 2) {
                remove();
            } else if (a == 3) {
                alter();
            } else if (a == 4) {
                alter();
            } else if (a == 5) {
                break;
            } else {
                System.out.println("输入值错误");
            }
        }
    }

    public static void add() {
        StringBuffer sb = new StringBuffer();
        String b;
        int c, z;
        Scanner sc = new Scanner(System.in);
        System.out.println("1.末尾添加");
        System.out.println("2.指定位置添加");
        z = sc.nextInt();
        if (z == 1) {
            b = sc.next();
            sb.append(b);
        } else if (z == 2) {
            b = sc.next();
            c = sc.nextInt();
            sb.insert(c, b);
        } else {
            System.out.println("输入值错误");
        }
        System.out.println(sb);
    }

        public static void remove() {
            StringBuffer sb = new StringBuffer();
            int c, d, z;
            Scanner sc = new Scanner(System.in);
            System.out.println("1.指定范围删除");
            System.out.println("2.指定位置删除");
            System.out.println("3.清空");
            z = sc.nextInt();
            if (z == 1) {
                c = sc.nextInt();
                d = sc.nextInt();
                sb.delete(c, d);
            } else if (z == 2) {
                c = sc.nextInt();
                sb.deleteCharAt(c);
            } else if (z == 3) {
                sb.delete(0, sb.length());
            } else {
                System.out.println("输入值错误");
            }
            System.out.println(sb);
        }

        public static void alter() {
            StringBuffer sb = new StringBuffer();
            String b;
            Scanner sc = new Scanner(System.in);
            char b2;
            int e, c, d;
            b = sc.next();
            c = sc.nextInt();
            e = sc.nextInt();
            sb.replace(c, e, b);
            System.out.println(sb);
        }

        public static void sub() {
            StringBuffer sb = new StringBuffer();
            int c, d;
            Scanner sc = new Scanner(System.in);
            c = sc.nextInt();
            d = sc.nextInt();
            System.out.println(sb.substring(c, d));
        }

    }






