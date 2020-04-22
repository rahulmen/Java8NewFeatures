package com.learning.java8.Java8NewFeatureDurgaSoft;

/*
Predicate example to remove null and empty String from array
 */

import java.util.function.Predicate;

public class PredicateExample6 {


    public static void main(String[] args) {
       String[] str = {null,"Rahul","","Mendiratta"};
       Predicate<String> predicate = s->s!=null;
       Predicate<String> predicate1 = s->s.isEmpty();

       for(String s:str){
           if(predicate.and(predicate1.negate()).test(s)){
               System.out.println(s);
           }
       }



    }


}
