package com.learning.java8.Java8NewFeatureDurgaSoft.JavaStreamAPIImportantTopic;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionStreamExample12 {


    public static void main(String[] args) {

        Stream<String[]>
                str = Stream
                .of(new String[][] { { "GFG", "GeeksForGeeks" },
                        { "g", "geeks" },
                        { "G", "Geeks" } });

        Map<String,String> map1 = str.collect(Collectors.toMap(m->m[0],m->m[1]));
        System.out.println(map1);

        Map<Integer,String> map = new HashMap<>();
        map.put(4,"Rahul");
        map.put(2,"dbhebf");
        map.put(3,"nefnefe");
        map.put(1,"Mendiratta");
        map.put(5,"ebehdbedbe");

        /*Function<Map.Entry,Integer> entryIntegerFunction = e->(Integer)e.getKey();
        Function<Map.Entry,String> entryStringFunction = e->(String) e.getValue();*/

        //Approach First
        TreeMap<Object, Object> map2 = map.entrySet().stream().filter(e->e.getValue().contains("Rahul") || e.getValue().contains("Mendiratta"))
                .collect(Collectors.toMap(e->e.getKey(),e->e.getValue(),(s,r)->s+","+r,TreeMap::new));

        System.out.println(map2);

    }
}
