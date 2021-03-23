package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem3;

public class ReverseStringUsingRecursion {

    public void reverse(String name){
        if(name.length()==1){
            System.out.print(name.substring(name.length()-1,name.length()));
        }else{
            System.out.print(name.substring(name.length()-1,name.length()));
            reverse(name.substring(0,name.length()-1));
        }
    }

    public static void main(String[] args) {
        new ReverseStringUsingRecursion().reverse("Hello Woebdejndejrld");
    }


}
