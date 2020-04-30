package com.learning.java8.Java8NewFeatureDurgaSoft.SupplierFunctionalInterface;

/*
Program to get Random password

Rules :-
Length can be of 8 digits
2,4,6,8 only numbers are allowed
1,3,5,7 Capital letter and #@!% are allowed
 */

import java.util.function.Supplier;

public class SupplierExample4 {

    static Supplier<Integer> getRandomInteger = () -> (int) (Math.random() * 10);
    static Supplier<Character> getRandomCharacter = () -> {
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@%&#";
        return s.charAt((int) (Math.random() * 29));
    };

    static Supplier<String> getPassWord = () -> {
        StringBuilder password = new StringBuilder();
        for (int i = 1; i <= 8; i++) {
            if (i % 2 == 0) {
                password.append(getRandomInteger.get());
            } else {
                password.append(getRandomCharacter.get());
            }
        }
        return new String(password);
    };

    public static void main(String[] args) {
        System.out.println(getPassWord.get());
        System.out.println(getPassWord.get());
        System.out.println(getPassWord.get());
        System.out.println(getPassWord.get());

    }

}
