package com.learning.java8.Java8NewFeatureDurgaSoft.ConsumerFuctionalInterface;

import java.util.ArrayList;
import java.util.function.Consumer;

class Movie{
    String movieName;
    String actor;
    String actress;

    public Movie(String movieName, String actor, String actress) {
        this.movieName = movieName;
        this.actor = actor;
        this.actress = actress;
    }
}

public class ComsumerExample1 {

    private static ArrayList<Movie> arrayList = new ArrayList<>();

    public static void main(String[] args) {

        populate();

        Consumer<Movie> consumer = c->{
            System.out.println("Movie :"+c.movieName);
            System.out.println("Actor :"+c.actor);
            System.out.println("Actress :"+c.actress);
            System.out.println();
        };

        for(Movie m:arrayList){
            consumer.accept(m);
        }
    }

    private static void populate() {
        arrayList.add(new Movie("Simba1","Ranbir1","Katrina1"));
        arrayList.add(new Movie("Simba2","Ranbir2","Katrina2"));
        arrayList.add(new Movie("Simba3","Ranbir3","Katrina3"));
    }

}
