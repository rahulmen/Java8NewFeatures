package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem2;

public class Compressrray {

    public int compress(char[] chars) {
        int counter = 1;
        int i = 0;
        int j = 0;

        while (i < chars.length) {
            if (i < chars.length - 1) {
                if (chars[i] == chars[i + 1]) {
                    i++;
                    counter++;
                } else if (chars[i] != chars[i + 1] && counter > 1) {
                    chars[j] = chars[i];
                    if (counter > 9) {
                        String value = String.valueOf(counter);
                        for (int k = 0; k < value.length(); k++) {
                            chars[j + k + 1] = value.charAt(k);
                        }
                        j += value.length();
                    } else {
                        chars[j + 1] = (char) (counter + '0');
                        j += 2;
                    }
                    counter = 1;
                    i++;
                } else if (chars[i] != chars[i + 1] && counter == 1) {
                    chars[j] = chars[i];
                    j++;
                    i++;
                }
            } else {
                if (counter > 1 && chars[i] == chars[i - 1]) {
                    chars[j] = chars[i];
                    if (counter > 9) {
                        String value = String.valueOf(counter);
                        for (int k = 0; k < value.length(); k++) {
                            chars[j + k + 1] = value.charAt(k);
                        }
                        j += value.length()+1;
                    } else {
                        chars[j + 1] = (char) (counter + '0');
                        j += 2;
                    }
                    i++;
                } else {
                    chars[j] = chars[i];
                    i++;
                    j++;
                }
            }
        }
        return j;
    }


        public static void main(String[] args) {

        System.out.println(new Compressrray().compress(new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'}));
    }
}
