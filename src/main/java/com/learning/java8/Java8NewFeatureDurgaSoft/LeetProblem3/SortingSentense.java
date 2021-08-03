package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem3;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class MyComparator123 implements Comparator {

    public int compare(Object o1,Object o2){
        String s1 = (String)o1;String s2 = (String)o2;
        Integer i1 = (int)s1.charAt(s1.length()-1);
        Integer i2 = (int)s2.charAt(s2.length()-1);
        return i1.compareTo(i2);
    }
}

public class SortingSentense {

        public String sortSentence(String s) {
            String[] str = s.split(" ");
            Map<String,Integer> map = new TreeMap<>(new MyComparator123());
            int i=0;
            for(String s1:str){
                map.put(s1,i);
                i++;
            }
            StringBuilder str1 = new StringBuilder();
            map.entrySet().stream().forEach(e->str1.append(e.getKey().substring(0,e.getKey().length()-1)).append(" "));
            return str1.toString().trim();
        }

    public static void main(String[] args) {

        System.out.println(new SortingSentense().sortSentence("Myself2 Me1 I4 and3"));
    }
    }
