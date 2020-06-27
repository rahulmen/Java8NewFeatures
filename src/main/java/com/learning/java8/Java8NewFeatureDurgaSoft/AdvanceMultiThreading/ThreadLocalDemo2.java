package com.learning.java8.Java8NewFeatureDurgaSoft.AdvanceMultiThreading;

class CustomerThread extends Thread{

    private String threadName;
    private static int customerId;

    private static ThreadLocal<Integer> threadLocal = new ThreadLocal(){
        public Object initialValue(){
          return ++customerId;
        };
    };

    CustomerThread(String name){
        this.threadName=name;
    }

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+" executing with CustomerId:"+threadLocal.get());
    }
}

public class ThreadLocalDemo2 {

    public static void main(String[] args) {

        CustomerThread customerThread1 = new CustomerThread("CustomerThread1");
        CustomerThread customerThread2 = new CustomerThread("CustomerThread2");
        CustomerThread customerThread3 = new CustomerThread("CustomerThread3");
        CustomerThread customerThread4 = new CustomerThread("CustomerThread4");
        customerThread1.start();
        customerThread2.start();
        customerThread3.start();
        customerThread4.start();
    }
}
