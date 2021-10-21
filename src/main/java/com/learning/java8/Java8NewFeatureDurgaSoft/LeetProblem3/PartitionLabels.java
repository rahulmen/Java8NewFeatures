package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem3;


import com.google.gson.Gson;

import java.util.*;

public class PartitionLabels {

    class GetAdd{
        String requestid;
        String status;
        ad ads;

        class ad {
            String status;
            String ad;
            String imageheight;
            String imagewidth;
            String adsSpotSize;
            String adsSpotFormat;
            }
    }

    public List<Integer> partitionLabels(String s) {

        List<Integer> output = new ArrayList<>();

        List<String> temp = new ArrayList<>();

        char[] ch1 = s.toCharArray();

        for(char ch:ch1){
            boolean match = false;
            if(temp.size()==0){
                temp.add(ch+"");
            }else{
                for(int i=0;i<temp.size();i++){
                    if(temp.get(i)!=null && temp.get(i).contains(ch+"")){
                        if(match==false){
                            match=true;
                        }
                        StringBuilder str = new StringBuilder();
                        for(int j = i;j<temp.size();j++){
                            if(temp.get(j)!=null) {
                                str.append(temp.get(j));
                            }
                            temp.set(j,null);
                        }
                        str.append(ch+"");
                        temp.set(i,str.toString());
                    }
                }
                if(match==false){
                    temp.add(ch+"");
                }
            }
        }

        for(int i=0;i<temp.size();i++){
            if(temp.get(i)!=null) {
                output.add(temp.get(i).length());
            }
        }

        return output;
    }


    public static void main(String[] args) {
        //System.out.println(new PartitionLabels().partitionLabels("ababcdcefd"));
        Gson gson = new Gson();

        String s = "{\n" +
                "  \"status\": \"000\",\n" +
                "  \"ad\": {\n" +
                "        \"status\": \"001\",\n" +
                "        \"ad\": \"\",\n" +
                "        \"adparams\": {\n" +
                "          \"campaignid\": null,\n" +
                "          \"request-id\": \"09f6530d__0bfce142_[ccb]\",\n" +
                "          \"delay\": 0,\n" +
                "          \"ad-id\": null,\n" +
                "          \"eventurl\": \"http://media.vmax.com/e.gif?trnid=199189__0bfce142&event=[EVENTID]&a1=[a1]&a2=[a2]&a3=[a3]&vr=A-API-4.0.0&onlylog=1\"\n" +
                "        },\n" +
                "        \"type\": 8,\n" +
                "        \"adInfo\": {\n" +
                "          \"order\": {\n" +
                "            \"id\": \"\",\n" +
                "            \"name\": \"\"\n" +
                "          },\n" +
                "          \"advertiser\": {\n" +
                "            \"id\": \"\",\n" +
                "            \"marketer\": \"\",\n" +
                "            \"brand\": \"\",\n" +
                "            \"agency\": \"\"\n" +
                "          },\n" +
                "          \"campaign\": {\n" +
                "            \"id\": \"\",\n" +
                "            \"name\": \"\"\n" +
                "          },\n" +
                "          \"ad\": {\n" +
                "            \"id\": \"\",\n" +
                "            \"name\": \"\"\n" +
                "          },\n" +
                "          \"adparams\": null\n" +
                "        },\n" +
                "        \"imageheight\": \"20\",\n" +
                "        \"imagewidth\": \"120\",\n" +
                "        \"adspotsize\": \"banner\",\n" +
                "        \"adspotformat\": null\n" +
                "      },\n" +
                "  \"requestid\": \"199189_0_0bfce142_[ccb]\"\n" +
                "}";

        List<GetAdd> list = Arrays.asList(gson.fromJson(s,GetAdd.class));

        System.out.println(list);

   }



}
