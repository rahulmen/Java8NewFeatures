package com.learning.java8.Java8NewFeatureDurgaSoft.MethodReference;

public class MethodReferenceExample2 {

    public static void run(){
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread Executing "+Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(MethodReferenceExample2::run);
        t.start();
        t.join();
        MethodReferenceExample2.run();


    }


}
