package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem3;

public class CheckIfStringisPalindrome {

    public boolean isPalindrome(String s) {

        int i=0;
        int j = s.length()-1;

        while(i<j){

            int Iascci = (int)s.charAt(i);
            int Jascii = (int)s.charAt(j);

            if(Iascci<65 || (Iascci>90 && Iascci<97) || Iascci>122){
                i++;
                continue;
            }else if(Jascii<65 || (Jascii>90 && Jascii<97) || Jascii>122){
                j--;
                continue;
            }
            if(!s.substring(i,i+1).toLowerCase().equals(s.substring(j,j+1).toLowerCase())){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(new CheckIfStringisPalindrome().isPalindrome("0P"));


    }

}
