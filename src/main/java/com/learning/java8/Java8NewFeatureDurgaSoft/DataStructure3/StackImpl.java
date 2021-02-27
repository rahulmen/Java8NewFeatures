package com.learning.java8.Java8NewFeatureDurgaSoft.DataStructure3;

import java.util.Arrays;

public class StackImpl {

    int top = -1;
    int capacity = 10;
    int[] data = new int[10];

    StackImpl(){
        this.data = new int[capacity];
    }

    StackImpl(int data){
        this.capacity=data;
        this.data = new int[capacity];
    }

    public void push(int data){
        if(top>capacity-1){
            throw new RuntimeException("Stack overflow");
        }
        this.data[++top]=data;
    }

    public int pop(){
        if(top==-1){
            return Integer.MIN_VALUE;
        }
        int data = this.data[top];
        top--;
        return data;
    }

    public int peek(){
        if(top==-1){
            return Integer.MIN_VALUE;
        }
        int data = this.data[top];
        return data;
    }


    @Override
    public String toString(){
        String s = "[";
        if(top>=0) {
            for (int i = 0; i <= top - 1; i++) {
                s += this.data[i] + ",";
            }
            s += this.data[top]+"]";
            return s;
        }else{
            return s+"]";
        }
    }


    public static void main(String[] args) {

        StackImpl stack = new StackImpl();
        System.out.println(stack);
        stack.push(1);
        System.out.println(stack);
        stack.push(2);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);

    }



}
