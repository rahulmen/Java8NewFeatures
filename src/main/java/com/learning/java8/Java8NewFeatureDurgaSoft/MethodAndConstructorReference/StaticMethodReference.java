package com.learning.java8.Java8NewFeatureDurgaSoft.MethodAndConstructorReference;

interface GetMessage{

    abstract void message();
}


public class StaticMethodReference {

    public static void getStaticMessage(){
        System.out.println("Lambda Function Implmentation using static method reference");
    }

    public void getInstanceMessage(){
        System.out.println("Lambda Function Implmentation using instance method reference");
    }


    public static void main(String[] args) {

        GetMessage getMessage = ()->System.out.println("Lambda Function Implmentation");
        getMessage.message();
        GetMessage getMessage1 = StaticMethodReference::getStaticMessage;
        getMessage1.message();
        GetMessage getMessage2 = new StaticMethodReference()::getInstanceMessage;
        getMessage2.message();

    }
}
