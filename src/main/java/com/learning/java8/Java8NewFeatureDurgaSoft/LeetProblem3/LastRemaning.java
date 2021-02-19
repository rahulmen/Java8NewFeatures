package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem3;

public class LastRemaning {

    public int lastRemaining(int n) {

        int[] num = new int[n];
        for(int i=0;i<n;i++){
            num[i]=i+1;
        }

        boolean left = true;
        boolean right = false;

        while(num.length>1){
            int[] temp = new int[num.length/2];
            int j;
            if(left==true){
                j=0;
                for(int i=0;i<num.length;i+=2){
                    if(j==temp.length){
                        break;
                    }
                    temp[j]=num[i+1];
                    j++;
                }
                num = temp;
                left = false;
                right = true;
            }else{
                j=temp.length-1;
                for(int i=num.length-1;i>0;i-=2){
                    if(j<0){
                        break;
                    }
                    temp[j]=num[i-1];
                    j--;
                }
                num = temp;
                left = true;
                right = false;
            }
        }
        return num[0];
    }

    public static void main(String[] args) {
        System.out.println(new LastRemaning().lastRemaining(9));
    }

}
