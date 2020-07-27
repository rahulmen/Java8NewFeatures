package com.learning.java8.Java8NewFeatureDurgaSoft.DataStructures.Recursion;

public class Printing1to100 {

    public void print(int num){
        if(num==0){
            return;
        }else{
            System.out.print(num+" ");
            print(--num);
        }
    }

    public static void main(String[] args) {

        new Printing1to100().print(100);
    }
}
