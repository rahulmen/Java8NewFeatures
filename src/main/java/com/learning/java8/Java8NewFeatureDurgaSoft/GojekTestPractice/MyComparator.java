package com.learning.java8.Java8NewFeatureDurgaSoft.GojekTestPractice;

import java.util.Comparator;

public class MyComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = (String)o1;
        String s2 = (String)o2;
        if(s1.contains("Men")){
            return -1;
        }else if(s1.contains("Rah")){
            return 1;
        }else{
            return 0;
        }
    }
}
