package com.learning.java8.Java8NewFeatureDurgaSoft.FunctionaFunctionalInterface;

/*
Program to perform salary increment for employees having salary less than 350 INR using predicate and function.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee1{

    String name;
    double salary;

    public Employee1(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString(){
        return "("+name+" "+salary+")";
    }
}

public class FunctionExample7 {

    private static List<Employee1> employeeList = new ArrayList<>();

    public static void main(String[] args) {

        populate();
        Predicate<Employee1> peedicate = e->e.salary<=350;

        Function<Employee1,Employee1> employee1Employee1Function = e1->{
            if(peedicate.test(e1)){
                e1.salary+=300;
            }
            return e1;
        };

        for(Employee1 e:employeeList){
            employee1Employee1Function.apply(e);
        }

        System.out.println(employeeList);
    }

    private static void populate() {
        employeeList.add(new Employee1("Rahul1",234));
        employeeList.add(new Employee1("Rahul2",432));
        employeeList.add(new Employee1("Rahul3",123));
        employeeList.add(new Employee1("Rahul4",351));
        employeeList.add(new Employee1("Rahul5",350));
        System.out.println(employeeList);
    }


}
