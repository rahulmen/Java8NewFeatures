package com.learning.java8.Java8NewFeatureDurgaSoft.MethodAndConstructorReference;

@FunctionalInterface
interface interf2{

    public abstract String getInterfaceName(Object o);

}

@FunctionalInterface
interface interf3{

    MethodReferenceExample3 getObject();
}


public class MethodReferenceExample3 {

    MethodReferenceExample3(){
        System.out.println(this.getClass().getName()+" Object Created");
    }

    public static String getInterfaceName(Object o){
        return interf2.class.getName();
    }

    public String getthisClassName(Object o){
        return o.getClass().getName();
    }


    public static void main(String[] args) {

        interf3 interf3=MethodReferenceExample3::new;

        interf2 interf2 = MethodReferenceExample3::getInterfaceName;
        System.out.println(interf2.getInterfaceName(null));

        interf2 = interf3.getObject()::getthisClassName;
        System.out.println(interf2.getInterfaceName(interf2));

    }
}
