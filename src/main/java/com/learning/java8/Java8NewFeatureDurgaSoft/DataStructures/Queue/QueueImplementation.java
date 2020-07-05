package com.learning.java8.Java8NewFeatureDurgaSoft.DataStructures.Queue;

public class QueueImplementation {

    int front,rear,size;
    int[] queue;
    int capacity=10;

    QueueImplementation(){
        this.queue=new int[capacity];
        this.front=0;
        this.rear=0;
        this.size=0;
    }

    QueueImplementation(int capacity){
        this.queue = new int[capacity];
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
        int data = queue[front];
        queue[front]=Integer.MIN_VALUE;
        front = (front+1)%capacity;
        return data;
    }

    public int getQueuedsize(){
        return size;
    }

    public boolean isEmpty(){
        return rear==0;
    }

    public boolean isFull(){
        return rear==capacity;
    }

    public String toString(){
        String s ="[";
        for(int i=0;i<size;i++){
            if(i==size-1){
                s+=queue[front+i];
                break;
            }
            s+=queue[front+i]+",";
        }
        return s+"]";
    }


    public static void main(String[] args) {
        QueueImplementation queue = new QueueImplementation();
        queue.enQueue(10);
        System.out.println(queue.deQueue());
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());
        queue.enQueue(5);
        queue.enQueue(6);
        System.out.println(queue.deQueue());
        queue.enQueue(7);
        System.out.println(queue);


    }

}
