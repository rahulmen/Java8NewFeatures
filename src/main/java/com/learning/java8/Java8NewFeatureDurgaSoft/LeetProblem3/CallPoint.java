package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem3;

import java.util.Stack;

public class CallPoint {

    public int calPoints(String[] ops) {

        Stack<Integer> stack = new Stack();

        for(int i=0;i<ops.length;i++){

            if(ops[i].equals("C")){
                stack.pop();
            }else if(ops[i].equals("D")){
                int j = Integer.valueOf(stack.peek());
                stack.push(2*j);
            }else if(ops[i].equals("+")){
                int firstPrevious = Integer.valueOf(stack.pop());
                int secondPrevious = Integer.valueOf(stack.peek());
                stack.push(firstPrevious);
                stack.push(firstPrevious+secondPrevious);
            }else{
                stack.push(Integer.valueOf(ops[i]));
            }
        }
        int sum =0;
        while(!stack.isEmpty()){
            sum+=stack.pop();
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new CallPoint().calPoints(new String[]{"5","2","C","D","+"}));
    }
}
