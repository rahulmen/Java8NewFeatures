package com.learning.java8.Java8NewFeatureDurgaSoft;


import java.sql.SQLOutput;
import java.util.Stack;

class StackImpl{

//    int top =-1;
//    int[] arr;
//
//    public StackImpl(int data) {
//        this.arr = new int[data];
//    }
//
//    public void push(int data,StackImpl stack1,StackImpl stack2){
//        if(top==arr.length-1){
//            throw new RuntimeException("Stack Overflow");
//        }
//        if(stack1.peek()>data){
//          stack2.push(stack1.pop(),null,null);
//        }
//
//        arr[++top]=data;
//    }
//
//
//
//    public int pop(){
//        if(top==-1){
//            throw new RuntimeException("Stack underflow");
//        }
//        int data = arr[top];
//        top--;
//        return  data;
//    }
//
//    public int peek(){
//        if(top==-1){
//            throw new RuntimeException("Stack underflow");
//        }
//        int data = arr[top];
//        return  data;
//    }
//
//    public int getMax(){
//
//
//    }
}


public class StackReturnMax {

    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();

    public int getMax(){

        int max = Integer.MIN_VALUE;

        if(stack1.isEmpty()){
            return -1;
        }else{
            while(!stack1.isEmpty()){
                if(stack1.peek()>max){
                    max=stack1.peek();
                }
                stack2.push(stack1.pop());
            }

            while(!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
        }

        return max;
    }


    public static void main(String[] args) {

        StackReturnMax stackReturnMax = new StackReturnMax();
        stackReturnMax.stack1.push(1);
        stackReturnMax.stack1.push(3);
        System.out.println(new StackReturnMax().getMax());
        stackReturnMax.stack1.push(4);
        stackReturnMax.stack1.push(2);
        System.out.println(new StackReturnMax().getMax());
        stackReturnMax.stack1.pop();
        stackReturnMax.stack1.pop();
        System.out.println(new StackReturnMax().getMax());
        stackReturnMax.stack1.pop();
        stackReturnMax.stack1.pop();
        System.out.println(new StackReturnMax().getMax());








    }

}
