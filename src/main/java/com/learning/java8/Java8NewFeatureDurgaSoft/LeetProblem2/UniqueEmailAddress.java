package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem2;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddress {

    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        String name ="";
        for(String s:emails){
            StringBuilder stringBuilder = new StringBuilder();
            int counter =0;
            boolean b = false;
            name=s;
            while(s.charAt(counter)!='@'){
                if(b==true){
                    counter++;
                }
                else if(s.charAt(counter)=='+'){
                    b=true;
                    counter++;
                }else if(s.charAt(counter)=='.'){
                    counter++;
                }
                else{
                    stringBuilder.append(s.charAt(counter));
                    counter++;
                }
            }
            stringBuilder.append(name.substring(counter,name.length()));
            System.out.println(stringBuilder.toString());
            set.add(stringBuilder.toString());
        }
        return set.size();
    }

    public int numUniqueEmails1(String[] emails) {
        Set<String> set = new HashSet<>();
        for(String s:emails){
          String[] temp = s.split("\\@");
          set.add(temp[0].split("\\+")[0].replaceAll("\\.","")+"@"+temp[1]);
        }
        System.out.println(set);
        return set.size();
    }

    public static void main(String[] args) {


        System.out.println(new UniqueEmailAddress().numUniqueEmails1(new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"}));


    }
}
