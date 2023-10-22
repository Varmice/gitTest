package com.itheima;

import java.time.Instant;

import static java.time.temporal.ChronoField.NANO_OF_SECOND;

public class Demo2 {
    public static void main(String[] args) {
        Instant ins = Instant.ofEpochSecond(60);
        Instant ins1 = Instant.now();

        System.out.println(ins);
        System.out.println(ins.getEpochSecond());
        System.out.println(ins1.getNano());
        System.out.println(ins.getLong(NANO_OF_SECOND));
    }
}
