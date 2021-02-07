package com.learning.java8.Java8NewFeatureDurgaSoft.SecuronixInterview.Utils;

public class ReverseStringWords {

    public String reverseString(String str){
        String[] split = str.split(" ");
        StringBuilder output = new StringBuilder();
        for(String s:split){
            StringBuilder local = new StringBuilder();
            char[] ch = s.toCharArray();
            int i=ch.length-1;
            while(i>=0){
                if((int)ch[i]>=97 && (int)ch[i]<=122) {
                    local.append(ch[i]);
                }
                i--;
            }
            output.append(local).append(" ");
        }
        return output.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(new ReverseStringWords().reverseString("my na@me i%&*s* r@ahu?_?l mendir@at&ta"));
    }
}
