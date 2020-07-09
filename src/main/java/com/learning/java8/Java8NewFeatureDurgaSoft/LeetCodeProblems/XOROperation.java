package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

public class XOROperation {

    public int xorOperation(int n, int start) {
        int s=0;
        if(n==1){
            return start;
        }
        for(int i=0;i<n-1;i++){
            int second =0;
            if(i==0){
                s=start;
            }
            second=start+(2*(i+1));
            s=s^second;
        }
        return s;
    }

    public static void main(String[] args) {

        System.out.println(new XOROperation().xorOperation(1,7));


    }
}
