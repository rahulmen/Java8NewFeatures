package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

public class DefanningAnIPAddress {

    public String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }

    public static void main(String[] args) {

        System.out.println(new DefanningAnIPAddress().defangIPaddr("1.1.1.1"));


    }
}
