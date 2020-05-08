package com.learning.java8.Java8NewFeatureDurgaSoft.JavaStreamAPIImportantTopic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

class Student{
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class CollectionStreamExample4 {

    public Consumer<List<Student>> consumer = l->{
        for(Student s:l){
            System.out.println(s.name);
            System.out.println(s.marks);
            System.out.println("=======");
        }
    };

    public Function<Student,Student> listListFunction = s->{
        s.marks=s.marks+10;
        return s;
    };


    private static List<Student> studentArrayList = new ArrayList<>();

    public static void main(String[] args) {
        CollectionStreamExample4 collectionStreamExample4 = new CollectionStreamExample4();
        populate();
        collectionStreamExample4.consumer.accept(studentArrayList); //Before Performing any Stream Operation
        // Increment salary by 10 rupees
        List<Student> cstudentList = studentArrayList.stream().map(collectionStreamExample4.listListFunction).collect(Collectors.toList());
        collectionStreamExample4.consumer.accept(studentArrayList); //Before Performing after Stream Operation
    }

    private static void populate() {
        studentArrayList.add(new Student("Rahul",1));
        studentArrayList.add(new Student("Prashant",2));
        studentArrayList.add(new Student("Neeraj",3));
        studentArrayList.add(new Student("Karan",4));
        studentArrayList.add(new Student("Rajat",5));
    }
}
