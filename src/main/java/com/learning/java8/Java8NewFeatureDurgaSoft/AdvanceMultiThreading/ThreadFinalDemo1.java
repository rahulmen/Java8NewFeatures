package com.learning.java8.Java8NewFeatureDurgaSoft.AdvanceMultiThreading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadFinalDemo1 {

    public static ArrayList<Integer> arrayList =
            new ArrayList<>(Arrays.asList(678,743,24,43,245,245,5432,456,532,245));

    public static ExecutorService service = Executors.newFixedThreadPool(4);

    public static void main(String[] args) throws Exception {


        ThreadLocal threadLocal = new ThreadLocal();

        Callable c = () -> {
            int count = 0;
            int sum = 0;
            if(threadLocal.get()==null){
               threadLocal.set(arrayList.get((int)(Math.random()*arrayList.size())));
            }
            int num = (int)threadLocal.get();
            System.out.println(Thread.currentThread().getName()+" begin execution Number is "+num);
            while (count < num) {
                sum += count;
                count++;
            }
            return sum;
        };

        System.out.println(Thread.currentThread().getName()+" thread begin Execution");
        System.out.println(Thread.currentThread().getName()+" thread initial value is "+threadLocal.get());

        if(threadLocal.get()==null){
            System.out.println("Initial value is not set while initialising ThreadLocal!!");
        }

        for(int i=0;i<5;i++) {
            Future<Integer> future = service.submit(c);
            System.out.println("Sum is : " + future.get());
        }
        service.shutdown();

    }

}
