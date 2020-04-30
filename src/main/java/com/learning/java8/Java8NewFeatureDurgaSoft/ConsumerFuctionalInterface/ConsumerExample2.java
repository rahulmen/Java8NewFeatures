package com.learning.java8.Java8NewFeatureDurgaSoft.ConsumerFuctionalInterface;


import com.learning.java8.Java8NewFeatureDurgaSoft.PredicateFunctionInterfacePkg.PredicateExample4;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student3{
    int marks;
    String name;

    public Student3(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }
}


public class ConsumerExample2 {


    private static ArrayList<Student3> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        populate();
        Predicate<Student3> predicate  = p->p.marks>=60;

        Function<Student3,String> student3StringFunction = f->{
            if(f.marks>=80){
                return "A";
            }else if(f.marks>=60){
                return "B";
            }else if(f.marks>=33){
                return "C";
            }else{
                return "F";
            }
        };

        Consumer<Student3> consumer = c->{
            System.out.println(c.name);
        };

        Consumer<Student3> consumer1 = c->{
            System.out.println(c.marks);
        };

        Consumer<Student3> consumer2 = c->{
            System.out.println(student3StringFunction.apply(c));
        };



        for(Student3 student3:arrayList){
            if(predicate.test(student3)){
               consumer.andThen(consumer1).andThen(consumer2).accept(student3);
            }
        }

    }


    private static void populate() {
        arrayList.add(new Student3(56,"Rahul"));
        arrayList.add(new Student3(12,"Sunny"));
        arrayList.add(new Student3(76,"Bunny"));
        arrayList.add(new Student3(97,"Hunny"));
    }


}
