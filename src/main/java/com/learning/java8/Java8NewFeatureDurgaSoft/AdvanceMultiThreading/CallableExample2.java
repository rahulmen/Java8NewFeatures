package com.learning.java8.Java8NewFeatureDurgaSoft.AdvanceMultiThreading;

import org.w3c.dom.ls.LSOutput;

import java.util.concurrent.*;

class GetSum implements Callable{

    int number;

    public GetSum(int number) {
        this.number = number;
    }

    @Override
    public Object call() throws Exception {
        System.out.println(Thread.currentThread().getName()+" Thread begin execution");

        int num=0,sum=0;

        while(num<this.number){
            sum+=num;
            num++;
        }
        System.out.println(Thread.currentThread().getName()+" Thread begin completed");
        return sum;
    }


}

public class CallableExample2 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        int[] getSums = {100000};

        int count =0;
        int digitLength =0;
        for(int i=0;i<getSums.length;i++){
            digitLength = (int)Math.log10(getSums[i])+1;
            if(digitLength%2==0){
                count++;
            }
        }

        System.out.println(count);

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        for(Integer num:getSums){
            Callable c = new GetSum(num);
            Future<Integer> future = executorService.submit(c);
            System.out.println("Sum of "+num + " is "+ future.get());
        }
        executorService.shutdown();
    }

}
