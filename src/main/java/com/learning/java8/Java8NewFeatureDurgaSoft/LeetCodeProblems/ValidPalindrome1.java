package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

public class ValidPalindrome1 {


 /*   public boolean isPalindrome(CharSequence sb){
        for(int i=0;i<sb.length()/2;i++) {
            if (sb.charAt(i) != sb.charAt(sb.length()-i-1)) {
                return false;
            }
        }
        return true;
    }


    public boolean validPalindrome(String s) {
       StringBuilder stringBuilder = new StringBuilder(s);
       for(int i=0;i<s.length();i++){
           char ch = stringBuilder.charAt(i);
           stringBuilder.deleteCharAt(i);
           if(isPalindrome(stringBuilder)){
               return true;
           }
           stringBuilder.insert(i,ch);
       }

       return isPalindrome(s);
    }*/

    public boolean isPalindromeRange(String s, int i, int j) {
        int mid = i+(j-i)/2;
        for (int k = i; k <= mid; k++) {
            if (s.charAt(k) != s.charAt(j)) return false;
            j--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                int j = s.length() - 1 - i;
                return (isPalindromeRange(s, i, j-1) || isPalindromeRange(s, i+1, j));
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(new ValidPalindrome1().validPalindrome("abebcbba"));

    }
}
