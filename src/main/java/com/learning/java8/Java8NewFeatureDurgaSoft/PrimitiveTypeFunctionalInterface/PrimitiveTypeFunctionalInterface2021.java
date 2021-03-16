package com.learning.java8.Java8NewFeatureDurgaSoft.PrimitiveTypeFunctionalInterface;

import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.function.ToIntBiFunction;


public class PrimitiveTypeFunctionalInterface2021 {

    static ToIntBiFunction<String,String> toIntBiFunction = (s1,s2)->{
        return s1.length()+s2.length();
    };

    public static void main(String[] args) {
        System.out.println(toIntBiFunction.applyAsInt("cbnebcerbfrjebfe","rejhfbherbfehr"));
    }
}
