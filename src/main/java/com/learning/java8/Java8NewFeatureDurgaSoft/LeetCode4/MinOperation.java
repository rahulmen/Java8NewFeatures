package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCode4;

public class MinOperation {

    public int minOperations(String s) {

        if(s.length()==1){
            return 0;
        }
        else if(s.length()==2 && s.charAt(0)!=s.charAt(1)){
            return 0;
        }
        else if(s.length()==2 && s.charAt(0)==s.charAt(1)){
            return 1;
        }else if(s.length()==3 && s.charAt(0)==s.charAt(2) && s.charAt(0)!=s.charAt(1)){
            return 0;
        }else if(s.length()==3){
            return 1;
        }

        int maxLength = 0;
        char[] ch =  s.toCharArray();

        for(int i=0;i<ch.length-2;i++){
            if(ch[i]==ch[i+2] && ch[i]==ch[i+1]){
                if(ch[i]=='0'){
                    ch[i+1]='1';
                }else{
                    ch[i+1]='0';
                }
                maxLength++;
            }
            else if (i<ch.length-3 && ch[i]!=ch[i+2] && ch[i]!=ch[i+1] && ch[i]==ch[i+3]){
                if(ch[i+3]=='1'){
                    ch[i]='0';
                    ch[i+1]='1';
                }else{
                    ch[i]='1';
                    ch[i+1]='0';
                }
                maxLength+=2;
            }else if (ch[i]!=ch[i+2] && ch[i]!=ch[i+1]){
                if(ch[i]=='1'){
                    ch[i+1]='0';
                }else{
                    ch[i+1]='1';
                }
                maxLength++;
            }else if(ch[i]!=ch[i+2] && ch[i]==ch[i+1]){
                if(ch[i]=='0'){
                    ch[i+1]='1';
                }else{
                    ch[i+1]='0';
                }
                maxLength++;
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(new MinOperation().minOperations("10010100"));
    }
}
