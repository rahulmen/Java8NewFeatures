package com.learning.java8.Java8NewFeatureDurgaSoft.DataStructure2.Queue;

class Stack {

    private static int top = -1;
    private int size;
    private int[] array;

    Stack(){
        this.size=5;
        this.array = new int[size];
    }

    Stack(int size){
        this.size=size;
        this.array = new int[size];
    }

    public void push(int i){
        if(top==size){
            throw new RuntimeException("Stack Overflow Exception");
        }
        top++;
        array[top]=i;
    }

    public int pop(){
        if (top == -1){
            throw new RuntimeException("Stack UnderFlow Exception");
        }
        int ret = array[top];
        top--;
        return ret;
    }

    public int peek(){
        if (top == -1){
            throw new RuntimeException("Stack UnderFlow Exception");
        }
        return array[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public String toString(){
        if(top==-1){
            return "[]";
        }
       String s = "[";
       for(int i=0;i<=top-1;i++){
           s+=array[i]+",";
       }
       return s+=array[top]+"]";
    }

}

class Queue{

    int front,rear,size;

    Queue(){
        this.front=0;this.rear=0;this.size=5;
    }

    Queue(int size){
        this.front=0;this.rear=0;this.size=size;
    }

}


public class ImplementQueueUsingStack {

    public static void main(String[] args) {
    Stack stack = new Stack();
    stack.push(1);
    stack.push(3);
    stack.push(5);
    stack.push(2);
    stack.push(4);
    System.out.println(stack);
    }
}
