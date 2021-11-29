package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem2;

import java.util.*;

public class Suplicates {

        public List<List<String>> accountsMerge(List<List<String>> accounts) {

            List<List<String>> output = new ArrayList<>();
            //Set<String> names = new HashSet<>();

            boolean common= true;
            while(common == true) {
                l1:
                for (int i = 0; i < accounts.size(); i++) {

                    if (accounts.get(i).get(accounts.get(i).size() - 1).equals("Duplicate")) {
                        continue l1;
                    }

                    List<String> temp = new ArrayList<>();
                    TreeSet<String> names = new TreeSet<>();

                    l2:
                    for (int j = i; j < accounts.size(); j++) {
                        if (i == j) {
                            continue l2;
                        } else if (!accounts.get(i).get(0).equals(accounts.get(j).get(0))) {
                            continue l2;
                        } else if (accounts.get(j).get(accounts.get(j).size() - 1).equals("Duplicate")) {
                            continue l2;
                        } else {
                            boolean isSamePerson = false;
                            int counter = 0;
                            if (accounts.get(i).get(0).equals(accounts.get(j).get(0)))
                                isSamePerson = true;
//                        boolean isSamePerson = false;
//                        for(String s:accounts.get(j)){
//                            if(counter==0)counter++;
//                            else if(accounts.get(i).contains(s)){
//                                isSamePerson=true;
//                                break;
//                            }
                            if (isSamePerson == true) {
                                counter = 0;
                                for (String s : accounts.get(j)) {
                                    if (counter == 0) counter++;
                                    else if (!accounts.get(i).contains(s)) {
                                        names.add(s);
                                    }
                                }
                                accounts.get(j).add("Duplicate");
                            }
                        }
                    }
                    int counter = 0;
                    for (String s : accounts.get(i)) {
                        if (counter == 0) {
                            counter++;
                            temp.add(s);
                        } else {
                            names.add(s);
                        }
                    }
                    temp.addAll(names);
                    output.add(temp);
                }
            }
            return output;

        }

    public static void main(String[] args) {

         List<List<String>> temp = new ArrayList<>();

         temp.add(new ArrayList<>(Arrays.asList("David","David0@m.co","David1@m.co")));
        temp.add(new ArrayList<>(Arrays.asList("David","David3@m.co","David4@m.co")));
        temp.add(new ArrayList<>(Arrays.asList("David","David4@m.co","David5@m.co")));
        temp.add(new ArrayList<>(Arrays.asList("David","David2@m.co","David3@m.co")));
        temp.add(new ArrayList<>(Arrays.asList("David","David1@m.co","David2@m.co")));

        System.out.println(new Suplicates().accountsMerge(temp));
    }
}
