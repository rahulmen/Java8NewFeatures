package com.learning.java8.Java8NewFeatureDurgaSoft.AdvanceMultiThreading;

import org.apache.commons.lang3.RandomUtils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample1 {


    public static void main(String[] args) {

        String[] names = {"Dharmo","Ramesh","Rahul","Hemant","Liyan","Jyoti","Yamini"};


        ExecutorService executorService = Executors.newFixedThreadPool(names.length);


        Runnable r =()->{
            System.out.println(Thread.currentThread().getName()+" Executing for "+ names[(int)(Math.random()*names.length)]);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException nsee){
                nsee.printStackTrace();
            }
            System.out.println("Run method Executed");
        };


        for(String name:names){
            executorService.submit(r);
        }
        executorService.shutdown();
    }
}
