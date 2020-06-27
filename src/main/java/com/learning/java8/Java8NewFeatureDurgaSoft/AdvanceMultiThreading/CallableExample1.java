package com.learning.java8.Java8NewFeatureDurgaSoft.AdvanceMultiThreading;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.*;

public class CallableExample1 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        int[] array = {45,23,12,43};

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        Callable callable = ()->{
            int num = (int)(Math.random()*array.length);
            int sum =0;
            System.out.println(Thread.currentThread().getName()+" Executing to find sum of "+array[num]);
            int begin =0;
            while(begin<=array[num]){
                sum+=begin;
                begin++;
            }
            return sum;
        };

        for(Integer i:array) {
            Future future = executorService.submit(callable);
            System.out.println(future.get());
        }

        executorService.shutdown();

    }
}
