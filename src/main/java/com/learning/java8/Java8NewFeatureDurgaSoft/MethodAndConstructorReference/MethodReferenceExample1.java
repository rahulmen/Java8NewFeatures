package com.learning.java8.Java8NewFeatureDurgaSoft.MethodAndConstructorReference;

interface interf{

    public void m1(String s);

}

public class MethodReferenceExample1 {

    /*
    The only mandatory thing is that the both abstract method and this method has same argument type.
     */
    private final static String m2(String s){
        System.out.println("M1 method reference implmentation by "+s);
        return "M2 method";
    }

    protected final void m3(String name){
        System.out.println("M1 method reference implmentation by "+name);
    }

    public static void main(String[] args) {

        MethodReferenceExample1 methodReferenceExample1 = new MethodReferenceExample1();
        interf interf = MethodReferenceExample1::m2;
        interf.m1("Rahul");
        interf = methodReferenceExample1::m3;
        interf.m1("Mendiratta");
    }

}
