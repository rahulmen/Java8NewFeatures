package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem3;

public class GuessNumber {

    public int guessNumber(int n) {
        int nu = guess(n);
        if(nu==0){
            return n;
        }
        int begin = 0;int end = n;
        while(begin<=end){
            int medium = ((end/2)+(begin/2))+1;
            int num = guess(medium);
            if(num==-1){
                end = medium-1;
            }else if(num==1){
                begin = medium+1;
            }else{
                return medium;
            }
        }
        return -1;
    }

    static int guess(int n){
        if(n==10){
            return 0;
        }else if(n>10){
            return -1;
        }else{
            return +1;
        }
    }

        public static void main(String[] args) {
        System.out.println(new GuessNumber().guessNumber(10));
    }
}
