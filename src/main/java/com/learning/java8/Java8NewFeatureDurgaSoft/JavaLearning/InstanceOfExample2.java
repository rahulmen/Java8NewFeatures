package com.learning.java8.Java8NewFeatureDurgaSoft.JavaLearning;

import java.util.ArrayList;
import java.util.List;

class Student{
    int marks;
    String name;

    public Student(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    public String toString(){
        return this.marks+" "+this.name;
    }
}

class RegisterStudent extends Student{

    public RegisterStudent(int marks, String name) {
        super(marks, name);
    }

}

public class InstanceOfExample2 {

    static List<Object> list = new ArrayList<>();

    public static void main(String[] args) {
        list.add(new RegisterStudent(1,"Rahul"));
        RegisterStudent s = new RegisterStudent(2,"Mendiratta");
        list.add("String");
        list.add(10);

        if(s instanceof Student){
            list.add(s);
        }

        for(Object o:list){
            if(o instanceof Student){
                System.out.println(o);
            }
        }
    }

}
