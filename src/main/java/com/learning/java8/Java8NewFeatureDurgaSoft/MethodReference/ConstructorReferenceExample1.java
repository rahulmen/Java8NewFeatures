package com.learning.java8.Java8NewFeatureDurgaSoft.MethodReference;

interface interf1{
    public ConstructorReferenceExample1 get();
}

public class ConstructorReferenceExample1 {

    ConstructorReferenceExample1(){
        System.out.println("ConstructorReferenceExample1 Object Created");
    }

    public static void main(String[] args) {

        interf1 interf1 = ConstructorReferenceExample1::new;
        interf1.get();

    }

}
