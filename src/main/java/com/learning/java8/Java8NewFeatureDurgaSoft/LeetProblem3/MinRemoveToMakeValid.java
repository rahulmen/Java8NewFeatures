package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem3;

import java.util.*;

public class MinRemoveToMakeValid {

    public String minRemoveToMakeValid(String s) {

        List<Integer> list = new ArrayList<>();

        Stack<Character> stack = new Stack<>();

        int i=0;
        for(char c:s.toCharArray()){

            if(stack.isEmpty() && (c==')' || c=='(')){
                stack.push(c);
                list.add(i);
                i++;
            }else if(!stack.isEmpty() && (c==')' || c=='(')){
                char ch = stack.peek();
                if(ch=='(' && c==')'){
                    stack.pop();
                    list.remove(list.size()-1);
                }else{
                    stack.push(c);
                    list.add(i);
                }
                i++;
            }else{
                i++;
            }
        }
        StringBuilder str = new StringBuilder();
        i=0;
        int j = 0;
        for(char ch:s.toCharArray()){
            if(j<list.size() && list.get(j)==i){
                j++;
            }else{
                str.append(ch);
            }
            i++;
        }

        return str.toString();
    }


    public static void main(String[] args) {
        System.out.println(new Date().getTime());
        System.out.println(new MinRemoveToMakeValid().minRemoveToMakeValid("()()(((dbhjebdhje(0ehbej()))))(((((((((()))))))))))))))))))))))))))((((((((()))))))))))))))))))))))))))))))))))))))))))))))))cbhjcbehberrhjkfbfjkbhberfjnerbenbbjkeve()()))))))hjefbehchejbfejhbc()()))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))"));
        System.out.println(new Date().getTime());
    }
}
