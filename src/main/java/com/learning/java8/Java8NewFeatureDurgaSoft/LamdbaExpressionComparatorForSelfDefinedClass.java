package com.learning.java8.Java8NewFeatureDurgaSoft;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class LamdbaExpressionComparatorForSelfDefinedClass {

  public static void main(String[] args) {

    Student student1 = new Student("Prashant",5);
    Student student2 = new Student("Rahul",1);
    Student student3 = new Student("Neeraj",3);

    List<Student> list = new ArrayList<Student>();
    list.add(student1);list.add(student2);list.add(student3);

    Collections.sort(list,(obj1,obj2)->{
      Student s1 = (Student)obj1;
      Student s2 = (Student)obj2;
      return s1.name.length()>s2.name.length()?-1:s1.name.length()<s2.name.length()?+1:0;
    });
    list.stream().forEach(s-> System.out.println(s.name));
  }
}


class Student{

  String name;
  Integer rollNumber;

  public Student(String name,Integer rollNumber){
    this.name=name;
    this.rollNumber=rollNumber;
  }
}
