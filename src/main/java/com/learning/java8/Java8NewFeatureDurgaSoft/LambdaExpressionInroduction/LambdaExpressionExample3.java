package com.learning.java8.Java8NewFeatureDurgaSoft.LambdaExpressionInroduction;

@FunctionalInterface
interface Interf3{
    String getLongString(String str1,String str2);
}

public class LambdaExpressionExample3 {

    public static void main(String[] args) {

        Interf3 interf3 = (str1,str2)->
        {if(str1.length()>=str2.length()){
            return str1;
        }else{
            return str2;
        }};
        System.out.println(interf3.getLongString("RahulMendiratta","RaviMendiratta"));

    }

}
