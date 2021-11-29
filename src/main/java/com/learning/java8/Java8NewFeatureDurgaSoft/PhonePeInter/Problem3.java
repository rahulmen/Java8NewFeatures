package com.learning.java8.Java8NewFeatureDurgaSoft.PhonePeInter;

import java.util.Stack;

public class Problem3 {


    /*
    \Remove Adjacent characters if they are same. repeat until no adjacent characters are same
Eg: abbac
output is c
     */


    public String trancate(String s){
        Stack<Character> stack = new Stack<>();
        for(char c:s.toCharArray()){
            if(stack.isEmpty()){
                stack.push(c);
            }else{
                char c1 = stack.peek();
                if(c==c1){
                    stack.pop();
                }else{
                    stack.push(c);
                }
            }
        }
       StringBuilder stringBuilder = new StringBuilder();
       while(!stack.isEmpty()){
           stringBuilder.append(stack.pop());
       }
       return stringBuilder.reverse().toString();
    }


    public static void main(String[] args) {
        System.out.println(new Problem3().trancate("aaaabcdaabcd"));
    }

}
