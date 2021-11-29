package com.learning.java8.Java8NewFeatureDurgaSoft.PhonePeInter;

/*
Given a Integer K find the number of ways to make k using 1,2 and 5

45 --> 45--> 1 && 9-->5
30 ---> 5-->6  && 1-->30  2-->15  (5-->4 && 2-->5) && (2-->5 && 5-->4)

5
5%5==0(++)
5%1==0(++)

1+1+1+1+1
2+2+1
2+1+2
 */

import java.util.HashMap;
import java.util.Map;

public class Problem2 {

    public int getMaxWays1(int num){
        int output = 0;

        if(num%5==0)output++;
        if(num%2==0)output++;
        if(num%1==0)output++;

        int i=0,j=0,k=0;
        Map<Integer,Integer> map = new HashMap<>();

        boolean isI=false,isJ=false,isK=false;

        int sum = 5*i+2*j+1*k;

        while(sum<=num){
            int value = i+j+k;
            if(sum==num) {
                if (!map.containsKey(sum)) {
                    map.put(sum, value * (value - 1) / 2);
                } else {
                    map.put(sum, map.get(sum) + value * (value - 1) / 2);
                }
            }
            if(isI==false && isJ==false && isK==false){
                    i++;
                    isI=true;
            }else if(isI==true && isJ==false && isK==false){
                    j++;
                    isJ=true;
            }else if(isI==true && isJ==true && isK==false){
                    k++;
                    isK=true;
            }else{
                    isI=false;
                    isJ=false;
                    isK=false;
            }

            sum = 5*i+2*j+1*k;
        }

        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            output+=e.getValue();
        }

        return output;

    }


    static int value = 0;

    public int getMaxWays(int num){

        if(num==0){
            return value;
        }else{
            if(num%5==0){
                value+=num/5;
                num=num/5;
            }else if(value%2==0){
                value+=num/2;
                num=num/2;
            }else{

            }
            //return getMaxWays(num);
        }

        return -1;
    }



    public static void main(String[] args) {

        System.out.println(new Problem2().getMaxWays1(10));


    }

}
