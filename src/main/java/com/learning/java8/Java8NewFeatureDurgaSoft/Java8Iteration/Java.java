package com.learning.java8.Java8NewFeatureDurgaSoft.Java8Iteration;

public class Java implements Interface1,Interface2{

    @Override
    public String language() {
        return "Java";
    }

    @Override
    public int originatedIn() {
        return 1978;
    }

//    @Override
//    public String benefit() {
//        return "Benifits are :"+Interface1.super.benefit()+","+Interface2.super.benefit();
//    }

    public static void main(String[] args) {

        Interface1 java = new Java();
        System.out.println(Interface1.prerequisite()+","+Interface2.prerequisite());
        System.out.println(java.language()+","+java.originatedIn()+","+java.benefit());

    }


}
