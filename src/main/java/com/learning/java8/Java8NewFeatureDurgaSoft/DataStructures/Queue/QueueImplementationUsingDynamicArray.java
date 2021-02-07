package com.learning.java8.Java8NewFeatureDurgaSoft.DataStructures.Queue;

public class QueueImplementationUsingDynamicArray {

    private int[] queue;
    private static int capacity=16;
    int size,front,rear;

    private QueueImplementationUsingDynamicArray(){
        queue = new int[this.capacity];
        this.front=0;this.rear=0;this.size=0;
    }

    private QueueImplementationUsingDynamicArray(int capacity){
        this.capacity=capacity;
        queue = new int[this.capacity];
        this.front=0;this.rear=0;this.size=0;
    }

    public void enQueue(int data){
        expand();
        size++;
        queue[rear%capacity]=data;
        this.rear=(this.rear+1)%capacity;

    }

    public int deQueue(){
        if(size==0){
            throw new RuntimeException("Queue Underflow");
        }
        size--;
        int data = queue[front%capacity];
        queue[front%capacity]=Integer.MIN_VALUE;
        front = (front+1)%capacity;
        return data;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public boolean isFull(){
        return size==capacity;
    }

    public int size(){
        return size;
    }

    public void expand(){
        if(size<capacity){
            return;
        }else{
            int[] temp = new int[2*capacity];
            for(int i=0;i<size;i++){
                temp[i]=queue[front+i];
            }
            queue=temp;
            rear = size;
            capacity=2*capacity;
        }

    }

    public String printQueue(){
        String s = "[";

        for(int i=0;i<size;i++){
            s+=queue[front+i];
            if(i<size-1){
                s+=",";
            }
        }
        return s+"]";
    }

    public static void main(String[] args) {
        QueueImplementationUsingDynamicArray queueImplementationUsingDynamicArray = new QueueImplementationUsingDynamicArray(3);
        queueImplementationUsingDynamicArray.enQueue(1);
        System.out.println(queueImplementationUsingDynamicArray.printQueue());
        queueImplementationUsingDynamicArray.enQueue(2);
        System.out.println(queueImplementationUsingDynamicArray.printQueue());
        queueImplementationUsingDynamicArray.enQueue(3);
        System.out.println(queueImplementationUsingDynamicArray.printQueue());
        queueImplementationUsingDynamicArray.enQueue(4);
        System.out.println(queueImplementationUsingDynamicArray.printQueue());
        queueImplementationUsingDynamicArray.enQueue(5);
        System.out.println(queueImplementationUsingDynamicArray.printQueue());
        System.out.println(queueImplementationUsingDynamicArray.size());
        int data = queueImplementationUsingDynamicArray.deQueue();
        System.out.println("Data DeQueue : "+data);
        System.out.println(queueImplementationUsingDynamicArray.printQueue());
        System.out.println(queueImplementationUsingDynamicArray.size());
    }


}
