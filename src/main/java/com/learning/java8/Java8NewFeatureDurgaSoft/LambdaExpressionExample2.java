package com.learning.java8.Java8NewFeatureDurgaSoft;

@FunctionalInterface
interface Interf2 {
    int getLength(String s);
}

public class LambdaExpressionExample2 {

    public static void main(String[] args) {
    Interf2 interf2 = s-> s.length();
        System.out.println(interf2.getLength("Rahul Mendiratta"));
    }

}
