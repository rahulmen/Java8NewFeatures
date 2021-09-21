package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem3;

import java.util.Scanner;

public class ThreeExPlusOneProblem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextInt();
        while (number > 1) {
            System.out.print(number + ",");
            if (number % 2 != 0) {
                number = 3 * number + 1;
            } else {
                number = number / 2;
            }
        }
        System.out.print(number);
    }
}
