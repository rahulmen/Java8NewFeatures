package com.learning.java8.Java8NewFeatureDurgaSoft.RazorPayInterview;

public class Test {

    public static void main(String[] args) {
        Channel channel1 = new Gmail();
        Channel channel2 = new OutLook();
        User emailUser = null;
        float successRate1 = channel1.successrate();
        float successRate2 = channel2.successrate();
        System.out.println(successRate1);
        System.out.println(successRate2);
        if(successRate1>successRate2){
            emailUser = new EmailUser(channel1);
            channel1.notifyAlluser(emailUser.getEmail());
        }else{
            emailUser = new EmailUser(channel2);
            channel2.notifyAlluser(emailUser.getEmail());
        }
    }
}
