package com.learning.java8.Java8NewFeatureDurgaSoft.LambdaExpressionInroduction;

public class LambdaExpressionUsingAnonomousInnerClass {

  public static void main(String[] args) throws InterruptedException {

    Thread thread = new Thread(() -> {
      System.out.println(Thread.currentThread().getName());
      for (int i = 0; i < 10; i++) {
        try {
          Thread.sleep(500);
        } catch (InterruptedException nsee) {
          nsee.printStackTrace();
        }
        System.out.println("Child Thread Executing " + i);
      }
    });
    thread.start();
    thread.join();
    System.out.println(Thread.currentThread().getName());
    for (int i = 0; i < 10; i++) {
      System.out.println("Main Thread Executing " + i);
    }
  }
}

