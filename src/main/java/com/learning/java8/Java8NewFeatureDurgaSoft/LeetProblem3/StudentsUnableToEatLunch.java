package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem3;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class StudentsUnableToEatLunch {

    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new PriorityQueue<>();

        for(int i:sandwiches){ stack.push(i); }
        for(int i:students){ queue.add(i); }

        return Integer.MIN_VALUE;

    }

    public static void main(String[] args) {

        System.out.println(new StudentsUnableToEatLunch().countStudents(new int[]{1,1,0,0},
                new int[] {0,1,0,1}));

    }


}
