package com.learning.java8.Java8NewFeatureDurgaSoft.ShivanshuLamdbaTeaching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Student{
    int marks;
    String name;

    public Student(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    @Override
    public String toString(){
        return this.name+" "+this.marks;
    }
}

public class FunctionExample1 {

    static Predicate<Student> predicate = s->s.marks>100 && s.name.length()>5;

    static Student[] students = new Student[]{new Student(12,"temp"),
            new Student(121,"temp1"),new Student(1211,"temp12"),
            new Student(12111,"temp123")};

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        for(Student student:students){
            if(predicate.test(student)){
                list.add(student);
            }
        }

        System.out.println(list);






    }


}
