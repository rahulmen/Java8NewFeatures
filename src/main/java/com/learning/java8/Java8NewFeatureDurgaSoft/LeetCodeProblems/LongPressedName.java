package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class LongPressedName {


    public boolean isLongPressedName(String name, String typed) {
      if(name.length()>typed.length()) return false;
      int counter =0;
      int typedLength=0;
      if(name.charAt(0)!=typed.charAt(0))return false;
      for(int i=0;i<typed.length();i++){
         if(counter<name.length()){
             if(name.charAt(counter)==typed.charAt(i)){
                 counter++;
                 continue;
             }else{
                 if(typed.charAt(i)==typed.charAt(i-1)){
                     continue;
                 }else{
                     return false;
                 }
             }
         }else{
             if(typed.charAt(i)!=name.charAt(name.length()-1)){
                 return false;
             }
         }
      }

      if(counter<name.length())return false;

      return true;

    }




    public static void main(String[] args) {
        System.out.println(new LongPressedName().isLongPressedName("dfuyalc","fuuyallc"));
    }
}

