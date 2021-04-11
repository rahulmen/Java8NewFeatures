package com.learning.java8.Java8NewFeatureDurgaSoft.DataStructure2021;

public class StackImpl {

    int top = -1;
    int capacity = 10;
    int[] stack;

    StackImpl(){
        this.stack = new int[capacity];
    }

    StackImpl(int capacity){
        this.stack = new int[capacity];
    }

    public void push(int data){
        if(top==capacity){
            throw new RuntimeException("Stack OverFlow");
        }
        stack[++top]=data;
    }

    public int pop(){
        if(top == -1){
            return Integer.MIN_VALUE;
        }
        int data = stack[top];
        top--;
        return data;
    }

    public int peek(){
        if(top == -1){
            return Integer.MIN_VALUE;
        }
        return stack[top];
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public boolean isFull(){
        return top==capacity;
    }

    public String toString(){
        String s = "[";
        for(int i=top;i>0;i--){
            s+=stack[i]+",";
        }
       return s+=stack[0]+"]";
    }

    public static void main(String[] args) {
        StackImpl stack = new StackImpl();
        stack.push(1);
        System.out.println(stack);
        stack.push(2);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack);
    }

}
