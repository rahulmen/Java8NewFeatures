package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

import java.util.*;

public class SecondLargestOccurance {

    public int getSecondLargest(String s){
        Map<Character,Integer> map = new HashMap<Character,Integer>();

        for(Character c:s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        Map.Entry<Character,Integer> entry =null;
        int max = Integer.MIN_VALUE;
        for(Map.Entry<Character,Integer> m:map.entrySet()){
            if(m.getValue()>max){
                max=m.getValue();
                entry=m;
            }
        }
        map.remove(entry.getKey());
        max = Integer.MIN_VALUE;
        for(Map.Entry<Character,Integer> m:map.entrySet()){
            if(m.getValue()>max){
                max=m.getValue();
                entry=m;
            }
        }
        return entry.getValue();
    }

    public char getSecondLargest1(String s){
        Map<Integer,Character> treeSet = new TreeMap<>();
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        int counter =1;
        int firstMax=0;
        char character='\u0000';
        int secondMax=Integer.MIN_VALUE;
        for(int i=0;i<ch.length-1;i++){
            if(ch[i]==ch[i+1]){
                counter++;
                continue;
            }
            if(counter>firstMax){
                secondMax=firstMax;
                firstMax=counter;
                counter=1;
            }else if(counter>secondMax){
                character = ch[i];
                secondMax=counter;
                counter=1;
            }
        }
        return character;
    }



    public static void main(String[] args) {

        System.out.println(new SecondLargestOccurance().getSecondLargest1("aaaaaabbssbkkdhacccaggaujv"));


    }
}
