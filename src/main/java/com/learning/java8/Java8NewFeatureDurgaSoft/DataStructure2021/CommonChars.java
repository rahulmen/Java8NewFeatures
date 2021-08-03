package com.learning.java8.Java8NewFeatureDurgaSoft.DataStructure2021;

import java.util.*;

public class CommonChars {

    public List<String> commonChars(String[] A) {

        if(A.length==1){
            return Arrays.asList(A[0].split(""));
        }

        List<String> list = new ArrayList<>();

        List<Map<Character,Integer>> list1 = new ArrayList<>();

        for(int i=0;i<A.length;i++){
            if(i==0){
                continue;
            }
            Map<Character,Integer> map = new HashMap<>();
            for(char c:A[i].toCharArray()){
                map.put(c,map.getOrDefault(c,0)+1);
            }
            list1.add(map);
        }

        l1:
        for(char ch:A[0].toCharArray()){
            l2:
            for(Map<Character,Integer> map:list1){
                if(map.containsKey(ch) && map.get(ch)>=1){
                    map.put(ch,map.getOrDefault(ch,0)-1);
                }else{
                    continue l1;
                }
            }
            list.add(ch+"");
        }
        return list;
    }

    public static void main(String[] args) {

        System.out.println(new CommonChars().commonChars(new String[]{"bella","label","roller"}));
    }

}
