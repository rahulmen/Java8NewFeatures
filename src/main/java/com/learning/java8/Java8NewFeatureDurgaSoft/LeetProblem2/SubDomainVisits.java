package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubDomainVisits {


    public List<String> subdomainVisits(String[] cpdomains) {

        Map<String,Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();

        for(String s :cpdomains) {
            Integer count = Integer.valueOf(s.split(" ")[0]);
            String domain = s.split(" ")[1];

            String[] domain1 = domain.split("\\.");

            for (int j = 0; j < domain1.length; j++) {
                StringBuilder stringBuilder = new StringBuilder();
                for (int i = j; i < domain1.length; i++) {
                    if (i != domain1.length - 1) {
                        stringBuilder.append(domain1[i] + ".");
                    } else {
                        stringBuilder.append(domain1[i]);
                    }
                }
                map.put(stringBuilder.toString(),map.getOrDefault(stringBuilder.toString(),0)+count);
            }
        }

        for(Map.Entry<String,Integer> e:map.entrySet()){
            list.add(e.getValue()+" "+e.getKey());
        }
        return list;
    }


    public static void main(String[] args) {

        System.out.println(new SubDomainVisits().subdomainVisits(new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"}));



    }
}
