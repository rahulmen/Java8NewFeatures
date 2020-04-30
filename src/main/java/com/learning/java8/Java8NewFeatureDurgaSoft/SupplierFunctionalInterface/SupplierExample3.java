package com.learning.java8.Java8NewFeatureDurgaSoft.SupplierFunctionalInterface;

/*
Program to create random otp using supplier
 */

import java.io.InputStream;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class SupplierExample3 {

    static Supplier<Integer> getRandomOtp = ()->{
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<6;i++){
            stringBuilder.append((int)(Math.random()*10));
        }
        return Integer.parseInt(new String(stringBuilder));
    };

    public static void main(String[] args) {

        System.out.println(getRandomOtp.get());
        System.out.println(getRandomOtp.get());
        System.out.println(getRandomOtp.get());
        System.out.println(getRandomOtp.get());


    }

}
