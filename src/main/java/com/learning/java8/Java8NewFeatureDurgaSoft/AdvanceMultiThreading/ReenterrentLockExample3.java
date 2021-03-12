package com.learning.java8.Java8NewFeatureDurgaSoft.AdvanceMultiThreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReenterrentLockExample3 {

    public static void main(String[] args){

        Lock lock = new ReentrantLock(true);

        Runnable runnable = ()->{
            do{
                try {
                    if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                        System.out.println(Thread.currentThread().getName()+" Yeah!! I got a lock now i will sleep for 5 seconds");
                        try{
                            Thread.sleep(5000);
                        }catch(InterruptedException nsee){
                            nsee.printStackTrace();
                        }
                        lock.unlock();
                        break;
                    }else{
                        System.out.println(Thread.currentThread().getName()+" didn't get a lock!! So i will tryLock for 1 second");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }while (true);
        };

        Thread thread1 = new Thread(runnable,"First Thread");
        Thread thread2 = new Thread(runnable,"Second Thread");
        thread1.start();
        thread2.start();
    }
}
