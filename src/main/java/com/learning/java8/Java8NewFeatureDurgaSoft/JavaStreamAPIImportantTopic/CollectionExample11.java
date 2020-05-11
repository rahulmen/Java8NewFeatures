package com.learning.java8.Java8NewFeatureDurgaSoft.JavaStreamAPIImportantTopic;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectionExample11 {

    public static void main(String[] args) {

         Map<Integer,String> map = new HashMap<>();
         map.put(1,"Rahul");
         map.put(2,"Sumit");
         map.put(3,"Ankit");
         map.put(4,"Shivanshu");
         map.put(5,"Akshay");
/*        System.out.println(map.entrySet().stream().filter(s->{
            String name = s.getValue();
            if(name.contains("n")) {
                System.out.println(name);
                return true;
            }
            return false;
        }).collect(Collectors.toList()));*/

        for(Map.Entry<Integer,String> m:map.entrySet()){
            if(m.getKey()>3) {
                System.out.println(m);
                System.out.println(m.getKey());
                System.out.println(m.getValue());
            }
        }


    }
}
