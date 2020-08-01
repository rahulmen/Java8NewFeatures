package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem2;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TempCode {

    public int findSpecialInteger(int[] arr) {

        int percent = (arr.length*25)/100;

        Map<Integer,Integer> map = new HashMap<>();

        for(int i:arr){
            if(map.containsKey(i)){
                if(map.get(i)+1>percent){
                    return i;
                }
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        return -1;
    }


    public boolean isPathCrossing(String path) {
        Integer[] temp = {0,0};
        Set<Integer[]> set = new HashSet(){
            @Override
            public boolean contains(Object o){
                for(Object i:this){
                    Integer[] temp=(Integer[]) i;
                    Integer[] temp1 = (Integer[]) o;
                    if(temp[0]==temp1[0] && temp[1]==temp1[1]){
                        return true;
                    }
                }
                return false;
            }
        };
        set.add(new Integer[]{temp[0],temp[1]});
        for(char ch:path.toCharArray()){
            if(ch=='N'){
                temp[1]+=1;
            }else if(ch=='S'){
                temp[1]-=1;
            }else if(ch=='E'){
                temp[0]+=1;
            }else{
                temp[0]-=1;
            }
            Integer[] i = {temp[0],temp[1]};
            if(set.contains(i)==true){
                return true;
            }else{
                set.add(i);
            }
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(new TempCode().isPathCrossing("NES"));
    }

}
