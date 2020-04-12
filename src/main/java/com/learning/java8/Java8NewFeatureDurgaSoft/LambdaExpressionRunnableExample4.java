package com.learning.java8.Java8NewFeatureDurgaSoft;

public class LambdaExpressionRunnableExample4 {

    public static void main(String[] args) {

        Runnable runnable1 = ()->{
            System.out.println(Thread.currentThread().getName());
            System.out.println("Run Method implemented");
        };
        Thread thread = new Thread(runnable1);
        thread.start();
        System.out.println(Thread.currentThread().getName());
        System.out.println("Main Thread execution");

    }


}
