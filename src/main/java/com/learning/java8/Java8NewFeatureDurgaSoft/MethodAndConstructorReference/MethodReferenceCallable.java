package com.learning.java8.Java8NewFeatureDurgaSoft.MethodAndConstructorReference;

import java.util.concurrent.Callable;

public class MethodReferenceCallable{

    public void m1(){
        System.out.println(Thread.currentThread().getName());
        int output=0;
        for(int i=0;i<10;i++){
            output+=i;
        }
    }

    public static void main(String[] args) throws Exception{

        MethodReferenceCallable methodReferenceCallable = new MethodReferenceCallable();
        System.out.println(Thread.currentThread().getName());
        Runnable callable = methodReferenceCallable::m1;
        Thread t = new Thread(callable);
        t.start();

    }

}
