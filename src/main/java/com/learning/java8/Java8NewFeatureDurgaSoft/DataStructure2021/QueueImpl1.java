package com.learning.java8.Java8NewFeatureDurgaSoft.DataStructure2021;

public class QueueImpl1 {

    int[] array;
    int capacity=2;
    int size=0,front=0,rear=0;

    QueueImpl1(){
        this.array = new int[this.capacity];
    }

    QueueImpl1(int capacity){
        this.array = new int[capacity];
    }

    public void enQueue(int data){
        if(size==capacity){
            expand();
            //throw new RuntimeException("Queue Overflow Condition");
        }
        size++;
        array[rear%capacity]=data;
        rear++;
    }

    private void expand() {
        int[] newArr = new int[capacity*2];
        for(int i=rear-1;i>=front;i--){
            newArr[i]=array[i];
        }
        capacity=capacity*2;
        array=newArr;
    }

    public int deQueue(){
        if(size==0){
            throw new RuntimeException("Queue is Empty");
        }
        int data = array[front%capacity];
        array[front%capacity]=Integer.MIN_VALUE;
        front++;
        size--;
        return data;
    }

    public int getSize(){
        return this.size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public boolean isFull(){
        return size==capacity;
    }

    @Override
    public String toString(){
        String s = "[";
        for(int i = rear-1;i>front;i--){
            s+=array[i%capacity]+",";
        }
        return s+=array[front]+"]";
    }

    public static void main(String[] args) {

     QueueImpl1 queueImpl1 = new QueueImpl1();
     queueImpl1.enQueue(1);
     queueImpl1.enQueue(2);
     queueImpl1.enQueue(3);
     System.out.println(queueImpl1);
     System.out.println(queueImpl1.deQueue());
     System.out.println(queueImpl1);
     System.out.println(queueImpl1.isEmpty());
     System.out.println(queueImpl1.isFull());
     System.out.println(queueImpl1.deQueue());
     System.out.println(queueImpl1.deQueue());
     System.out.println(queueImpl1.isEmpty());
     System.out.println(queueImpl1.isFull());





    }

}
