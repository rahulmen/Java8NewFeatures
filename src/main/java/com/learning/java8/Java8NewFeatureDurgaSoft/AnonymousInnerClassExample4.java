package com.learning.java8.Java8NewFeatureDurgaSoft;

@FunctionalInterface
interface interf4{

    void getName();

    }

public class AnonymousInnerClassExample4 {

    int x = 10;

    public void m1(){
        interf4 interf4 = ()->{
            int x= 40; //getName() method local variable and usinf Lambda Expression it is not possible to use instance variable
            System.out.println(x);
            System.out.println(AnonymousInnerClassExample4.this.x);
        };
        interf4.getName();
    }


    public static void main(String[] args) {
        AnonymousInnerClassExample4 anonymousInnerClassExample4 = new AnonymousInnerClassExample4();
        anonymousInnerClassExample4.m1();

    }





}
