package com.learning.java8.Java8NewFeatureDurgaSoft.PrimitiveTypeFunctionalInterface;

import java.util.function.ObjDoubleConsumer;

class Student{
    String name;
    double salary;

    public Student(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class ObjDoubleConsumerExample1 {

    private static ObjDoubleConsumer<Student> objectObjDoubleConsumer = (o,d)-> {
        System.out.println("Old Salary :"+o.salary);
        o.salary=o.salary+d;
        System.out.println("Incremented Salary :"+o.salary);
    };

    public static void main(String[] args) {
        Student s = new Student("Rahul",1600000);
        objectObjDoubleConsumer.accept(s,400000.0);

    }

}
