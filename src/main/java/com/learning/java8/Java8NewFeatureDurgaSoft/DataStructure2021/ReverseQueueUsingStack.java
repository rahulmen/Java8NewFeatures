package com.learning.java8.Java8NewFeatureDurgaSoft.DataStructure2021;

import java.util.Stack;

public class ReverseQueueUsingStack {

    public QueueImpl1 initliaseQueue(){
        QueueImpl1 queueImpl1 = new QueueImpl1();
        queueImpl1.enQueue(1);
        queueImpl1.enQueue(2);
        queueImpl1.enQueue(3);
        queueImpl1.enQueue(4);
        System.out.println("Queue Initialised : "+queueImpl1);
        return queueImpl1;
    }

    public void reverseQueue(QueueImpl1 queueImpl1){
        Stack<Integer> stack = new Stack<>();
        while(!queueImpl1.isEmpty()){
            stack.push(queueImpl1.deQueue());
        }
        while (!stack.isEmpty()){
            queueImpl1.enQueue(stack.pop());
        }
        System.out.println("Queue Reversed : "+queueImpl1);
    }

    public static void main(String[] args) {

        ReverseQueueUsingStack queueUsingStack = new ReverseQueueUsingStack();
        queueUsingStack.reverseQueue(queueUsingStack.initliaseQueue());

    }
}
