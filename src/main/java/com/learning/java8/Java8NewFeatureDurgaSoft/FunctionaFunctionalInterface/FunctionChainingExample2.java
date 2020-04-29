package com.learning.java8.Java8NewFeatureDurgaSoft.FunctionaFunctionalInterface;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.function.Function;

class User{
           String userName;
           String password;

           public User(String userName, String password) {
               this.userName = userName;
               this.password = password;
           }
       }

public class FunctionChainingExample2 {

    public static void main(String[] args) {

        User user = new User("durga","SoftSolution");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter UserName :");
        String userName = scanner.next();
        System.out.println("Enter Password :");
        String password = scanner.next();

        Function<String,String> stringStringFunction = s->userName.substring(0,5);
        Function<String,String> stringStringFunction1 = s->userName.toLowerCase();

        if(stringStringFunction.andThen(stringStringFunction1).apply(userName).equals(user.userName) && password.equals(user.password)){
            System.out.println("Valid Credential");
        }else{
            System.out.println("Invalid Credential");
        }

    }

}
