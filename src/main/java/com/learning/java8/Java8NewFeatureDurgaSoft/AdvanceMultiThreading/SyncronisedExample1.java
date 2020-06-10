package com.learning.java8.Java8NewFeatureDurgaSoft.AdvanceMultiThreading;

class Display{

    public synchronized void wish(String name){

        for(int i=0;i<5;i++) {
            System.out.println("Good Morning "+name);
            try {
                Thread.sleep(1000);
            }catch(InterruptedException nsee){
                nsee.printStackTrace();
            }
        }
    }
}

public class SyncronisedExample1 {

    public static void main(String[] args) {
       Display d = new Display();
       Runnable r = ()->{
           d.wish("Dhoni");
       };
       Thread t1 = new Thread(r);
        Runnable r1 = ()->{
            d.wish("Yuvraj");
        };
        Thread t2 = new Thread(r1);
        t1.start();
        t2.start();




    }
}
