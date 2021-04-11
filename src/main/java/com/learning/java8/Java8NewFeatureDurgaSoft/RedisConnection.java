package com.learning.java8.Java8NewFeatureDurgaSoft;

import redis.clients.jedis.Jedis;

public class RedisConnection {

    public static void main(String[] args) {

        Jedis jedis = new Jedis("localhost");
        System.out.println("Connection to server sucessfully");
        System.out.println("Server Condition :"+jedis.ping());

    }
}
