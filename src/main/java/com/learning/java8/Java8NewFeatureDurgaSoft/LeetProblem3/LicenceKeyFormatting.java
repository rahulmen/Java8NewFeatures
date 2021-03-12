package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem3;

public class LicenceKeyFormatting {

    public String licenseKeyFormatting(String S, int K) {

        StringBuilder sb1 = new StringBuilder();

        int length =0;
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)!='-') {
                sb1.append(S.charAt(i));
                length++;
            }
        }
        int remainder = length%K;
        int parts = remainder==0?length/K:(length/K)+1;

        System.out.println(remainder);
        System.out.println(parts);

        StringBuilder sb2 = new StringBuilder();

        int begin = 0;
        int end = K;
        for(int i=0;i<parts;i++){

            if(i==0 && remainder!=0){
                sb2.append(sb1.substring(begin,remainder).toUpperCase());
                sb2.append("-");
                begin=remainder;
                end=remainder+K;
                continue;
            }
            sb2.append(sb1.substring(begin,end).toUpperCase());
            if(i<parts-1){
                sb2.append("-");
            }
            begin=end;
            end+=K;
        }
        return sb2.toString();
    }

    public static void main(String[] args) {

        System.out.println(new LicenceKeyFormatting().licenseKeyFormatting("2-5g-3-J",2));

    }

}
