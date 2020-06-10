package com.learning.java8.Java8NewFeatureDurgaSoft.AdvanceMultiThreading;

import java.util.concurrent.locks.ReentrantLock;

class Display1 {

    ReentrantLock reentrantLock = new ReentrantLock(true);

    public void wish(String name) {

        reentrantLock.lock();
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread Queue Length "+reentrantLock.getQueueLength());
                System.out.println("Good Morning " + name);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException nsee) {
                    nsee.printStackTrace();
                }
            }
            reentrantLock.unlock();
        }
    }

public class RenterrentExample1 {

    public static void main(String[] args) {
       Display1 d = new Display1();
       Runnable r = ()->{
           d.wish("Dhoni");
       };
       Thread t1 = new Thread(r,"Dhoni Thread");
        Runnable r1 = ()->{
            d.wish("Yuvraj");
        };
        Thread t2 = new Thread(r1,"Yuvraj Thread");
        t1.start();
        t2.start();
    }
}
