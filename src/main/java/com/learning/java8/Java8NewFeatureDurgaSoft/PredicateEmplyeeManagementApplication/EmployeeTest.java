package com.learning.java8.Java8NewFeatureDurgaSoft.PredicateEmplyeeManagementApplication;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeeTest {

    private static void populate(ArrayList<Employee> arrayList) {
        arrayList.add(new Employee("Rahul", 27, 300000, "Software Engineer", "Pune"));
        arrayList.add(new Employee("Prashant", 45, 1000000, "Manager", "Bangalore"));
        arrayList.add(new Employee("Nikita", 32, 700000, "Business Analyst", "Hyderabad"));
        arrayList.add(new Employee("Rishab", 53, 1300000, "CEO", "Gurgaon"));
    }

    private static void getEmployee(Predicate<Employee> p, ArrayList<Employee> arrayList) {

        for (Employee e : arrayList) {
            if (p.test(e)) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<Employee> arrayList = new ArrayList<>();
        populate(arrayList);
        Predicate<Employee> predicate = Predicate.isEqual(new Employee("Rishab", 53, 1300000, "CEO", "Gurgaon"));
        Predicate<Employee> predicate1 = e -> e.desgnation.equalsIgnoreCase("Software Engineer");
        getEmployee(predicate1, arrayList);

        getEmployee(predicate,arrayList);


    }

}
