package com.learning.java8.Java8NewFeatureDurgaSoft.JavaStreamRealExample;

import io.restassured.response.Response;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;

public class JavaStreamAutoSuggestionExample1 {


    public static void main(String[] args) {


        Map<String,String> map = new HashMap<>();
        map.put("x-atv-did","4d7a3e516093b4c8|Phone|Android|28|12633|1.27.0");
        map.put("content-type","application/json");
        map.put("x-atv-utkn","eS-8k14AJ6RjnJzPh0:Ag0BiqyIjEER+/6zWdswAcrpwPw=");
        map.put("x-atv-segment","ATVPLUS");

        Map<String,String> map1 = new HashMap<>();
        map1.put("ln","hi");
        map1.put("os","WEBOS");
        map1.put("dt","BROWSER");
        map1.put("os","ANDROID");
        map1.put("appId","WEB");
        map1.put("q","Zee");
        map1.put("autosuggest_max_limit","10");

        Response response = given().queryParams(map1).and().headers(map).when().get("https://search.airtel.tv/app/v3/search/autoSuggestion");

        HashMap<String,Object> hashMap = response.jsonPath().get();

        Assert.assertEquals(hashMap.entrySet().stream().filter(e->e.getKey().equals("suggestQuery")).
                map(e->e.getValue().equals("Zee")).count(),1,"suggestQuery is as per Expected");

       Assert.assertEquals(hashMap.entrySet().stream().filter(e->e.getKey().equals("noOfResults"))
               .map(e->e.getValue().equals(10)).count(),1,"Check only 10 Suggestion list");

        /*List<List<HashMap<String,String>>>  cpData = hashMap.entrySet().stream().map(m->((ArrayList<HashMap<String,String>>)m.getVa0lue().get("content"))
                .stream().filter(m1->m1.containsKey("cpId")).filter(m2->m2.get("cpId").equals(cp))
                .filter(m2->m2.containsKey("status")).filter(m2->m2.get("status").equals("Active"))
                .collect(Collectors.toList())).collect(Collectors.toList())
                .stream().filter(m->m.size()>1).collect(Collectors.toList());*/


       List<List<HashMap<String,String>>> listList = hashMap.entrySet().stream().filter(e->e.getKey().equals("autoSuggestTitles")).map(e->((ArrayList<HashMap<String,String>>)e.getValue())
                .stream().filter(e1->e1.containsKey("title")).filter(e2->e2.get("title").contains("Zee")).collect(Collectors.toList())).collect(Collectors.toList());

       Assert.assertTrue(listList.get(0).size()==10);


    }
}
