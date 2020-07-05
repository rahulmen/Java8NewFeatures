package com.learning.java8.Java8NewFeatureDurgaSoft.DataStructures.Stack;

public class StackImplementationUsingArray {

    //stack top pointing to -1
     int top = -1;

     int DEFAULTSIZE=10;

    //stackArray pointing to null
    int[] stackArray;

    public StackImplementationUsingArray(){
        stackArray=new int[DEFAULTSIZE];
    }

    public StackImplementationUsingArray(int size){
        stackArray=new int[size];
    }

    public boolean isEmpty(){
        return top<0;
    }

    public int top(){
        if(isEmpty()){
            throw new RuntimeException("Stack is Empty");
        }
        return stackArray[top+1];
    }

    public void push(int data){
        if(top>stackArray.length-1){
            throw new RuntimeException("Stack is full");
        }
        stackArray[++top]=data;
    }

    public int pop(){
        if(isEmpty()){
            throw  new RuntimeException("Stack is Empty");
        }
        int temp = stackArray[top];
        stackArray[top--]=Integer.MIN_VALUE;
        return temp;
    }

    public String toString(){
        String s = "[";

        for(int i=0;i<stackArray.length;i++){
            s+=stackArray[i]+",";
        }
        return s+="]";
    }

    public static void main(String[] args) {
        StackImplementationUsingArray s = new StackImplementationUsingArray();
        s.push(10);
        s.push(20);
        System.out.println(s.top);
        System.out.println(s.pop());
        System.out.println(s.isEmpty());
        s.push(20);

        System.out.println(s);

    }
}
