package com.learning.java8.Java8NewFeatureDurgaSoft.FunctionaFunctionalInterface;

/*
Program to create a student Object by take name and percentage as input
 */


import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class BiFunctionExample1 {

    private static ArrayList<Student> list = new ArrayList<>();

    private static BiFunction<String, Double, Student> stringDoubleStudentBiFunction = (s, d) -> new Student(s, d);

    private static Consumer<Student> consumer = s -> {
        System.out.println(s.name);
        System.out.println(s.percentage);
        System.out.println("=========");
    };

    private static void populate() {
        list.add(stringDoubleStudentBiFunction.apply("Rahul1",134.34));
        list.add(stringDoubleStudentBiFunction.apply("Rahul2",134.35));
        list.add(stringDoubleStudentBiFunction.apply("Rahul3",134.36));
        list.add(stringDoubleStudentBiFunction.apply("Rahul4",134.37));
    }

    public static void main(String[] args) {
        populate();
        for (Student s : list) {
            consumer.accept(s);
        }
    }
}


