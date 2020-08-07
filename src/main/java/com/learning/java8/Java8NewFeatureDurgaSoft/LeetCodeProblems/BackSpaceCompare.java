package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

public class BackSpaceCompare {

    public boolean backspaceCompare(String S, String T) {

        if(appendString(S).equals(appendString(T)))return true;
        return false;

    }


    public static String appendString(String temp){

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<temp.length();i++){
            if(temp.charAt(i)!='#'){
                sb.append(temp.charAt(i));
            }else if(temp.charAt(i)=='#' && !sb.toString().isEmpty()){
                sb.deleteCharAt(sb.length()-1);
            }
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        System.out.println(new BackSpaceCompare().backspaceCompare("#ab#c","ad#c"));
    }
    /*
    "#ab#c"
"ad#c"
     */
}
