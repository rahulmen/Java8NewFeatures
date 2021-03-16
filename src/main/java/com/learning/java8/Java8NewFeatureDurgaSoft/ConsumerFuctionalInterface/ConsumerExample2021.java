package com.learning.java8.Java8NewFeatureDurgaSoft.ConsumerFuctionalInterface;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;

class Employee{

    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class ConsumerExample2021 {

    static Employee employee1 = new Employee("Rahul",16);
    static Employee employee2 = new Employee("Rahul1",17);
    static Employee employee3 = new Employee("Rahul2",18);
    static Employee employee4 = new Employee("Rahul3",19);
    static Employee employee5 = new Employee("Rahul",20);

    static List<Employee> employeeList1 = new ArrayList<>
            (Arrays.asList(employee1,employee2,employee3,employee4));
    static List<Employee> employeeList2 = new ArrayList<>
            (Arrays.asList(employee5,employee2,employee3,employee4,employee5));


    static BiFunction<List<Employee>,List<Employee>,List<Employee>> employeeFiltering =
            (e1,e2)->{
                Map<String,Double> stringDoubleMap = new HashMap<>();
                List<Employee> list = new ArrayList<>();
                for(Employee e:e1)stringDoubleMap.put(e.getName(),stringDoubleMap.getOrDefault(e.getName(),0.0)+e.getSalary());
                for(Employee e:e2) stringDoubleMap.put(e.getName(),stringDoubleMap.getOrDefault(e.getName(),0.0)+e.getSalary());
                stringDoubleMap.entrySet().stream().forEach(e->list.add(new Employee(e.getKey(),e.getValue())));
                return list;
            };

    static Consumer<Employee> employeeEmployeeBiConsumer = c1->System.out.println("Name:" + c1.getName()+" Salary:"+c1.getSalary());

    public static void main(String[] args) {
        for(Employee e:employeeFiltering.apply(employeeList1,employeeList2)){
            employeeEmployeeBiConsumer.accept(e);
        }
    }

}
