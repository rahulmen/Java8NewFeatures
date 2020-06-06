package com.learning.java8.Java8NewFeatureDurgaSoft.MethodAndConstructorReference;


interface vehicle{

    Car setDetails();

}

class Car{

    String name;
    String model;

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Car(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public Car() {
        this("Audi","A10");
    }

    @Override
    public String toString(){
      return this.model+" "+this.name;
    }
}


public class ConstructorReferenceExample2 {


    public static void main(String[] args) {
        vehicle vehicle = Car::new;
        System.out.println(vehicle.setDetails());

    }
}
