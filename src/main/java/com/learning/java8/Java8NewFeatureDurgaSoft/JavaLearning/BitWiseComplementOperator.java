package com.learning.java8.Java8NewFeatureDurgaSoft.JavaLearning;


/*
BitWiseComplementOperator
=========================

1.We can apply this operator only for integral types but not for boolean type.
If we are trying to apply for boolean type then we will get compile time error.
Example :-
System.out.println(~true);
CE :- operator ~ cannot be applied to boolean

2. System.out.println(~4);

output :- -5

Explanation :-
4 in 32 bits:-
00000000000000000000000000000100
~4 in 32 bits
11111111111111111111111111111011 where first 1 represent negative number
Every negative number is represent in 2s compliment and to find 2s compliment first we need
to find 1s compliment

1s compliment for 1111111111111111111111111111011 is 0000000000000000000000000000100

2s compliment for 0000000000000000000000000000100 is

(1)0000000000000000000000000000100
                                +1
==================================
(1)0000000000000000000000000000101  //which is -5
==================================

Note :- The most significant bit act as sign bit 0 means positive number and 1 means negative number.


 */

public class BitWiseComplementOperator {

    public static void main(String[] args) {
        System.out.println(~4);
        System.out.println(7&1);
    }
}
