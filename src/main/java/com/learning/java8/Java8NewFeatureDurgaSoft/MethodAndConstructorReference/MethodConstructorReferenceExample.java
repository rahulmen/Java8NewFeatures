package com.learning.java8.Java8NewFeatureDurgaSoft.MethodAndConstructorReference;

@FunctionalInterface
interface Details{
    String getDetails();
}

@FunctionalInterface
interface Detail{
    MethodConstructorReferenceExample getDetails(String message);
}

public class MethodConstructorReferenceExample {

    MethodConstructorReferenceExample(){
        super();
    }

    MethodConstructorReferenceExample(String message){
        System.out.println("This is a constructor which can be a implmentation for getDetails abstract method in Details interface "+message);
    }

    public String instanceMeta(){
        return "This is a instance method which can be a implmentation for getDetails abstract method in Details interface";
    }

    public static String staticMeta(){
        return "This is a static method which can be a implmentation for getDetails abstract method in Details interface";
    }

    public static void main(String[] args) {

        Details details = MethodConstructorReferenceExample::staticMeta;
        System.out.println(details.getDetails());
        details = new MethodConstructorReferenceExample()::instanceMeta;
        System.out.println(details.getDetails());
        Detail detail = MethodConstructorReferenceExample::new;
        detail.getDetails("\nThanks Constructor");

    }



}
