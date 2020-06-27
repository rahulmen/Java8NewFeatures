package com.learning.java8.Java8NewFeatureDurgaSoft.AdvanceMultiThreading;

public class WordPattern {


    public boolean wordPattern(String pattern, String str) {

        if (pattern.length() != str.split(" ").length && pattern.length() % 2 != 0 && str.split(" ").length % 2 != 0) {
            return false;
        }

        String[] temp = str.split(" ");

        int i = pattern.length() / 2;
        int j = i - 1;
        boolean mismatch = true;

        while (i <= pattern.length() && j >= 0) {

            if (i < pattern.length() && j > 0 && pattern.charAt(i) != pattern.charAt(i + 1)
                    && !temp[i].equals(temp[i + 1]) && !temp[j].equals(temp[j - 1]) && pattern.charAt(j) != pattern.charAt(j - 1)) {
                mismatch = false;
            }else{
                mismatch = true;
                break;
            }

            if (pattern.charAt(i) == pattern.charAt(j) && temp[i].equals(temp[j])) {
                    if (j != 0) {
                        j--;
                        i++;
                    } else {
                        break;
                    }
            }else{
                    return false;
                }
            }

        if (i == pattern.length() - 1 && j == 0 && mismatch == false) {
            return true;
        } else {
            return false;
        }
    }

        public static void main (String[]args){

            System.out.println(new WordPattern().wordPattern("aa", "cat cat"));
        }

    }



/*
 if (pattern.charAt(pattern.length() / 2) == pattern.charAt((pattern.length() / 2) - 1) && temp[temp.length / 2].equals(temp[(temp.length / 2) - 1])
        ) {
            return true;
        } else {
            return false;
        }
 */
