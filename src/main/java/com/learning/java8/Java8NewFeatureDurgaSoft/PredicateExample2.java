package com.learning.java8.Java8NewFeatureDurgaSoft;

import java.util.function.Predicate;

class Student1{
    int age;
    String name;

     Student1(int age, String name){
        this.age=age;
        this.name=name;
    }
}

public class PredicateExample2 {

    public static void main(String[] args) {
       Predicate<Student1> predicate = s->s.age>2 && s.name.length()>4;

        System.out.println(predicate.test(new Student1(10,"Rahul")));

    }


}
