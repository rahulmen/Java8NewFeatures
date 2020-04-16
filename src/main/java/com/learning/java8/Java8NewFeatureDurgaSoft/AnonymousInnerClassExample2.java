package com.learning.java8.Java8NewFeatureDurgaSoft;

@FunctionalInterface
interface interf {
    public static int x = 999;
    public void m1();
}


public class AnonymousInnerClassExample2 {


    public void m2() {
        interf i = new interf() {
            int x = 888;

            @Override
            public void m1() {
                System.out.println(this.x);
                System.out.println(interf.x);
            }
        };

        interf i2 = ()->{
            int x= 100;
            System.out.println(x);
            System.out.println(interf.x);
        };

        i.m1();
        i2.m1();
    }

    public static void main(String[] args) {

        AnonymousInnerClassExample2 anonymousInnerClassExample2 = new AnonymousInnerClassExample2();
        anonymousInnerClassExample2.m2();

    }

}
