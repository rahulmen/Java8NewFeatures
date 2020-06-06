package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

/*
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.

Example 1:

Input: "()"
Output: true
Example 2:

Input: "()[]{}"
Output: true
Example 3:

Input: "(]"
Output: false
Example 4:

Input: "([)]"
Output: false
Example 5:

Input: "{[]}"
Output: true


 */

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Stack;
import java.util.stream.Stream;

public class ParanthesisProblem {

        public boolean isValid(String s) {

        /*    boolean result = false;
            int counter=0;
            if(s.charAt(0)==')'){
                return false;
            }
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='('){
                    counter++;
                }else if(s.charAt(i)==')'){
                    counter--;
                }
            }
            if(counter==0) {
                result = true;
            }else{
                return false;
            }*/

            Stack stack = new Stack();
            if(s.charAt(0)==')' || s.charAt(0)=='}' || s.charAt(0)==']'){
                return false;
            }else{
                stack.push(s.charAt(0));
            }
            for(int i=1;i<s.length();i++){
                if(stack.isEmpty()){
                    stack.push(s.charAt(i));
                    continue;
                }
                if((Character)stack.peek()=='(' && s.charAt(i)==')' ||
                        (Character)stack.peek()=='{' && s.charAt(i)=='}' ||
                        (Character)stack.peek()=='[' && s.charAt(i)==']'){
                    stack.pop();
                }else{
                    stack.push(s.charAt(i));
                }

            }
            if(stack.isEmpty()){
                return true;
            }else{
                return false;
            }
        }


    public static void main(String[] args) {

        System.out.println(new ParanthesisProblem().isValid("{[]}"));


    }

}
