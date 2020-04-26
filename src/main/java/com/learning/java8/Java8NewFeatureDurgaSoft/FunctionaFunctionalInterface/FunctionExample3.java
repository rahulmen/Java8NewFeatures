package com.learning.java8.Java8NewFeatureDurgaSoft.FunctionaFunctionalInterface;

/*
Program to remove null and number less than 1 from collection
 */

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionExample3 {

    private static List<Integer> collection = new ArrayList<>(Arrays.asList(1,2,4,5,null,-3,6789,-22));

    public static void main(String[] args) {

       /* Function<Collection,Collection>  collectionCollectionFunction = i->{
           Collection collection = new ArrayList<>();
            Iterator<Integer> integerIterator = i.iterator();
            while(integerIterator.hasNext()){
                Integer integer = integerIterator.next();
                if(integer!=null && integer>0){
                    collection.add(integer);
                }
            }
            return collection;
        };*/

        Predicate<Integer> predicate = p->p!=null && p>0;
        List<Integer> list = new ArrayList<>();
        Function<List<Integer>,List<Integer>>  collectionCollectionFunction = i->{
            for(int x=0;x<i.size();x++){
                if(predicate.test(i.get(x))){
                    list.add(i.get(x));
                }
            }

            return list;
        };



        System.out.println(collectionCollectionFunction.apply(collection));
    }
}
