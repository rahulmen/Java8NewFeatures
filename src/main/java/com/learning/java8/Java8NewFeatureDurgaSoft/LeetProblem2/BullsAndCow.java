package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class BullsAndCow {

    public String getHint(String secret, String guess) {
        int ACount=0;
        int BCount=0;
        Map<Integer,Character> map1 = new HashMap<>();
        Map<Integer,Character> map2 = new HashMap<>();
        List<Character> l = new ArrayList<>();

        for(char ch :guess.toCharArray()){
            l.add(ch);
        }

        for(int i=0;i<secret.length();i++){
            map1.put(i,secret.charAt(i));
        }
        for(int i=0;i<guess.length();i++){
            map2.put(i,guess.charAt(i));
        }
        for(int i=0;i<secret.length();i++){
            if(map1.get(i)==map2.get(i)){
                map1.put(i,'\u0000');
                map2.put(i,'\u0000');
                ACount++;
            }
        }
        for(int i=0;i<secret.length();i++){
            if(map1.get(i)!=map2.get(i) && map2.containsValue(map1.get(i))){
                int key=Integer.MIN_VALUE;
                for(Map.Entry<Integer,Character> m:map2.entrySet()){
                    if(m.getValue()==map1.get(i)){
                        key=m.getKey();
                        break;
                    }
                }
                if(key!=Integer.MIN_VALUE){
                    map2.put(key,'\u0000');
                }
                BCount++;
            }
        }
        return ACount+"A"+BCount+"B";
    }


    public String getHint1(String secret, String guess) {
        int ACount=0,BCount=0;
        List<Character> l = new ArrayList<>();
        for(Character c:secret.toCharArray()){
            l.add(c);
        }
        for(int i=0;i<guess.length();i++){
            if(guess.charAt(i)==l.get(i)){
                ACount++;
                l.set(i,'\u0000');
            }else{
                if(l.contains(guess.charAt(i))){
                    int index = l.indexOf(guess.charAt(i));
                    if(index!=i) {
                        BCount++;
                        l.set(index,'\u0000');
                    }
                }
            }
        }
        return ACount+"A"+BCount+"B";
    }

    public boolean isMultiple(int num){
        return (Math.log10(num)/Math.log10(2))%1==0;
    }


    public static void main(String[] args) {
        System.out.println(new BullsAndCow().isMultiple(14));
        System.out.println(new BullsAndCow().getHint("2822013305","5706322849"));
    }


}
