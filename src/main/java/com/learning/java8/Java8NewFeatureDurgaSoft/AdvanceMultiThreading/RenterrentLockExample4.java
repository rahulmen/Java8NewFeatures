package com.learning.java8.Java8NewFeatureDurgaSoft.AdvanceMultiThreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RenterrentLockExample4 {

    public static void main(String[] args){

        Lock reentrantLock = new ReentrantLock();

        Runnable r = ()-> {
            try {
                if (reentrantLock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                    System.out.println(Thread.currentThread().getName() + " got a lock");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException nsee) {
                        nsee.printStackTrace();
                    }
                    reentrantLock.unlock();
                } else {
                    System.out.println(Thread.currentThread().getName() + " didn't get a lock");
                }
            }catch (InterruptedException nsee){
                nsee.printStackTrace();
            }
        };

        Thread thread1 = new Thread(r,"First Thread");
        Thread thread2 = new Thread(r,"Second Thread");
        thread1.start();
        thread2.start();




    }
}
