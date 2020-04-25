package com.learning.java8.Java8NewFeatureDurgaSoft.PredicateEmplyeeManagementApplication;

public class Employee {

    String name;
    int age;
    float salary;
    String desgnation;
    String city;

    public Employee(String name, int age, float salary,String desgnation,String city) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.desgnation=desgnation;
        this.city = city;
    }

    @Override
    public String toString(){
      return String.format("(%s %d %f %s %s)",name,age,salary,desgnation,city);
    }

}
