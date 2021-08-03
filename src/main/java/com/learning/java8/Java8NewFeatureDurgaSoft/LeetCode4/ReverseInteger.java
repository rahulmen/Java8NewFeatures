package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCode4;

import java.math.BigInteger;

public class ReverseInteger {

    public int reverse(int x) {

        boolean isNegative = false;
        if(x<0)isNegative = true;

        int output = 0;x= Math.abs(x);
        int initialValue = 0;
        int length = 0;
        while(x>0){
            if(output==0){
                if(x%10>0){
                    initialValue=x%10;
                    length++;
                }
                output = x%10;
            }else{
                long value = output*10+(x%10);
                if((initialValue>2 && length==9) || value < 0){
                    return 0;
                }
                output = (int)value;
                length++;
            }
            x=x/10;
        }

        if(isNegative==true)
            return output-(2*output);
        else
            return output;
    }

    public static void main(String[] args) {
        System.out.println(new ReverseInteger().reverse(0));
    }

}
