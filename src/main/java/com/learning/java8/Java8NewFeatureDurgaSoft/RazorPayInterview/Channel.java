package com.learning.java8.Java8NewFeatureDurgaSoft.RazorPayInterview;

/*
Desin a notification system.
There are multiple channels via which you can send the notifications and there success rate was given.
 */

import java.util.List;
import java.util.Map;

public interface Channel {

    void send(String email);
    void notifyUser(User user);
    void notifyAlluser(List<String> users);
    float successrate();

}
