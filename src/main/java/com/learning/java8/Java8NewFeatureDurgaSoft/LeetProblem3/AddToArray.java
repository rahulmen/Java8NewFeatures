package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddToArray{

        public List<Integer> addToArrayForm(int[] A, int K) {
            List<Integer> list = new ArrayList<>();
            int i = A.length-1;

            while(i>=0 || K>0){
                int remainder = K%10;
                if(i>0){
                    A[i] = A[i]+remainder;
                    if(A[i]>=10 && i>0){
                        A[i-1]=A[i-1]+(A[i]/10);
                        A[i]=A[i]%10;
                    }
                }else{
                    A[i] = A[i]+K;
                    break;
                }
                i--;
                K=K/10;
            }

            for(int j=0;j<A.length;j++){
                int temp = A[j];
                if(A[j]<10){
                    list.add(A[j]);
                    continue;
                }
                while(A[j]>0){
                    list.add(A[j]%10);
                    A[j]=A[j]/10;
                }
                if(temp>=10){
                    Collections.reverse(list);
                }
            }

            return list;
        }

    public static void main(String[] args) {

        System.out.println(new AddToArray().addToArrayForm(new int[]{9,9,9,9,9},1));
    }
}
