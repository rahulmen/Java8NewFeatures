package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem2;

import java.util.Iterator;
import java.util.Stack;

public class RemoveDuplicateString {

    public String removeDuplicates(String S) {
        Stack stack = new Stack(){
            @Override
            public String toString(){
                StringBuilder stringBuilder = new StringBuilder();
                for(int i=0;i<this.size();i++){
                    stringBuilder.append(this.get(i));
                }
                    return stringBuilder.toString();
            }
        };
        char[] ch = S.toCharArray();

        for(char c:ch){
            if(stack.isEmpty()){
                stack.push(c);
            }else{
                char o = (char)stack.peek();
                if(c==o){
                    stack.pop();
                }else{
                    stack.push(c);
                }
            }
        }

        return stack.toString();

    }

    public static void main(String[] args) {

        System.out.println(new RemoveDuplicateString().removeDuplicates("abbaca"));

    }
}
