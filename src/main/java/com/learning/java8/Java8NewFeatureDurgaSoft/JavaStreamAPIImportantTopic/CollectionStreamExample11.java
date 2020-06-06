package com.learning.java8.Java8NewFeatureDurgaSoft.JavaStreamAPIImportantTopic;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

class WeatherReport{

    private int temperature;
    private double wind;
    private String windDirection;
    private int humidity;

    public WeatherReport(int temperature, double wind, String windDirection, int humidity) {
        this.temperature = temperature;
        this.wind = wind;
        this.windDirection = windDirection;
        this.humidity = humidity;
    }

    public int getTemperature() {
        return temperature;
    }

    public double getWind() {
        return wind;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public int getHumidity() {
        return humidity;
    }
}

public class CollectionStreamExample11 {

    private static HashMap<String,WeatherReport> weatherReportArrayList = new HashMap<>();


    public static void main(String[] args) {
        populate();
        weatherReportArrayList.entrySet().stream().filter(e->e.getValue().getTemperature()<30 && 10<e.getValue().getHumidity() && e.getValue().getHumidity()<15).collect(Collectors.toList()).stream().
                forEach(e-> System.out.println(e.getKey()+" "+e.getValue().getTemperature()+" "+
                        e.getValue().getWindDirection()+" "+e.getValue().getHumidity()+" "+e.getValue().getWind()));
    }

    private static void populate() {
        weatherReportArrayList.put("Faridabad",new WeatherReport(38,20.5,"North",24));
        weatherReportArrayList.put("Delhi",new WeatherReport(37,21.6,"South",27));
        weatherReportArrayList.put("Pune",new WeatherReport(23,45,"West",12));
    }

}
