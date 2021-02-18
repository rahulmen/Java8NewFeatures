package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem3;

public class RemoveOuterMostParanthesis {

    public String removeOuterParentheses(String S) {
        StringBuilder str = new StringBuilder();
        int count = 0;
        int beginIndex = 0;
        boolean b = false;
        for(int i=0;i<S.length();i++){
            if(count==0 && b == true){
                str.append(S.substring(beginIndex+1,i-1));
                b=false;
                beginIndex=i;
            }
            if(S.charAt(i)=='('){
                b=true;
                count++;
            }else if(S.charAt(i)==')'){
                b=true;
                count--;
            }
        }
        str.append(S.substring(beginIndex+1,S.length()-1));
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(new RemoveOuterMostParanthesis().removeOuterParentheses("(()())(())(()(()))"));
    }

}
