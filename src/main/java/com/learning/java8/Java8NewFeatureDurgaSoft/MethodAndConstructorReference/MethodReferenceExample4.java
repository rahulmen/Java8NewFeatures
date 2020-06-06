package com.learning.java8.Java8NewFeatureDurgaSoft.MethodAndConstructorReference;

@FunctionalInterface
interface Temp{
    public void getTemperature();
}


public class MethodReferenceExample4 {

    public void getTemperature(){
        System.out.println(10);
    }

    public static void getTemp(){
        System.out.println(10);
    }



    public static void main(String[] args) {

        Temp temp = new MethodReferenceExample4()::getTemperature;
        temp.getTemperature();
        temp = MethodReferenceExample4::getTemp;
        temp.getTemperature();
    }

}
