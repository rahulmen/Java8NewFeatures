package com.learning.java8.Java8NewFeatureDurgaSoft.PredicateFunctionInterfacePkg;

/*
Predicate example to autheticate username and password
 */

import java.util.Scanner;
import java.util.function.Predicate;

class User {
    String userName;
    String passWord;

    public User(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }
}


public class PredicateExample7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter User Name :");
        String userName = scanner.next();
        System.out.println("Enter Password :");
        String password = scanner.next();

        Predicate<User> predicate = o -> o.userName.equalsIgnoreCase("Durga") && o.passWord.equals("soft");

        if (predicate.test(new User(userName, password))) {
            System.out.println("Login Successfull");

        } else {
            System.out.println("Login failed");
        }


    }


}
