package com.learning.java8.Java8NewFeatureDurgaSoft.DataStructures.Queue;

import java.util.Stack;

public class QueueImplementationUsingStack {

    private Stack<Integer> a = new Stack<>();
    private Stack<Integer> b = new Stack<>();

    public void enQueue(int data){
        a.push(data);
    }

    public int deQueue(){
        if(b.isEmpty()) {
            while (!a.isEmpty()) {
                b.push(a.pop());
            }
        }
        return b.pop();
    }


    public static void main(String[] args) {
        QueueImplementationUsingStack queueImplementationUsingStack = new QueueImplementationUsingStack();
        queueImplementationUsingStack.enQueue(1);
        queueImplementationUsingStack.enQueue(2);
        queueImplementationUsingStack.enQueue(3);
        System.out.println(queueImplementationUsingStack.deQueue());
        queueImplementationUsingStack.enQueue(4);
        System.out.println(queueImplementationUsingStack.deQueue());
        System.out.println(queueImplementationUsingStack.deQueue());
        System.out.println(queueImplementationUsingStack.deQueue());
        queueImplementationUsingStack.enQueue(5);
        System.out.println(queueImplementationUsingStack.deQueue());


    }

}
