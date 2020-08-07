package com.learning.java8.Java8NewFeatureDurgaSoft.DataStructures.LinkedList;

class DListNode{

    private DListNode previous;
    private DListNode next;
    private int data;

    public DListNode(int data,DListNode previous, DListNode next) {
        this.data = data;
        this.previous = previous;
        this.next = next;
    }

    public DListNode(int data) {
        this.data = data;
        this.next = null;
        this.previous=null;
    }

    public DListNode getPrevious() {
        return previous;
    }

    public void setPrevious(DListNode previous) {
        this.previous = previous;
    }

    public DListNode getNext() {
        return next;
    }

    public void setNext(DListNode next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}


public class DoublyLinkedListCreationDemo1 {

    int size =-1;
    DListNode head;
    DListNode tail;


    DoublyLinkedListCreationDemo1(){
        head = new DListNode(Integer.MIN_VALUE,null,null);
        tail = new DListNode(Integer.MIN_VALUE,head,null);
        head.setNext(tail);

    }

    @Override
    public String toString(){
        DListNode temp = head;
        String s="[";
        int counter =0;
        while(temp!=null) {
            if (temp.getNext() == null) {
                System.out.println("===="+counter+"====");
                System.out.println(temp.getPrevious());
                System.out.println(temp.getNext());
                System.out.println("=======");
                s += temp.getData();
                counter++;
                break;
            }
            System.out.println("===="+counter+"====");
            System.out.println(temp.getPrevious());
            System.out.println(temp.getNext());
            counter++;
            s += temp.getData() + ",";
            temp=temp.getNext();
        }
        return s+"]";
    }

    public void insertFirst(int data){
        DListNode temp = new DListNode(data,null,head.getNext());
        temp.getNext().setPrevious(temp);
        head=temp;
        size++;
    }



    public static void main(String[] args) {

        DoublyLinkedListCreationDemo1 doublyLinkedListCreationDemo1 = new DoublyLinkedListCreationDemo1();
        doublyLinkedListCreationDemo1.insertFirst(1);
        System.out.println(doublyLinkedListCreationDemo1);
        doublyLinkedListCreationDemo1.insertFirst(2);
        doublyLinkedListCreationDemo1.insertFirst(3);
        doublyLinkedListCreationDemo1.insertFirst(4);
        System.out.println(doublyLinkedListCreationDemo1);

    }


}
