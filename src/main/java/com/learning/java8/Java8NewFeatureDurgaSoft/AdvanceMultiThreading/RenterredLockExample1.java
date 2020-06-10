package com.learning.java8.Java8NewFeatureDurgaSoft.AdvanceMultiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RenterredLockExample1 {

    public static void main(String[] args) throws InterruptedException {

        ReentrantLock lock = new ReentrantLock(true);
        System.out.println(lock.isLocked()); //false
        lock.lock();
        System.out.println(lock.isLocked()); //true
        System.out.println(lock.getHoldCount()); //1
        Runnable r = ()->{
            lock.tryLock();
            System.out.println("Child Thread Executing");
        };
        Thread t = new Thread(r);
        t.start();
        System.out.println(lock.getQueueLength()); //0
        lock.unlock();
        System.out.println(lock.isLocked()); //false
        System.out.println(lock.getHoldCount()); //0
        System.out.println(lock.getQueueLength()); //0
    }

}
