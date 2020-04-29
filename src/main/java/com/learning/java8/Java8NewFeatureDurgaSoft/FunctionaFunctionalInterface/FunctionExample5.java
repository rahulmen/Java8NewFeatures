package com.learning.java8.Java8NewFeatureDurgaSoft.FunctionaFunctionalInterface;

/*
Program to find grade of the student as per the student marks
 */

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class Student {
    String name;
    double percentage;

    Student(String name, double percentage) {
        this.name = name;
        this.percentage = percentage;
    }
}

public class FunctionExample5 {

    private static List<Student> list = new ArrayList<>();

    private static void populate() {
        list.add(new Student("Rahul", 90.7));
        list.add(new Student("Sumit", 78.7));
        list.add(new Student("Ankit", 64.7));
        list.add(new Student("Prashant", 54.7));
        list.add(new Student("Rajat", 42.7));
        list.add(new Student("Pranik", 32.7));
    }

    public static void main(String[] args) {
        populate();
        Predicate<Double> predicate1 = d -> d >= 10.0;
        Function<Student, Character> floatCharacterFunction = f -> {
            double percentage = f.percentage;
            if (percentage >= 80)
                return 'A';
            else if (percentage >= 60 && percentage < 80)
                return 'B';
            else if (percentage >= 50 && percentage < 60)
                return 'C';
            else if (percentage >= 35 && percentage < 50)
                return 'D';
            else
                return 'F';
        };

        for (Student s : list) {
            if (predicate1.test(s.percentage)) {
                System.out.println("Name :" + s.name);
                System.out.println("Grade :" + floatCharacterFunction.apply(s));
                System.out.println("==========");
                System.out.println();

            }
        }

    }

}
