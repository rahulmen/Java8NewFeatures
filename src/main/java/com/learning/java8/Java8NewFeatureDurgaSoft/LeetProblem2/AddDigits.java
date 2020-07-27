package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem2;

public class AddDigits {

    public int addDigits(int num) {
        while(num>10){
            num= addDigit(num);
        }
        return num;
    }

    public static int addDigit(int num){
        if(num==0){
            return 0;
        }else{
            return (num%10)+addDigit(num/10);
        }
    }

    public static void main(String[] args) {
        System.out.println(new AddDigits().addDigits(38));
    }
}
