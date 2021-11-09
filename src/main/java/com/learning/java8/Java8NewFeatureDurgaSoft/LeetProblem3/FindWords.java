package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem3;

import java.util.*;

public class FindWords {

    public String[] findWords(String[] words) {

        String firstRow = "qwertyuiop";
        String secondRow = "asdfghjkl";
        String thirdRow = "zxcvbnm";

        List<String> list = new ArrayList<>();

        for(String s:words){
            boolean b = true;
            boolean first = false;
            boolean second = false;
            boolean third = false;

            for(char ch:s.toCharArray()){
                String temp = ch+"";
                if(first==false && second==false && third==false){
                    if(firstRow.contains(temp.toLowerCase())){
                        first=true;
                        continue;
                    }
                    else if(secondRow.contains(temp.toLowerCase())){
                        second = true;
                        continue;
                    }else{
                        third = true;
                        continue;
                    }
                }else{
                    if((first==true && !firstRow.contains(temp.toLowerCase())) ||
                            (second==true && !secondRow.contains(temp.toLowerCase())) ||
                            (third==true && !thirdRow.contains(temp.toLowerCase()))) {
                        b = false;
                        break;
                    }
                }
            }

            if(b==true) list.add(s);

        }

        String[] output = new String[list.size()];

        for(int i=0;i<list.size();i++){
            output[i]=list.get(i);
        }

        return output;
    }

    public static void main(String[] args) {
        //System.out.println(Arrays.toString(new FindWords().findWords(new String[]{"Hello","Alaska","Dad","Peace"})));

        Set<Integer> set1 = new TreeSet<>();
        set1.add(1);
        System.out.println(set1);

        new ArrayList<>().add(set1);



    }
}
