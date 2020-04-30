package com.learning.java8.Java8NewFeatureDurgaSoft.PredicateFunctionInterfacePkg;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

class Empl{
    String name;
    int salary;

    public Empl(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class BiPredicateExample3 {

    private static BiPredicate<Empl,Empl> predicate = (e1,e2)->e1.salary>e2.salary;

    private static BiFunction<Empl,Empl,String> biPredicate = (e1,e2)->{
        if(predicate.test(e1,e2)){
            return e1.name;
        }else{
            return e2.name;
        }
    };

    public static void main(String[] args) {

        Empl empl1 = new Empl("Rahul",12000);
        Empl empl2 = new Empl("Mendiratta",14000);

        System.out.println(biPredicate.apply(empl1,empl2));

    }
}
