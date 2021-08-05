package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem3;

public class LongestPalindrome {

    public String longestPalindrome(String s) {

        //int length = 0;
        String out = null;
        //int i = 0;int j = s.length()-1;
        int k = 0;int l = s.length()-1;
        boolean left = false;boolean right = false;
        int count=0;

        while(k<=l){
            if(s.charAt(k)==s.charAt(l)){
 //               length++;
                k++;l--;
                count++;
            }else {
                count = 0;
                k = k - count;
                l = l + count;
                if (left == false && right == false) {
                    right = true;
                } else if (left == false && right == true) {
                    right = false;
                    left = true;
                } else {
                    right = true;
                    left = false;
                }
                if (right == true && k == 0 && l == s.length() - 1) {
                    l--;
                } else if (left == true) {
                    k++;
                    l++;
                } else if (right == true) {
                    l--;
                }
                continue;
            }
            if(l==k || l<k){
                out = s.substring(k-count,l+count+1);
            }

        }
        return out;
    }

    public static void main(String[] args) {
        System.out.println(new LongestPalindrome().longestPalindrome("ejc 3 k3 3 d"));
    }

}
