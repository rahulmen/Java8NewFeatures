package com.learning.java8.Java8NewFeatureDurgaSoft.RazorPayInterview;

import java.util.List;

public class Gmail implements Channel{

    @Override
    public void send(String email) {
        System.out.println("Gmail Mail Send :"+email);
    }

    @Override
    public void notifyUser(User user) {
        System.out.println("Mail Send to Gmail User:"+user.getEmail());
    }

    @Override
    public void notifyAlluser(List<String> users) {
        System.out.println("Mail Send to List of Users :");
        for(String s:users){
            System.out.println(s);
        }
    }

    @Override
    public float successrate() {
        return (float)Math.random();
    }

}
