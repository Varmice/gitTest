package com.itheima;

import java.time.Instant;

public class InstanceDemo1 {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant.getNano()/1000000000);
    }
}
