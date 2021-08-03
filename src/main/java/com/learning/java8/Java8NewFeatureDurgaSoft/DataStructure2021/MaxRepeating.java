package com.learning.java8.Java8NewFeatureDurgaSoft.DataStructure2021;

public class MaxRepeating {

    public int maxRepeating(String sequence, String word) {

        if(!sequence.contains(word)){
            return 0;
        }

        int output = 0;

        for(int i=0;i<=sequence.length()-word.length();i++){

            String s = sequence.substring(i,i+word.length());
            if(s.equals(word)){
                output++;
                i+=word.length()-1;
            }
        }

        return output;

    }


    public static void main(String[] args) {
        System.out.println(new MaxRepeating().maxRepeating("wjndkjwkj","w"));
    }

}
