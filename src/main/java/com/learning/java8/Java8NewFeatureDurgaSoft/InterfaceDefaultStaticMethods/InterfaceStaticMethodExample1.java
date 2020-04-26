package com.learning.java8.Java8NewFeatureDurgaSoft.InterfaceDefaultStaticMethods;

/*
From Java 1.8 we can run interface also because we can define static method in interface from Java 1.8.

As per Java Login Parent Class method is by default availaible to child but interface static method are
not avalaible to child and hence overriding concept is not applicable to Interface static method.

 */

public interface InterfaceStaticMethodExample1 {

    public static void m1(){
        System.out.println("Interface static method m1");
    }

    public static void main(String[] args) {
        m1();
    }

}


class StaticExample1 implements InterfaceStaticMethodExample1{

    public static void main(String[] args) {
        StaticExample1 staticExample1 = new StaticExample1();
    }

}
