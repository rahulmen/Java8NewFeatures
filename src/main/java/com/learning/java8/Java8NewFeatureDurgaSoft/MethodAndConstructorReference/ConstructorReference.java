package com.learning.java8.Java8NewFeatureDurgaSoft.MethodAndConstructorReference;

interface CreateConstructorReferenceObject{
    abstract ConstructorReference get(String name);
}

public class ConstructorReference {

    String name;

    ConstructorReference(String name){
        this.name=name;
    }

    public void m1(){
        System.out.println("m1 method");
    }

    public static void main(String[] args) {
        CreateConstructorReferenceObject createConstructorReferenceObject = name1 -> new ConstructorReference(name1);
        ConstructorReference constructorReference = createConstructorReferenceObject.get("Rahul");
        constructorReference.m1();
        System.out.println(constructorReference.name);
    }
}
