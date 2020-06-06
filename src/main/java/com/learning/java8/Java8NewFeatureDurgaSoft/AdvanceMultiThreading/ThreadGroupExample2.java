package com.learning.java8.Java8NewFeatureDurgaSoft.AdvanceMultiThreading;

import java.util.stream.Stream;

public class ThreadGroupExample2 {


    public static void main(String[] args) {

        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup().getParent();
        System.out.println(threadGroup.getName());
        Thread[] t = new Thread[threadGroup.activeCount()];
        threadGroup.enumerate(t);
        Stream.of(t).forEach(thread-> System.out.println(thread.getName()+" "+thread.getPriority()));
    }
}
