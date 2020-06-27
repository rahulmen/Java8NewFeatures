package com.learning.java8.Java8NewFeatureDurgaSoft.ShivanshuLamdbaTeaching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class temp1 {



    public int[] getInt(final int[] arr1,final int[] arr2){
        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<Integer,Integer> map1 = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i:arr1){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        for(int i:arr2){
            if(map1.containsKey(i)){
                map1.put(i,map1.get(i)+1);
            }else{
                map1.put(i,1);
            }
        }
        System.out.println(map);
        System.out.println(map1);
        for(Map.Entry<Integer,Integer> m :map1.entrySet()){
            int i = 0;
            int j=0;
            if(map.containsKey(m.getKey()) && map1.containsKey(m.getKey())){
                i = m.getValue();
                j= map.get(m.getKey());
                if(i<=j){
                    for(int z=0;z<i;z++){
                        list.add(m.getKey());
                    }
                }else{
                    for(int z=0;z<j;z++){
                        list.add(m.getKey());
                    }
                }
            }
        }

        int[] temp = new int[list.size()];

        for(int i=0;i<list.size();i++){
            temp[i]=list.get(i);
        }

        return temp;
    }

    public static void main(String[] args) {


        System.out.println(Arrays.toString(new temp1().getInt(new int[]{1,2,3,4,5,1},new int[]{1,1,2,2,3})));
        //[1,1,2,3]




    }
}
