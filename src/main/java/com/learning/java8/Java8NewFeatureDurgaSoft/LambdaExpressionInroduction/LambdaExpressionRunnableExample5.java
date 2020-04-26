package com.learning.java8.Java8NewFeatureDurgaSoft.LambdaExpressionInroduction;

public class LambdaExpressionRunnableExample5 {


    public static void main(String[] args) throws InterruptedException {

        Runnable runnable = () -> {
            System.out.println(Thread.currentThread().getName());
            for(int i=0;i<10;i++){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Child Thread Executing");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        thread.join();
        System.out.println(Thread.currentThread().getName());
        for(int i=0;i<10;i++){
            System.out.println("Main Thread Executing");
        }


    }

}
