package com.learning.java8.Java8NewFeatureDurgaSoft.Java8Iteration;

public interface Interface1 {

    public abstract String language();
    int originatedIn();

    default String benefit(){
        return "Learning Coding will make you earn";
    }

    static String prerequisite(){
        return "Basic Math Operation are needed";
    }

}
