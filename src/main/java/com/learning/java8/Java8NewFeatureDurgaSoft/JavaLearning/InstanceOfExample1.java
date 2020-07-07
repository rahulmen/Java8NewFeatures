package com.learning.java8.Java8NewFeatureDurgaSoft.JavaLearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InstanceOfExample1 {

    static List<Object> list = new ArrayList<>(Arrays.asList(1,"Rahul",'C',233.42,12));

    public static void main(String[] args) {
        int sum=0;
        for(Object o:list){
            if(o instanceof Integer){
                sum+=(Integer)o;
            }
        }
        System.out.println(sum);

    }
}
