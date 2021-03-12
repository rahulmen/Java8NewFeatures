package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem3;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class ThreadConsumer{

    static ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
    static List<Callable<Double>> list = new ArrayList<>();
    static List<Future<Double>> futures = new ArrayList<>();
    static Callable<Double> callable = null;

    public static void main(String[] args) throws Exception {

        System.out.println("Main Thread Executed");

        for(int x=0;x<10;x++) {
            callable = () -> Math.random();
            list.add(callable);
        }

        futures = executorService.invokeAll(list);

        futures.forEach(out->{
            try {
                System.out.println(out.get());
            }catch(Exception nsee){
                System.out.println(nsee.getMessage());
            }finally {
                executorService.shutdown();
            }
        });


    }

}
