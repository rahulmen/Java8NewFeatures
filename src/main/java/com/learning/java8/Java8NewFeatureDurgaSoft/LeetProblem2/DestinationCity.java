package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem2;

import java.util.*;

public class DestinationCity {

    public String destCity(List<List<String>> paths) {
            Map<String,String> map = new HashMap<>();
            for (List<String> l:paths){
                map.put(l.get(0),l.get(1));
            }

            for(Map.Entry<String,String> m:map.entrySet()){
                if(!map.containsKey(m.getValue())){
                    return m.getValue();
                }
            }
        return "";
    }

//[["pYyNGfBYbm","wxAscRuzOl"],["kzwEQHfwce","pYyNGfBYbm"]]
    public static void main(String[] args) {

        List<String> list1 = new LinkedList<>(Arrays.asList("jMgaf WaWA","iinynVdmBz"));
        List<String> list2 = new LinkedList<>(Arrays.asList("QCrEFBcAw","wRPRHznLWS"));
        List<String> list3 = new LinkedList<>(Arrays.asList("iinynVdmBz","OoLjlLFzjz"));
        List<String> list4 = new LinkedList<>(Arrays.asList("OoLjlLFzjz","QCrEFBcAw"));
        List<String> list5 = new LinkedList<>(Arrays.asList("IhxjNbDeXk","jMgaf WaWA"));
        List<String> list6 = new LinkedList<>(Arrays.asList("jmuAYy vgz","IhxjNbDeXk"));

        List<List<String>> listList = new LinkedList<>();
        listList.add(list1);
        listList.add(list2);
        listList.add(list3);
        listList.add(list4);
        listList.add(list5);
        listList.add(list6);
        System.out.println(new DestinationCity().destCity(listList));

    }
}
