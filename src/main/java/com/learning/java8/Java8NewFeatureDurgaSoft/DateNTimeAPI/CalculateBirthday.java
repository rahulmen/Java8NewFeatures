package com.learning.java8.Java8NewFeatureDurgaSoft.DateNTimeAPI;

import java.time.*;
import java.util.Scanner;

public class CalculateBirthday {

    public static void main(String[] args) throws Exception{

        System.out.println("Please !! Enter date of birth in format YYYY-MM-DD");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Date of Birth :");
        String DOB = scanner.next();
        String[] strings = DOB.split("-");
        if(strings.length==3 ){
            if(strings[0].length()==4 && (strings[1].length()<=2 && strings[1].length()>0 && Integer.valueOf(strings[1])<=12) &&
                    (strings[2].length()>0 && strings[2].length()<=2 && Integer.valueOf(strings[2])<=31)){
                LocalDate birthDate = null;
                try {
                    birthDate = LocalDate.of(Integer.valueOf(strings[0]), Integer.valueOf(strings[1]), Integer.valueOf(strings[2]));
                }catch(DateTimeException nsee){
                    throw new RuntimeException("Invalid Date:"+nsee.getMessage());
                }
                LocalDate currentDate = LocalDate.now();
                if(birthDate.getYear()>currentDate.getYear()) {
                    System.out.println("You are not born Yet!!");
                    return;
                }
                if(birthDate.getYear()==currentDate.getYear() && birthDate.getMonthValue()>currentDate.getMonthValue()){
                    System.out.println("You are not born Yet!!");
                    return;
                }
                if(birthDate.getYear()==currentDate.getYear() && birthDate.getMonthValue()==currentDate.getMonthValue() && birthDate.getDayOfMonth()>=currentDate.getDayOfMonth()){
                    System.out.println("You are not born Yet!!");
                    return;

                }
                Period period = Period.between(birthDate,currentDate);
                System.out.println("Your are "+period.getYears()+" Years "+period.getMonths()+" Months "+period.getDays()+" Days Old!!");
            }else{
                throw new RuntimeException("Please Enter DOB in correct Format YYYY-MM-DD");
            }
        }else{
            throw new RuntimeException("Please Enter DOB in correct Format YYYY-MM-DD");
        }
    }



}
