package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem2;

public class HammingDistance {

        public int hammingDistance(int a, int b) {

            String x = Integer.toBinaryString(a);
            String y = Integer.toBinaryString(b);

            System.out.println(x);
            System.out.println(y);

            int i = x.length() - 1;
            int j = y.length() - 1;
            int output = 0;

            while (i >= 0 || j >= 0) {
                if (i >= 0 && j >= 0) {
                    if (x.charAt(i) != y.charAt(j)) {
                        output++;
                    }
                    i--;
                    j--;
                } else if (i >= 0 && j < 0) {
                    if (x.charAt(i) == '1') {
                        output++;
                    }
                    i--;
                } else if (j >= 0 && i < 0) {
                    if (y.charAt(j) == '1') {
                        output++;
                    }
                    j--;
                }
            }

            return output;

        }

    public static void main(String[] args) {
        System.out.println(new HammingDistance().hammingDistance(1,3));
    }
}
