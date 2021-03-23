package com.learning.java8.Java8NewFeatureDurgaSoft;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    String name;
    double percentage;

    Student(String name, double percentage) {
        this.name = name;
        this.percentage = percentage;
    }
}

public class StreamAPI {

    static List<Student> list = new ArrayList<>(new ArrayList<>(Arrays.asList(new Student("Rahul",80),
            new Student("Rahul1",70),new Student("Rahul2",60),new Student("Rahul3",90))));

    public static void main(String[] args) {

        list.stream().filter(s->s.percentage>80).forEach(s->System.out.println(s.name+"=="+s.percentage));

        list.stream().map(s->{
            s.percentage = s.percentage+10;
            s.name = s.name+"ehjdvb";
            return s;
        }).forEach(s-> System.out.println(s.name+"=="+s.percentage));

        list.stream().collect(Collectors.toMap(s->s.name,s->s.percentage)).forEach((k,v)->System.out.println(k+""+v));

        //Filter (Predicate)
        //Map (Function)
        //forEach (Consumer)

    }



}
