package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem2;

public class removeOuterParathesis {

    public String removeOuterParentheses(String S) {
        StringBuilder builder = new StringBuilder();
        int count =0;
        int i=0;
        int count1=0;
        int count2=0;
        while(count<=S.length()){
            if(count1==count2 && count!=0){
                builder.append(S.substring(i+1,count-1));
                i=count;
                count1=0;
                count2=0;
            }
            if(count<S.length() && S.charAt(count)=='('){
                count++;
                count1++;
                continue;
            }else if(count<S.length() && S.charAt(count)==')'){
                count++;
                count2++;
                continue;
            }else {
                count++;
            }
        }
        return builder.toString();
    }


    public static void main(String[] args) {

        System.out.println(new removeOuterParathesis().removeOuterParentheses("()()"));

    }

}
