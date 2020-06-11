package com.learning.java8.Java8NewFeatureDurgaSoft.AdvanceMultiThreading;

public class ThreadLocalDemo1 {
    public static void main(String[] args) {
        ThreadLocal<String> threadLocal = new ThreadLocal(){
            public Object initialValue(){
                return "Rahul Mendiratta";
            }
        };
        System.out.println(threadLocal.get()); //Rahul Mendiratta
        threadLocal.set("Rahul Mendiratta Overrided Value");
        System.out.println(threadLocal.get()); //Rahul Mendiratta Overrided value
        threadLocal.remove();
        System.out.println(threadLocal.get());// Rahul Mendiratta
    }
}
