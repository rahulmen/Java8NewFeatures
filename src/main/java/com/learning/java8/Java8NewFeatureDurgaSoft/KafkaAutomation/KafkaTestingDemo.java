package com.learning.java8.Java8NewFeatureDurgaSoft.KafkaAutomation;

import org.apache.kafka.clients.producer.MockProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.testng.Assert;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class KafkaTestingDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        String topic = "myTopic";

        MockProducer mockProducer = new MockProducer(true,null,null,null);
        ProducerRecord<byte[],byte[]> record = new ProducerRecord<byte[],byte[]>(topic,"key".getBytes(),"value".getBytes());
        Future<RecordMetadata> recordMetadataFuture = mockProducer.send(record);
        Assert.assertTrue(recordMetadataFuture.isDone(),"Send should be immediately Completed ");
        Assert.assertTrue(recordMetadataFuture.get().offset()==0,"Check Offset should be 0");
        Assert.assertEquals(topic,recordMetadataFuture.get().topic(),"Verify Topic");
    }
}
