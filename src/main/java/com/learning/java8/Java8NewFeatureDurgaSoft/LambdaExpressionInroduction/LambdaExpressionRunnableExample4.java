package com.learning.java8.Java8NewFeatureDurgaSoft.LambdaExpressionInroduction;

public class LambdaExpressionRunnableExample4 {

    public static void main(String[] args) throws Exception{

        Runnable runnable1 = ()->{
            System.out.println(Thread.currentThread().getName());
            System.out.println("Run Method implemented");
        };
        Thread thread = new Thread(runnable1);
        //runnable1.run();
        thread.start();
        Thread.sleep(2);
        System.out.println(Thread.currentThread().getName());
        System.out.println("Main Thread execution");

    }


}
