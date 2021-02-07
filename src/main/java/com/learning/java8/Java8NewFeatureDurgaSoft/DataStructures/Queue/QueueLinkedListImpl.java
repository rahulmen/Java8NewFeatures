package com.learning.java8.Java8NewFeatureDurgaSoft.DataStructures.Queue;

import java.util.Stack;

class Node{

    Node next;int data;
    public Node(int data) {
        this.data = data;
        this.next=null;
    }
    public Node getNext() {return next;}
    public void setNext(Node next) { this.next = next; }
    public int getData() { return data; }
    public void setData(int data) { this.data = data; }
}

public class QueueLinkedListImpl {

    int length;
    Node front,rear;

    QueueLinkedListImpl(){
        this.length=0;
        this.front=null;this.rear=null;
    }

    public void enQueue(int data) {
        Node node = new Node(data);
        if (rear == null) {
            rear = node;
            front = node;
            length++;
        } else {
            rear.setNext(node);
            rear = node;
            length++;
        }
    }

    public int deQueue(){
        if(length==0){
            throw new RuntimeException("Queue UnderFlow");
        }
        length--;
        int data = front.getData();
        front=front.getNext();
        if(front==null){
            rear=null;
        }
        return data;
    }

    public String toString(){
        Node temp = front;
        String s ="[";
        while(temp!=null){
            s+=temp.data;
            if(temp.next!=null){
                s+=",";
            }
            temp=temp.next;
        }
        return s+"]";
    }

    public boolean isEmpty(){
        return length==0;
    }

    public void reverse(){
        Stack<Integer> stack = new Stack<>();
        while(!isEmpty()){
            stack.push(this.deQueue());
        }
        while(!stack.isEmpty()){
           this.enQueue(stack.pop());
        }
    }

    public static void main(String[] args) {
    QueueLinkedListImpl queueLinkedList = new QueueLinkedListImpl();
    queueLinkedList.enQueue(1);
    queueLinkedList.enQueue(2);
    queueLinkedList.enQueue(3);
    queueLinkedList.enQueue(4);
    queueLinkedList.enQueue(5);
    System.out.println(queueLinkedList);
    queueLinkedList.reverse();
    System.out.println(queueLinkedList);
    }



}
