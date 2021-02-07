package com.learning.java8.Java8NewFeatureDurgaSoft.GojekTestPractice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class TestClass{

    /*
     String s1 = "{\n" +
                "data: {\n" +
                "id: 3,\n" +
                "email: \"emma.wong@reqres.in\",\n" +
                "first_name: \"Emma\",\n" +
                "last_name: \"Wong\",\n" +
                "avatar: \"https://s3.amazonaws.com/uifaces/faces/twitter/olegpogodaev/128.jpg\"\n" +
                "},\n" +
                "ad: {\n" +
                "company: \"StatusCode Weekly\",\n" +
                "url: \"http://statuscode.org/\",\n" +
                "text: \"A weekly newsletter focusing on software development, infrastructure, the server, performance, and the stack end of things.\"\n" +
                "}\n" +
                "}";

        String s2 = "{\n" +
                "data: {\n" +
                "id: 2,\n" +
                "email: \"janet.weaver@reqres.in\",\n" +
                "first_name: \"Janet\",\n" +
                "last_name: \"Weaver\",\n" +
                "avatar: \"https://s3.amazonaws.com/uifaces/faces/twitter/josephstein/128.jpg\"\n" +
                "},\n" +
                "ad: {\n" +
                "company: \"StatusCode Weekly\",\n" +
                "url: \"http://statuscode.org/\",\n" +
                "text: \"A weekly newsletter focusing on software development, infrastructure, the server, performance, and the stack end of things.\"\n" +
                "}\n" +
                "}";
     */

    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>(new MyComparator());
        set.add("djeRah");
        set.add("RahMen");
    }
}
