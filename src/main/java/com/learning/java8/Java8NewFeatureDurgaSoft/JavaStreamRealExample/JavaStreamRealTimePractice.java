package com.learning.java8.Java8NewFeatureDurgaSoft.JavaStreamRealExample;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;

public class JavaStreamRealTimePractice {

    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();
        map.put("x-atv-did","4d7a3e516093b4c8|Phone|Android|28|12633|1.27.0");
        map.put("content-type","application/json");
        map.put("x-atv-utkn","eS-8k14AJ6RjnJzPh0:Ag0BiqyIjEER+/6zWdswAcrpwPw=");
        map.put("x-atv-segment","ATVPLUS");

        Map<String,String> map1 = new HashMap<>();
        map1.put("dt","phone");
        map1.put("ln","pa");
        map1.put("isDth","true");
        map1.put("mwTvPack","200292");
        map1.put("os","ANDROID");
        map1.put("offSet","0");
        map1.put("contentId","MWTV_LIVETVSHOW_692_30000000550709040");
        map1.put("count","30");
        map1.put("rsflow_usertype","1");
        map1.put("dth","true");
        map1.put("bn","12633");
        map1.put("appId","MOBILITY");
/*requestSpecBuilder.addQueryParams(map1);
        ResponseSpecBuilder responseSpecBuilder = new ResponseSpecBuilder();
        responseSpecBuilder.expectStatusCode(200);*/


        Response response = given().queryParams(map1).and().headers(map).when().get("https://search.airtel.tv/app/v3/search/atv/related");

        HashMap<String,Object> map2 = response.jsonPath().get(".");

      /*  List<Object> listList = (List<Object>)map2.entrySet().stream().filter(e->e.getKey().equals("categories")).
                map(e->e.getValue()).collect(Collectors.toList());
        LinkedHashMap<String,Object> linkedHashMap = (LinkedHashMap) ((ArrayList) listList.get(0)).get(0);
        List<LinkedHashMap<String,Object>> linkedHashMapList = (List<LinkedHashMap<String, Object>>) linkedHashMap.entrySet().stream().
                filter(e->e.getKey().equals("contentResponseList")).map(e->e.getValue()).collect(Collectors.toList()).get(0);*/


        ArrayList<HashMap<String,Object>> arrayList =
                (ArrayList<HashMap<String, Object>>) map2.entrySet().stream().filter(e->e.getKey().equals("categories"))
                        .collect(Collectors.toList()).get(0).getValue();

        map2.entrySet().stream().map(e->{
            if(e.getKey().equals("totalResults")){
                Assert.assertTrue(e.getValue().equals(30));
                return true;
            }
            return false;
        }).collect(Collectors.toList()).stream().filter(e->e.booleanValue()==false).count();




/*List<LinkedHashMap<String,Object>> linkedHashMapList = map2.entrySet().stream().filter(e->e.getKey().equals("categories")).
                map(e->e.getValue()).collect(Collectors.toList()).get(0);*/

        //LinkedHashMap<String,Object> linkedHashMap  =  l.get(0);


        System.out.println();










    }
}
