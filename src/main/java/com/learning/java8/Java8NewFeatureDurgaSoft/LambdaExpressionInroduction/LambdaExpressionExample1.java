package com.learning.java8.Java8NewFeatureDurgaSoft.LambdaExpressionInroduction;


@FunctionalInterface
interface Interf1 {

    void getSum(int i, int j);
}


public class LambdaExpressionExample1{

    public static void main(String... args){

        Interf1 interf1 = (a,b) -> System.out.println(a+b);
        interf1.getSum(30,60);
        interf1.getSum(878,4343);

    }

}
