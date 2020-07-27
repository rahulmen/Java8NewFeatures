package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next=null;
    }
}

public class LinkedListDemo1 {

    static Node head;

    public String toString(){
        Node temp = head;
        String s="[";
        while(temp!=null){
            if(temp.next==null){
                s+=temp.data;
                break;
            }
            s+=temp.data+",";
            temp=temp.next;
        }
        return s+"]";
    }

    public String toString(Node head){
        Node temp = head;
        String s="[";
        while(temp!=null){
            if(temp.next==null){
                s+=temp.data;
                break;
            }
            s+=temp.data+",";
            temp=temp.next;
        }
        return s+"]";
    }

    public void addFirst(Node node){
        Node temp = head;
        head = node;
        head.next=temp;
    }

    public void addMiddle(Node node,Node previous){
        Node temp = previous.next;
        previous.next=node;
        node.next=temp;
    }

    public void addLast(Node node){
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
    }

    public  Node removeElements(Node head, int val) {
        if(head==null){
            return null;
        }
      Node firstNode = new Node(-1);
        firstNode.next=head;
        head=firstNode;

        while(firstNode.next!=null){
            if(firstNode.next.data==val){
                firstNode.next=firstNode.next.next;
            }else{
                firstNode=firstNode.next;
            }
        }
        return head.next;
    }

    public static void main(String[] args) {

        LinkedListDemo1 linkedListDemo1 = new LinkedListDemo1();
        head = new Node(6);
        Node first = new Node(2);
        Node second = new Node(6);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);
        head.next=first;
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=sixth;
        System.out.println(linkedListDemo1);

        System.out.println(linkedListDemo1.toString(linkedListDemo1.removeElements(head,3)));



        /*System.out.println(linkedListDemo1);
        linkedListDemo1.addFirst(new Node(0));
        System.out.println(linkedListDemo1);
        linkedListDemo1.addMiddle(new Node(3),first); //[0,1,2,3,4]
        System.out.println(linkedListDemo1);
        linkedListDemo1.addLast(new Node(5));
        System.out.println(linkedListDemo1);*/





/*
        1---->2---->3
        0---->1--->2--3->4---5
        */


    }







}
