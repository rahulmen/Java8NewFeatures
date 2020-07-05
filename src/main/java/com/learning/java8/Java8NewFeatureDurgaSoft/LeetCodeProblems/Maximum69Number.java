package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

import java.util.TreeSet;

public class Maximum69Number {


    public int maximum69Number (int num) {
        TreeSet<String> set = new TreeSet<>((i1, i2)->-i1.compareTo(i2));
        String s = String.valueOf(num);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='6'){
                set.add(s.substring(0,i)+9+s.substring(i+1,s.length()));
            }else{
                set.add(s);
            }
        }
        return Integer.valueOf(set.first());
   }

    public int maximum69Number1 (int num) {
        String value = String.valueOf(num);
        value = value.replaceFirst("6","9");
        return Integer.valueOf(value);
    }

    public int maximum69Number2 (int num) {

        int temp = num;

        for(int i=1000;i>1;i=i/10){

            if(temp/i==6){
                return num+(3*i);
            }

            if(temp>i){
                temp-=(9*i);
            }

        }
        return num;
      }





    public static void main(String[] args) {
        System.out.println(new Maximum69Number().maximum69Number2(9969));
    }



}
