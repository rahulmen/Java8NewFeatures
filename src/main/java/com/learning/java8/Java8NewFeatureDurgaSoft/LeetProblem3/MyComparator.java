package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem3;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class MyComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Integer i1 = (Integer)o1;
        Integer i2 = (Integer)o2;
        return -i1.compareTo(i2);
    }
}


class Temp{

    public static void main(String[] args) {
        Map<Integer,Integer> map = new TreeMap<>(new MyComparator());
        map.put(1,1);
        map.put(2,2);

        System.out.println(map);
    }


}

