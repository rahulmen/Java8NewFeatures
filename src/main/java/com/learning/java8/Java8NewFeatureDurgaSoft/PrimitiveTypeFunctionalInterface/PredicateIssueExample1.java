package com.learning.java8.Java8NewFeatureDurgaSoft.PrimitiveTypeFunctionalInterface;

import java.util.function.Predicate;

/*
The below code will work but problem with below code is that As Predicate can only take Object
First primitive to Object conversion will take place by compiler that % function can only be applied to
primitive so object to primitive conversion will also take place.

Hence just to find even number two conversion took place that is from
int -> Integer
and then
Integer -> int


Which will remove the Performance
So Solution to above problem is to use IntPredicate
 */

public class PredicateIssueExample1 {

public static Predicate<Integer> predicate = p->p%2==0;

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        for(int i:arr){
            if(predicate.test(i)){
                System.out.println(i);
            }
        }

    }
}
