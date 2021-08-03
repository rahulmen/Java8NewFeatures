package com.learning.java8.Java8NewFeatureDurgaSoft.DataStructure2021;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class MyStack {

    Queue<Integer> q1 = null;Queue<Integer> q2 = null;

    /** Initialize your data structure here. */
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        if(q1.isEmpty()){
            q1.add(x);
        }else if(q2.isEmpty()){
            q2.add(x);
        }else{
            for(int i:q2){
                q1.add(i);
            }
            q2.removeAll(q2);
            q2.add(x);
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(!q2.isEmpty()) {
            return q2.poll();
        }else{
            Iterator<Integer> i = q2.iterator();
            int data = 0;
            while(i.hasNext()){
                 data = i.next();
            }
            q1.remove(data);
            return data;
        }
    }

    /** Get the top element. */
    public int top() {
        if(!q2.isEmpty()) {
            return q2.peek();
        }else{
            Iterator<Integer> i = q2.iterator();
            int data = 0;
            while(i.hasNext()){
                data = i.next();
            }
            return data;
        }
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.isEmpty();
    }
}
