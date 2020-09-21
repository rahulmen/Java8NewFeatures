package com.learning.java8.Java8NewFeatureDurgaSoft.SecuronixInterview.Utils;

/*
get me all the possible substrings of String s = "Silam";

S Si Sil Sila Silam i il ila ilam l la lam a am m

 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PossibleSubstring {

    public Set<String> getPossibleSubstring(String s){
       Set<String> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                set.add(s.substring(i,j));
            }
        }
        return set;
    }

    public static void main(String[] args) {
        System.out.println(new PossibleSubstring().getPossibleSubstring("Silam"));
    }

    /*
    Sql query to find employees who earn more than Manager
    Sql query to find an employee whose salary is the second highest
    */

    /*
    empID,empName,Salary,managerId
    select empName from employees where salary > (select salary from employees where empId=managerId);
    */

}
