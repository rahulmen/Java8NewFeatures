package com.learning.java8.Java8NewFeatureDurgaSoft.PredicateFunctionInterfacePkg;

import java.util.TreeMap;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Customer{
    String name;
    int saleAmount;

    public Customer(String name, int saleAmount) {
        this.name = name;
        this.saleAmount = saleAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSaleAmount() {
        return saleAmount;
    }

    public void setSaleAmount(int saleAmount) {
        this.saleAmount = saleAmount;
    }

    static class Builder{
        String name;
        int saleAmount;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getSaleAmount() {
            return saleAmount;
        }

        public Builder setSaleAmount(int saleAmount) {
            this.saleAmount = saleAmount;
            return this;
        }

        public Customer build(){
            return new Customer(this.getName(),this.getSaleAmount());
        }
    }
}

public class Predicatepractice2021 {

    static Predicate<Customer> predicate = c->c.getName().length()>5 && c.saleAmount>100;
    static TreeMap<Customer,Integer> customerData = new TreeMap<>((o1,o2)->{
       Customer customer1 = o1;
       Customer customer2 = o2;
       if(customer1.getName().length()>customer2.getName().length()){
           return +1;
       }else {
           return -1;
       }
    });


    public static void main(String[] args) {

        customerData.put(new Customer.Builder().setName("Rahul").setSaleAmount(100).build(),1);
        customerData.put(new Customer.Builder().setName("Prashant").setSaleAmount(99).setSaleAmount(101).build(),2);
        customerData.put(new Customer.Builder().setName("neeraj").setSaleAmount(101).build(),3);
        customerData.put(new Customer.Builder().setName("Raj").setSaleAmount(102).build(),4);
        customerData.entrySet().stream().filter(c->predicate.test(c.getKey())).forEach(c-> System.out.println(c.getKey().getName()+","+c.getKey().getSaleAmount()));

    }
}
