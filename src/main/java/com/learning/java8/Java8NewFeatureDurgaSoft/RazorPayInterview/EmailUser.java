package com.learning.java8.Java8NewFeatureDurgaSoft.RazorPayInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmailUser implements User{

    Channel channel;

    public EmailUser(Channel channel) {
        this.channel=channel;
    }

    @Override
    public List<String> getEmail() {
        return new ArrayList(Arrays.asList("test1@gmail.com","test1@gmail.com","test2@gmail.com","test3@outlook.com"));
    }
}
