package com.learning.java8.Java8NewFeatureDurgaSoft.OOPS;

import java.util.HashMap;
import java.util.Map;

public class run {


    public static void main(String[] args) {

        test1 t = new test1() {
            public void m1() {
                System.out.println("Child method");
                System.out.println(this.getClass().getName());
            }
        };
        test1 t2 = new test1();
        t.m1();
        System.out.println("======");
        t2.m1();


        Map<Character, Integer> m = new HashMap<>();
        m.put('a',123);

        Map<Character, Integer> m1 = new HashMap<>();

        m.entrySet().stream().forEach(e->m1.put(e.getKey(),e.getValue()));

        System.out.println(m1);

    }



}
