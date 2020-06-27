package com.learning.java8.Java8NewFeatureDurgaSoft.LambdaExpressionInroduction;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.Iterator;

public class MongoAccess {


    public static void main(String[] args) {

        MongoClient mongoClient = new MongoClient("10.50.0.27",27017);
        MongoCredential mongoCredential = MongoCredential.createCredential("adminuser","atv_arsenal","mongo@098".toCharArray());
        System.out.println("Connected to the database successfully");
        MongoDatabase database = mongoClient.getDatabase("atv_arsenal");
        System.out.println("Credentials ::"+ mongoCredential);
        MongoCollection<Document> mongoCollection = database.getCollection("packages");
        System.out.println("Collection myCollection selected successfully");
        FindIterable<Document> iterable = mongoCollection.find();

        Iterator iterator = iterable.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }




    }
}
