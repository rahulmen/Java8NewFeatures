
/*
Program to check whether the given collection is empty or not usinf predicate Lambda expression
 */

package com.learning.java8.Java8NewFeatureDurgaSoft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;


public class PredicateExample3 {

    public static void main(String[] args) {
       Predicate<Collection> predicate = c->c.isEmpty();

        System.out.println(predicate.test(new ArrayList(Arrays.asList("1"))));

    }


}
