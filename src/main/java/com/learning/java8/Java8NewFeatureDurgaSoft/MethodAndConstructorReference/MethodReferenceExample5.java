package com.learning.java8.Java8NewFeatureDurgaSoft.MethodAndConstructorReference;

interface Local1{
    void message();
}

public class MethodReferenceExample5 {

    public static void getMsgUsingStatic(){
        System.out.println("I am a alternative for Lamdba Expression !!\nGuess My Name?\nHell!! Yes Instance Method Reference");
    }

    public void getMsgUsingInstance(){
        System.out.println("I am a alternative for Lamdba Expression !!\nGuess My Name?\nHell!! Yes Static Method Reference");
    }

    public static void main(String[] args) {

        Local1 local1 = new MethodReferenceExample5()::getMsgUsingInstance;
        Local1 local2 = MethodReferenceExample5::getMsgUsingStatic;
        local1.message();
        System.out.println();
        local2.message();
    }

}
