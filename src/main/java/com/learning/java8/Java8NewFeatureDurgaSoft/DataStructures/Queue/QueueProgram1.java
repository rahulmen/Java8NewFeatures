package com.learning.java8.Java8NewFeatureDurgaSoft.DataStructures.Queue;

public class QueueProgram1 {

    int capacity=10;
    int front,rear,size;
    int[] queue;

    QueueProgram1(){
        queue = new int[capacity];
        this.front=0;
        this.rear=0;
        this.size=0;
    }

    QueueProgram1(int capacity){
        queue = new int[capacity];
        this.front=0;
        this.rear=0;
        this.size=0;
    }

    public void enQueue(int data){
        if(size==capacity){
            throw new RuntimeException("Queue is full");
        }
        size++;
        queue[rear]=data;
        rear=(rear+1)%capacity;
    }

    public int deQueue(){
        if(size==0){
            throw new RuntimeException("Queue is Empty");
        }
        size--;
        int temp = queue[front];
        queue[front]=Integer.MIN_VALUE;
        front = (front+1)%capacity;
        return temp;
    }

    public boolean isFull(){
        return size==capacity;
    }

    public  boolean isEmpty(){
        return size==0;
    }

    public String toString(){
        String s = "[";

        for (int i=0;i<size;i++){
            if(i==size-1){
                s+=queue[front+i];
                break;
            }
            s+=queue[front+i]+",";
        }

        return s+"]";
    }

    public static void main(String[] args) {

        QueueProgram1 queueProgram1 = new QueueProgram1(7);
        System.out.println(queueProgram1.isEmpty());
        System.out.println(queueProgram1.isFull());
        queueProgram1.enQueue(20);
        queueProgram1.enQueue(30);
        System.out.println(queueProgram1);
        queueProgram1.deQueue();
        queueProgram1.enQueue(40);
        System.out.println(queueProgram1);
    }
}
