package com.learning.java8.Java8NewFeatureDurgaSoft;

interface Left {
    default void m1() {
        System.out.println("Left m1 method");
    }
}

interface Right {
    default void m1() {
        System.out.println("RIght m1 method");
    }
}


public class InterfacedefaultMethodExample2 implements Left, Right {

    @Override
    public void m1() {
        System.out.println("Overrided Default method m1");
        Left.super.m1();
    }

    public static void main(String[] args) {

        InterfacedefaultMethodExample2 interfacedefaultMethodExample2 = new InterfacedefaultMethodExample2();
        interfacedefaultMethodExample2.m1();

    }

}
