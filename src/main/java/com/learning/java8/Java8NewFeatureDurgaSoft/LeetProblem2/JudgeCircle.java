package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem2;

import java.util.HashMap;
import java.util.Map;

public class JudgeCircle {

    public boolean judgeCircle(String moves) {
        Map<Character,Integer> map = new HashMap<>();

        for(Character c:moves.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        System.out.println(map);

        for(Map.Entry<Character,Integer> m:map.entrySet()){

            Character c = m.getKey();
            Integer value = m.getValue();
            try{
                if((c=='U' && value!=map.get('D').intValue()) ||
                        (c=='D' && value!=map.get('U').intValue()) ||
                        (c=='L' && value!=map.get('R').intValue()) ||
                        (c=='R' && value!=map.get('L').intValue())){
                    return false;
                }
            }catch(NullPointerException nsee){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {


       boolean b= new JudgeCircle().judgeCircle("LLRR");
        System.out.println(b);
    }
}
