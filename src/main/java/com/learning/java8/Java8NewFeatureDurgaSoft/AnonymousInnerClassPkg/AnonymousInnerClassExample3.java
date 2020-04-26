package com.learning.java8.Java8NewFeatureDurgaSoft.AnonymousInnerClassPkg;

@FunctionalInterface
interface Test {
    void m1();
}

public class AnonymousInnerClassExample3 {
    int x = 888;

    public void m2() {
        int y = 10;
        Test test = () -> {
            int x = 999;
            System.out.println(x);
            //Variable used in lambda expression should be final or effectively final
            //y=0100
            System.out.println(y);
            System.out.println(AnonymousInnerClassExample3.this.x);
        };
        test.m1();
    }

    public static void main(String[] args) {
        AnonymousInnerClassExample3 anonymousInnerClassExample3 = new AnonymousInnerClassExample3();
        anonymousInnerClassExample3.m2();
    }


}
