package com.learning.java8.Java8NewFeatureDurgaSoft.DateNTimeAPI;

import java.sql.SQLOutput;
import java.time.Year;
import java.util.Scanner;

public class CheckLeapYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Year :");
        String yearValue = scanner.next();
        if (!yearValue.isEmpty()) {
            Year year = Year.of(Integer.valueOf(yearValue));
            if (year.isLeap()) {
                System.out.println(yearValue + " is leap year");
            } else {
                System.out.println(yearValue + " is not leap year");
            }
        }
    }
}
