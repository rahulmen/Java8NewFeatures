package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem2;

import java.util.Stack;
import java.util.function.Function;

public class RomanToInteger {

    static Function<Character,Integer> function = c->{
        if(c=='I')return 1;
        else if(c=='V')return 5;
        else if(c=='X')return 10;
        else if(c=='L')return 50;
        else if(c=='C')return 100;
        else if(c=='D')return 500;
        else if(c=='M')return 1000;
        else return 0;
    };

    public int romanToInt(String s) {
        char[] ch = s.toCharArray();
        Stack<Character> stack = new Stack();
        int sum=0;
        for(char c:ch){
            if(stack.empty()){
                stack.push(c);
                sum+=function.apply(c);
            }else{
                char previous = stack.peek();
                if(previous=='I' && (c=='V'|| c=='X')){
                    sum = (sum-function.apply(previous))+(function.apply(c)-function.apply(previous));
                    stack.push(c);
                }else if (previous=='X' && (c=='C'|| c=='L')) {
                    sum = (sum-function.apply(previous))+(function.apply(c)-function.apply(previous));
                }
                else if (previous=='C' && (c=='D'|| c=='M')) {
                    sum = (sum-function.apply(previous))+(function.apply(c)-function.apply(previous));
                }
                else
                {
                    sum+=function.apply(c);
                    stack.push(c);
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(new RomanToInteger().romanToInt("MCMXCIV"));

    }
}
