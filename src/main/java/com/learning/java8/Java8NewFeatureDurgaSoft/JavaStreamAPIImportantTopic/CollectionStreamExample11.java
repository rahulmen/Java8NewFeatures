package com.learning.java8.Java8NewFeatureDurgaSoft.JavaStreamAPIImportantTopic;

/*
* Program to find Even Number using Java STream API
 */

import java.util.*;
import java.util.stream.Collectors;

class Weather{
    public String city;
    public double temperature;

    public Weather(String city,double temperature) {
        this.temperature = temperature;
        this.city = city;
    }

    public Weather getCity(){
        System.out.println(this.city);
        return this;
    }

    public Weather gettemperature(){
        System.out.println(this.temperature);
        return this;
    }

    public void build(){}
}

public class CollectionStreamExample11 {

    private enum Direction{
      NORTH("1"),
      SOUTH("2"),
      WEST("3"),
      EAST("4");

      private final String value;

      private Direction(String value){
          this.value=value;
      }

      public String getValue(){
          return this.value;
      }

    }

    private static Map<Direction,Weather> weatherTreeMap = new TreeMap<>((d1,d2)->-Integer.valueOf(d1.value).compareTo(Integer.valueOf(d2.value)));

    public static void main(String[] args) {
        populate();
        //Filter those cities where temperature is between 20 to 30 degree
        weatherTreeMap = weatherTreeMap.entrySet().stream().filter(e->e.getValue().temperature<=30 && e.getValue().temperature>20)
                .collect(Collectors.toMap(e->e.getKey(),e->e.getValue()));
        weatherTreeMap.entrySet().forEach(e->e.getValue().getCity().gettemperature().build());
    }

    private static void populate() {
        weatherTreeMap.put(Direction.EAST,new Weather("Gujurat",34.6));
        weatherTreeMap.put(Direction.NORTH,new Weather("Delhi",29.1));
        weatherTreeMap.put(Direction.SOUTH,new Weather("Mumbai",38.6));
        weatherTreeMap.put(Direction.WEST,new Weather("Bengal",39.6));
    }
}
