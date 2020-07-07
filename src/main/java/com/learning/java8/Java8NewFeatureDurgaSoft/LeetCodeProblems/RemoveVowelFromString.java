package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

public class RemoveVowelFromString {

    public String removeVowel(String s){
        String[] s1 = new String[]{"a","e","i","o","u"};
        for(String s2:s1) {
            s= s.replaceAll(s2.toLowerCase(), "");
            s= s.replaceAll(s2.toUpperCase(), "");
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(new RemoveVowelFromString().removeVowel("rahulmendiratta"));
    }
}
