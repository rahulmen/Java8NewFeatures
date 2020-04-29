package com.learning.java8.Java8NewFeatureDurgaSoft.FunctionaFunctionalInterface;

/*
Write a function to return sum of salary of all the employees
 */

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class Employee{

    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString(){
      return "("+name+" "+salary+")";
    }
}

public class FunctionExample6 {

    private static List<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) {
        populate();

        Function<List<Employee>,Double> employeeDoubleFunction = e->{
            double sum = 0;
            for(Employee employee:e){
                sum=sum+employee.salary;
            }
            return sum;
        };

        System.out.println(employeeDoubleFunction.apply(employeeList));
    }

    private static void populate() {
        employeeList.add(new Employee("Rahul1",567878));
        employeeList.add(new Employee("Rahul2",2443432));
        employeeList.add(new Employee("Rahul3",5434543));
        employeeList.add(new Employee("Rahul4",655434));
        employeeList.add(new Employee("Rahul5",876543));
        System.out.println(employeeList);
    }

}
