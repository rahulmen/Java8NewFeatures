package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem2;

class Node1{
    int data;
    Node1 next;

    Node1(int data){
        this.data=data;
        this.next=null;
    }
}

public class LinkedLostNode2 {
    static Node1 head;

    public String toString(){
        String s = "[";
        Node1 temp = head;
        while(temp!=null){
            if(temp.next==null){
                s+=temp.data+"]";
                temp=temp.next;
                continue;
            }else{
                s+=temp.data+",";
                temp=temp.next;
            }
        }
        return s;
    }

    public void addFirst(Object data){
        Node1 newNode = new Node1((int)data);
        newNode.next=head;
        head=newNode;
    }

    public void addLast(Object data){
        Node1 newNode = new Node1((int)data);
        Node1 temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }

    public void removeNode(int data){
        if(head==null){
            return;
        }
        Node1 newNode = new Node1(-1);
        newNode.next=head;
        head=newNode;

        while(newNode.next!=null) {
            if (newNode.next.data == data) {
                newNode.next = newNode.next.next;
            } else {
                newNode = newNode.next;
            }
        }
        head=head.next;
    }


    public static void main(String[] args) {

        LinkedLostNode2 linkedLostNode2 = new LinkedLostNode2();
        linkedLostNode2.addFirst(0);
        linkedLostNode2.addFirst(-1);
        linkedLostNode2.addFirst(2);
        linkedLostNode2.addLast(2);
        System.out.println(linkedLostNode2);
        linkedLostNode2.addLast(1);
        linkedLostNode2.addLast(2);
        System.out.println(linkedLostNode2);
        linkedLostNode2.removeNode(2);
        System.out.println(linkedLostNode2);

    }
}
