package com.learning.java8.Java8NewFeatureDurgaSoft.AdvanceMultiThreading;

class ParentThread extends Thread{

    protected static InheritableThreadLocal inheritableThreadLocal = new InheritableThreadLocal(){
        @Override
        public Object childValue(Object parent){
            return "CC";
        }
    };

    @Override
    public void run(){
        inheritableThreadLocal.set("PP");
        System.out.println(Thread.currentThread().getName()+" Executing with initialValue "+inheritableThreadLocal.get());
        ChildThread childThread = new ChildThread();
        childThread.start();
    }
}

class ChildThread extends Thread{
    @Override
    public void run(){
     System.out.println(Thread.currentThread().getName()+" Executing with initialValue "+ParentThread.inheritableThreadLocal.get());
    }
}

public class ThreadLocalDemo3 {
    public static void main(String[] args) {
     ParentThread parentThread = new ParentThread();
     parentThread.start();
    }
}
