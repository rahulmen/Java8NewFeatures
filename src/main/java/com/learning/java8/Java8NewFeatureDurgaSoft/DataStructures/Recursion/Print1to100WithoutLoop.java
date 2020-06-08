package com.learning.java8.Java8NewFeatureDurgaSoft.DataStructures.Recursion;

public class Print1to100WithoutLoop {

    void print(int number){

        if(number<0){
            return;
        }else{
            System.out.print(number+" ");
            number--;
            print(number);
        }

    }

    public static void main(String[] args) {

        new Print1to100WithoutLoop().print(100);


    }

}
