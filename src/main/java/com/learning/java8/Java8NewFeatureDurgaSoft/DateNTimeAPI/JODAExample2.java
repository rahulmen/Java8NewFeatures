package com.learning.java8.Java8NewFeatureDurgaSoft.DateNTimeAPI;

import java.time.LocalDate;
import java.time.LocalTime;

public class JODAExample2 {

    public static void main(String[] args) throws Exception{

        LocalDate localDate = LocalDate.now();
        System.out.println(LocalDate.now().toEpochDay());
        System.out.println("Day:-"+localDate);
        System.out.println("Date:-"+localDate.getDayOfMonth());
        System.out.println("Month:-"+localDate.getMonthValue());
        System.out.println("Year:-"+localDate.getYear());
        System.out.println("Formatted Date:-"+String.format("%d-%d-%d",localDate.getDayOfMonth(),localDate.getMonthValue(),localDate.getYear()));

        System.out.println("==============");

        LocalTime localTime = LocalTime.now();
        System.out.println("Time:-"+localTime);
        System.out.println("Hour:-"+localTime.getHour());
        System.out.println("Minute:-"+localTime.getMinute());
        System.out.println("Seconds:-"+localTime.getSecond());
        System.out.println("NanoSeconds:-"+localTime.getNano());
        System.out.println("Formatted Time:-"+String.format("%d-%d-%d-%d",localTime.getHour(),localTime.getMinute(),localTime.getSecond(),localTime.getNano()));


    }
}
