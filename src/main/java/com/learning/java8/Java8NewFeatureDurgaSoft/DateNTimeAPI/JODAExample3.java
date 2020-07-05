package com.learning.java8.Java8NewFeatureDurgaSoft.DateNTimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class JODAExample3 {

    public static void main(String[] args) throws Exception{

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(String.format("%d-%d-%d\n%d:%d:%d:%d",
                localDateTime.getDayOfMonth(),localDateTime.getMonthValue(),
                localDateTime.getYear(),localDateTime.getHour(),localDateTime.getMinute(),
                localDateTime.getSecond(),localDateTime.getNano()));

        System.out.println("==============");

        localDateTime = LocalDateTime.of(1992, Month.AUGUST,31,17,03);
        System.out.println(String.format("%d-%d-%d\n%d:%d:%d:%d",
                localDateTime.getDayOfMonth(),localDateTime.getMonthValue(),
                localDateTime.getYear(),localDateTime.getHour(),localDateTime.getMinute(),
                localDateTime.getSecond(),localDateTime.getNano()));

        System.out.println("=================\n"+localDateTime);
        System.out.println("After Six Month:-"+localDateTime.plusMonths(6));
        System.out.println("Before Six Month:-"+localDateTime.minusMonths(6));

    }



}
