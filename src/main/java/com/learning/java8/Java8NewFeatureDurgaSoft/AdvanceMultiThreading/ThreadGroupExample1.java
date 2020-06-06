package com.learning.java8.Java8NewFeatureDurgaSoft.AdvanceMultiThreading;

import java.util.stream.Stream;

public class ThreadGroupExample1 {


    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getThreadGroup().getName()); //main group
        System.out.println(Thread.currentThread().getThreadGroup().getMaxPriority()); //main group max priority

        //Note main thread is part of main thread group and main thread group parent is System group.
        //Every thread in Java is the child thread of System either directly or indirectly.

        System.out.println(Thread.currentThread().getThreadGroup().getParent().getName()); //System
        System.out.println(Thread.currentThread().getThreadGroup().getParent().getMaxPriority()); //System group max priority


        ThreadGroup threadGroup = new ThreadGroup("First Group");
        System.out.println(threadGroup.getName()); //First Group group
        System.out.println(threadGroup.getParent().getName()); //main group
        ThreadGroup threadGroup1 = new ThreadGroup(threadGroup,"Second Group");
        System.out.println(threadGroup1.getName()); //Second Group group
        System.out.println(threadGroup1.getParent().getName()); //First group
        Thread t = new Thread(threadGroup1,threadGroup1.getName()+" First thread");
        threadGroup1.setMaxPriority(3);
        Thread t1 = new Thread(threadGroup1,threadGroup1.getName()+" Second thread");
        System.out.println(t.getPriority()); //5 there is not change in priority of already exiting thread if thread group priority is changed
        System.out.println(t1.getPriority()); //3
        t.start();
        t1.start();
        System.out.println(threadGroup1.activeCount());
        Thread[] threads = new Thread[10];
        threadGroup1.enumerate(threads);
        Stream.of(threads).forEach(thread->{
            if(thread!=null) {
                System.out.println(thread.getName() + " " + t.getPriority());
            }
        });
    }
}
