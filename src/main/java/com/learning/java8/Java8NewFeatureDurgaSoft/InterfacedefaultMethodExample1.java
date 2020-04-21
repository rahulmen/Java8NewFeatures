package com.learning.java8.Java8NewFeatureDurgaSoft;

@FunctionalInterface
interface DefaultExample1 {

    default void m1(){
        System.out.println("Default m1 method");
    }

    void m2();

}


public class InterfacedefaultMethodExample1 implements DefaultExample1 {

    @Override
    public void m1(){
        System.out.println("OverRided default method m1");
    }

    @Override
    public void m2() {
        System.out.println("Abstract method implemented");
    }

    public void m3(){
        DefaultExample1 defaultExample1 = ()-> System.out.println("Default method implemented using lambda Expression");
        defaultExample1.m2();
    }

    public static void main(String[] args) {

        DefaultExample1 defaultExample1 = new InterfacedefaultMethodExample1();
        defaultExample1.m1();
        defaultExample1.m2();
        InterfacedefaultMethodExample1 interfacedefaultMethodExample1 = new InterfacedefaultMethodExample1();
        interfacedefaultMethodExample1.m3();
        //Overriding is a run time polymorphism or late binding which means method will be executed class whose Object is created
        //Parent reference can be used to hold child object but using those implementation we can execute method which are only present in parent.






    }

}
