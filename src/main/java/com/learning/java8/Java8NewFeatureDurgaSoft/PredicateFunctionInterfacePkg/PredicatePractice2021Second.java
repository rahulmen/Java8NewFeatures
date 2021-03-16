package com.learning.java8.Java8NewFeatureDurgaSoft.PredicateFunctionInterfacePkg;

import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

enum Type{

    FURNITURE("furniture"),
    ELECTRONICS("electronics"),
    OTHER("other");

    public final String type;

    Type(String type){
        this.type=type;
    }

    public static String getType(Type type){
        for(Type t:Type.values()){
            if(t.type.equals(type.type)){
                return t.type;
            }
        }
        return null;
    }
}

class Investment{

    public  Type type;
    public double amount;

    public Investment(Type type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    static class Builder{
        private Type type;
        private double amount;

        public Type getType() {
            return type;
        }

        public Builder setType(Type type) {
            this.type = type;
            return this;
        }

        public double getAmount() {
            return amount;
        }

        public Builder setAmount(double amount) {
            this.amount = amount;
            return this;
        }

        public Investment build(){
            return new Investment(this.getType(),this.getAmount());
        }
    }
}

public class PredicatePractice2021Second {

    static Map<Type,Investment> map = new TreeMap<>((o1,o2)->{
         if(o1.type.length()<o2.type.length()){
         return -1;
        }else{
             return +1;
         }
    });

    static BiPredicate<Investment,Type> valueCheckpredicate = (i,t)-> i.amount>1000 && i.type.type.equals(t.type);
    static BiPredicate<Investment,Type> nullcheckPredicate = (i,t) -> i.type.type!=null && t.type!=null && !i.type.type.isEmpty();


    public static void main(String[] args) {
        map.put(Type.ELECTRONICS,new Investment.Builder().setType(Type.ELECTRONICS).setAmount(12000).build());
        map.put(Type.FURNITURE,new Investment.Builder().setType(Type.FURNITURE).setAmount(13000).build());
        map.put(Type.OTHER,new Investment.Builder().setType(Type.OTHER).setAmount(5000).build());
        map.put(Type.ELECTRONICS,new Investment.Builder().setType(Type.OTHER).setAmount(5000).build());

        map.entrySet().stream().filter(e->nullcheckPredicate.and(valueCheckpredicate).test(e.getValue(),e.getKey())).forEach(e-> System.out.println(e.getKey().type+","+e.getValue().amount));


    }



}
