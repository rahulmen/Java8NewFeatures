package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem3;

public class HammingDistance {

    public int hammingDistance(int x, int y) {
        String s1 = Integer.toBinaryString(x);
        String s2 = Integer.toBinaryString(y);
        while(s1.length()!=s2.length()){
            if(s1.length()<s2.length()){
                s1="0"+s1;
            }else{
                s2="0"+s2;
            }
        }
        int output =0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)) {
                output++;
            }
        }
        return output;
    }

    public int hammingDistance1(int x, int y) {

        int n = x^y;

        if(n == 0 ) return 0;
        int count = 0;
        while(n!=0) {
            if((n&1) != 0) count++;
            n >>>= 1;
        }
        return count;
    }



    public static void main(String[] args) {

        //System.out.println(new HammingDistance().hammingDistance(0,2147483647));
        System.out.println(new HammingDistance().hammingDistance1(0,2147483647));

    }
}
