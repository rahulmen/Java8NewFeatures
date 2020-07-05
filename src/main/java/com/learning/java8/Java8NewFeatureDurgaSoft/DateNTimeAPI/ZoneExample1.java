package com.learning.java8.Java8NewFeatureDurgaSoft.DateNTimeAPI;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneExample1 {


    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        ZoneId zoneId1 = ZoneId.of("America/Los_Angeles");
        ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId1);
        System.out.println(zonedDateTime);

    }
}
