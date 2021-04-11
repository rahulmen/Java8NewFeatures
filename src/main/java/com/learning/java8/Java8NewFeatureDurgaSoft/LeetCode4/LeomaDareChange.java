package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCode4;

import java.util.HashMap;
import java.util.Map;

public class LeomaDareChange {

    public boolean lemonadeChange(int[] bills) {

        int five =0;
        int ten = 0;

        for(int i:bills){
            if(i==5){
                five++;
            }else{
                if(i==10){
                    if(five==0)return false;
                    five--;ten++;
                }else if(i==20){
                    if(five>0 && ten>0){
                        five--;ten--;
                    }else if(five>2){
                        five=-3;
                    }else{
                        return false;
                    }
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {

        System.out.println(new LeomaDareChange().lemonadeChange(new int[]{5,5,10,5,20,5,5,5,5,5,20,5,10,5,5,5,5,20,20,5}));

    }
}
