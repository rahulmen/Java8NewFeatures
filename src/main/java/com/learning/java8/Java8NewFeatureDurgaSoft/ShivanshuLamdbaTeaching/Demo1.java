package com.learning.java8.Java8NewFeatureDurgaSoft.ShivanshuLamdbaTeaching;


import java.util.function.BiFunction;
import java.util.function.Function;

public class Demo1 {

    static BiFunction<Integer,Integer,Integer> biFunction = (i1,i2)->i1+i2;

    public static void main(String[] args) {

        System.out.println(biFunction.apply(10,20));

        Runnable r= ()->{
                System.out.println(Thread.currentThread().getName());
                System.out.println("Run method Executed");
        };

        Thread thread = new Thread(r);
        thread.start();



    }
}
