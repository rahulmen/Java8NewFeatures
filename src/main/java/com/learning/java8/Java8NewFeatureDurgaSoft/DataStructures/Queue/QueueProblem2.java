package com.learning.java8.Java8NewFeatureDurgaSoft.DataStructures.Queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueProblem2 {

    int front,rear,size;
    int [] queue;
    int CAPACITY=10;

    QueueProblem2(){
        this.queue = new int[CAPACITY];
        this.front=0;
        this.rear=0;
        this.size =0;
    }

    QueueProblem2(int capacity){
        this.queue = new int[capacity];
        this.CAPACITY=capacity;
        this.front=0;
        this.rear=0;
        this.size =0;
    }

    public void enQueue(int data) {
     if(size==CAPACITY){
         throw new RuntimeException("Queue is Full");
     }
     size++;
     queue[rear]=data;
     rear = (rear+1)%CAPACITY;
    }

    public int deQueue() {
        if(size==0){
            throw new RuntimeException("Queue is Empty");
        }
        size--;
        int data = queue[front];
        queue[front]=Integer.MIN_VALUE;
        front=(front+1)%CAPACITY;
        return data;
    }

    public boolean isFull(){
        return size==CAPACITY;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public int isQueuedLength(){
        return size;
    }

    public String toString(){
        String s ="[";
        for(int i=0;i<size;i++){
            if(i==size-1){
                s+=queue[i+front];
                break;
            }
            s+=queue[i+front]+",";
        }
        return s+"]";
    }



    public static void main(String[] args) {

        QueueProblem2 queueProblem2 = new QueueProblem2(5);
        System.out.println(queueProblem2.isFull());
        System.out.println(queueProblem2.isEmpty());
        queueProblem2.enQueue(1);
        queueProblem2.enQueue(2);
        System.out.println(queueProblem2.isFull());
        System.out.println(queueProblem2.isEmpty());
        queueProblem2.enQueue(3);
        queueProblem2.enQueue(4);
        queueProblem2.enQueue(5);
        System.out.println(queueProblem2.isFull());
        System.out.println(queueProblem2.isEmpty());
        System.out.println(queueProblem2);
        queueProblem2.deQueue();
        queueProblem2.deQueue();
        System.out.println(queueProblem2.isFull());
        System.out.println(queueProblem2.isEmpty());
        queueProblem2.deQueue();
        queueProblem2.deQueue();
        System.out.println(queueProblem2.isFull());
        System.out.println(queueProblem2.isEmpty());
        queueProblem2.deQueue();
        System.out.println(queueProblem2);

    }

}
