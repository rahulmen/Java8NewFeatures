package com.learning.java8.Java8NewFeatureDurgaSoft.DataStructures.Stack;

public class StackImplementationUsingArray1 {

    int top = -1;
    char[] array;
    int CAPACITY=10;

    StackImplementationUsingArray1() {
        this.array= new char[CAPACITY];
    }

    StackImplementationUsingArray1(int capacity) {
        this.array=new char[capacity];
        this.CAPACITY=capacity;
    }

    public boolean isFull(){
        return top==CAPACITY-1;
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public void push(char data){
        if(top==CAPACITY){
            throw new RuntimeException("Stack is Full");
        }
        array[++top]=data;
    }

    public char pop(){
        if(top==-1){
            throw new RuntimeException("Stack is Empty");
        }
        char data = array[top];
        top--;
        return data;
    }

    public char peek(){
        char data = array[top];
        return data;
    }

    public String toString(){
        String s ="[";
        for(int i=0;i<=top;i++){
            if(i==top){
                s+=array[i];
                break;
            }
            s+=array[i]+",";
        }
        return s+"]";
    }

    public boolean isValid(String s) {
        StackImplementationUsingArray1 stackImplementationUsingArray = new StackImplementationUsingArray1(s.length());
        char[] ch = s.toCharArray();
        for(Character c:ch){
            if(stackImplementationUsingArray.isEmpty()){
                stackImplementationUsingArray.push(c);
            }else{
                Character ch1 = stackImplementationUsingArray.peek();
                if(ch1.equals('(') && c.equals(')') || ch1.equals('{') && c.equals('}') || ch1.equals('[') && c.equals(']')){
                    stackImplementationUsingArray.pop();
                }else{
                    stackImplementationUsingArray.push(c);
                }
            }
        }
        if(stackImplementationUsingArray.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(new StackImplementationUsingArray1().isValid("()[]{}"));


        /*StackImplementationUsingArray1 stackImplementationUsingArray1 =
                new StackImplementationUsingArray1(3);
        System.out.println(stackImplementationUsingArray1.isEmpty());
        System.out.println(stackImplementationUsingArray1.isFull());
        stackImplementationUsingArray1.push(3);
        System.out.println(stackImplementationUsingArray1.isEmpty());
        System.out.println(stackImplementationUsingArray1.isFull());
        stackImplementationUsingArray1.push(5);
        System.out.println(stackImplementationUsingArray1.isEmpty());
        System.out.println(stackImplementationUsingArray1.isFull());
        stackImplementationUsingArray1.push(7);
        System.out.println(stackImplementationUsingArray1.isEmpty());
        System.out.println(stackImplementationUsingArray1.isFull());
        System.out.println(stackImplementationUsingArray1);
        System.out.println(stackImplementationUsingArray1.pop());
        System.out.println(stackImplementationUsingArray1.isEmpty());
        System.out.println(stackImplementationUsingArray1.isFull());
        System.out.println(stackImplementationUsingArray1);
        System.out.println(stackImplementationUsingArray1.pop());
        System.out.println(stackImplementationUsingArray1.isEmpty());
        System.out.println(stackImplementationUsingArray1.isFull());
        System.out.println(stackImplementationUsingArray1);
        System.out.println(stackImplementationUsingArray1.pop());
        System.out.println(stackImplementationUsingArray1.isEmpty());
        System.out.println(stackImplementationUsingArray1.isFull());
        System.out.println(stackImplementationUsingArray1);*/
    }

}
