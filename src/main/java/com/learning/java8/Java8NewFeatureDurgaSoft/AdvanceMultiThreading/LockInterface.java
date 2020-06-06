package com.learning.java8.Java8NewFeatureDurgaSoft.AdvanceMultiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockInterface {

    public static void main(String[] args) {

        Lock lock = new ReentrantLock();
        lock.lock(); // We can use this method ti aquired a lock if lock is already avalible then immidetly current thread will get that lock.
        //If the lock is not already avalaible then it will wait until getting the lock
        //It is exacly same behaviour of existing traditional synchronize block.
        lock.tryLock();

    }

}
