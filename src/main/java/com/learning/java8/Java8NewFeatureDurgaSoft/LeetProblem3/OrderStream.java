package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class OrderedStream {

    private static Map<Integer,String> map = new TreeMap<>();
    private int length;

    public OrderedStream(int n) {
        this.length=n;
    }

    public List<String> insert(int id, String value) {
        List<String> list = new ArrayList<>();
        map.put(id,value);
        for(int i=1;i<=id;i++){
            String output = map.getOrDefault(i,null);
            if(output==null){
                return list;
            }
        }
        for(int i=id;i<=this.length;i++){
            String output = map.getOrDefault(i,null);
            if(output==null){
                break;
            }else{
                list.add(output);
            }
        }
        return list;
    }


}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(id,value);
 */
