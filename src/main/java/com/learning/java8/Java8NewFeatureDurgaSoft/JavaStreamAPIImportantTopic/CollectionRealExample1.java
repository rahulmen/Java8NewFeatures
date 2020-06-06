package com.learning.java8.Java8NewFeatureDurgaSoft.JavaStreamAPIImportantTopic;


import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.SSLConfig;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CollectionRealExample1 {

    public static void main(String[] args) {
        Map<String, String> headers = new HashMap<>();
        headers.put("Accept", "application/json, text/plain, */*");
        headers.put("x-atv-segment","ATVPLUS");
        Map<String, String> queryParams = new LinkedHashMap<>();
        queryParams.put("q", "SONY");
        queryParams.put("appId", "");

    }

}
