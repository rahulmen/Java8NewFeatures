package com.learning.java8.Java8NewFeatureDurgaSoft.ShivanshuLamdbaTeaching;

interface Temp{

    public void m1();
}

public class MethodRefq {

    public void m1a(){
        System.out.println("m1 method implememnted");
    }

    public static void m1b(){
        System.out.println("m1 method implememnted");
    }

    public static void main(String[] args) {

        Temp temp = ()-> System.out.println("m1 method implememnted");
        temp.m1();
        System.out.println("===============");
        Temp temp1 = new MethodRefq()::m1a;
        temp1.m1();
        System.out.println("===============");
        Temp temp2 = MethodRefq::m1b;
        temp2.m1();

    }
}
