package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem3;

public class DecodeString {


    public String decodeString(String s) {
        while (s.contains("[") || s.contains("]")) {
            StringBuilder str = new StringBuilder();
            int index1 = -1;
            int index2 = -1;
            int counter = 0;
            int beginIndex = -1;
            boolean b = false;

            for (char c : s.toCharArray()) {
                if (c == '[') {
                    index1 = counter;
                    b = false;
                }
                else if (c == ']')
                    index2 = counter;
                else if((int)c>=48 && (int)c<=57 && b==false){
                    b=true;
                    beginIndex=counter;
                }

                if (index1 != -1 && index2 != -1) {
                    int loop = Integer.valueOf(s.substring(beginIndex, index1));
                    String charSeq = s.substring(index1+1, index2);
                    while (loop > 0) {
                        str.append(charSeq);
                        loop--;
                    }
                    break;
                }
                counter++;
            }
            s = s.substring(0,index1-(index1-beginIndex))+str.toString()+s.substring(index2+1,s.length());
        }
        return s;
    }

    public static void main(String[] args) {

        System.out.println(new DecodeString().decodeString("31[a2[c]]"));

    }
}
