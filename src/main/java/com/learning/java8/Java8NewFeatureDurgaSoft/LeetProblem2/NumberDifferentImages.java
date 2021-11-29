package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem2;

import javax.management.remote.rmi._RMIConnection_Stub;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberDifferentImages {

    public int numDifferentIntegers(String word) {

        StringBuilder str = new StringBuilder();
        Set<String> set = new HashSet<>();
        boolean b = false;

        for(char ch:word.toCharArray()){
            if((int)ch>=(int)'0' && (int)ch<='9'){
                if(b==false && ch=='0'){
                    continue;
                }else{
                    b=true;
                    str.append(ch);
                }
            }else{
                if(b==true) {
                    set.add(str.toString());
                    b = false;
                    str = new StringBuilder();
                }
            }
        }

        if(Pattern.compile("0[a-z]").matcher(word).find()){
            set.add("0");
        }

        if(b==true)
            set.add(str.toString());


        System.out.println(set);

        return set.size();

    }

    public static void main(String[] args) {
        System.out.println(new NumberDifferentImages().numDifferentIntegers("0a0"));
    }


}
