package com.learning.java8.Java8NewFeatureDurgaSoft;


class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

public class LinkedListLoop {

    static Node head;

    public boolean isLoop(Node head){

        Node temp = head;
        Node temp1= head.next;

        while(temp1!=null && temp1.next!=null && temp!=null){
            if(temp==temp1){
                return true;
            }else{
                temp=temp.next;
                temp1=temp1.next.next;
            }
        }

        return false;
    }


    public static void main(String[] args) {
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        head = first;
        first.next=second;
        second.next=head;

        System.out.println(new LinkedListLoop().isLoop(head));






    }

}
