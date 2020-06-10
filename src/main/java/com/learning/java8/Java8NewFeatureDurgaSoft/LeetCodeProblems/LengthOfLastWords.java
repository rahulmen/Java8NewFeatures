package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

public class LengthOfLastWords {


    public int lengthOfLastWord(String s) {

        boolean onlySpace = true;
        char[] ch = s.toCharArray();
        for (Character c:ch){
            if(onlySpace==false){
                break;
            }
            if(c==' '){
                onlySpace = true;
            }else{
                onlySpace=false;
            }
        }
        if(onlySpace==true){
            return 0;
        }
        else{
            String[] temp = s.split(" ");
            return temp[temp.length-1].length();
        }
    }


    public static void main(String[] args) {

        System.out.println(new LengthOfLastWords().lengthOfLastWord("a "));


    }
}
