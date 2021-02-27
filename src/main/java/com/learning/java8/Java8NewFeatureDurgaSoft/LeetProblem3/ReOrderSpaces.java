package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem3;

import java.util.ArrayList;
import java.util.List;

public class ReOrderSpaces {

    public String reorderSpaces(String text) {
        List<String> list = new ArrayList<>();
        String[] str = text.split(" ");
        StringBuilder stringBuilder = new StringBuilder();

        int spaceCount = 0;

        for(char ch : text.toCharArray()){
            if(ch == ' ')  spaceCount++;
        }

        for(String s:str){
            if(!s.equals("")) list.add(s);
        }

        int temp = spaceCount;

        for(int i=0;i<list.size()-1;i++){
            stringBuilder.append(list.get(i));
            int spaceDiff = temp/(list.size()-1);
            while(spaceCount>0 && spaceDiff>0){
                stringBuilder.append(' ');
                temp--;spaceDiff--;
            }
            temp=spaceCount;
        }

        return stringBuilder.append(list.get(list.size()-1)).toString();
    }

    public static void main(String[] args) {
        System.out.println(new ReOrderSpaces().reorderSpaces("  this   is  a sentence "));
    }


}
