package com.learning.java8.Java8NewFeatureDurgaSoft;

interface interface1 {
    public void m1();

    public void m2();

    public void m3();
}

@FunctionalInterface
interface interface2 {
    public void m1();
}

class class1 {

    public void m1() {
        System.out.println("Concreate class m1 method");
    }
}

abstract class abstractClass1 {

    abstract public void m1();

    public void m2() {
        System.out.println("Abstract class m2 method");
    }

}


public class AnonymousInnerClassExample1 {

    public static void main(String[] args) {

        interface1 interface1 = new interface1() {
            @Override
            public void m1() {
                System.out.println("m1 method implemented");
            }

            @Override
            public void m2() {
                System.out.println("m2 method implemented");

            }

            @Override
            public void m3() {
                System.out.println("m3 method implemented");
            }
        };

        interface1.m2();
        interface2 interface2 = () -> System.out.println("m1 method of functional interface implemented");
        interface2.m1();


    }


}
