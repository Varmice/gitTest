package com.itheima;

import java.text.DecimalFormat;

public class DeDemo1 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println(df.format(3.567));
    }


}
