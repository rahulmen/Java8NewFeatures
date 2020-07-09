package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

public class LexicographicOrder {

    public int minDeletionSize(String[] A) {
        int minDelete=0;
        int counter =0;
        while(counter<A[0].length()) {
            char[] ch = new char[A.length];
            for (int i = 0; i < A.length; i++) {
                ch[i] = A[i].charAt(counter);
            }
            for (int j = 0; j < ch.length - 1; j++) {
                if (ch[j] <= ch[j + 1]) {
                    continue;
                }
                else{
                    minDelete++;
                    break;
                }
            }
            counter++;
        }
        return minDelete;
    }

    public static void main(String[] args) {

        int deletion = new LexicographicOrder().minDeletionSize(new String[]{"xga","xfb","yfa"});
        System.out.println(deletion);

    }
}
