package com.learning.java8.Java8NewFeatureDurgaSoft.DunzoInterview;

class SLNode{
    private int data;
    private SLNode next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public SLNode getNext() {
        return next;
    }

    public void setNext(SLNode next) {
        this.next = next;
    }

    public SLNode(int data, SLNode next) {
        this.data = data;
        this.next = next;
    }

    static class Builder{
        int data;
        SLNode next;

        public Builder(int data, SLNode next) {
            this.data = data;
            this.next = next;
        }

        public int getData() {
            return data;
        }

        public Builder setData(int data) {
            this.data = data;
            return this;
        }

        public SLNode getNext() {
            return next;
        }

        public Builder setNext(SLNode next) {
            this.next = next;
            return this;
        }

        public SLNode build(){
            return new SLNode(this.data,this.next);
        }
    }
}


public class LinkedList {

    static SLNode head;


    public static void reverse(){

        SLNode temp = null;
        SLNode prev = null;

        while(head!=null){
            temp=head.getNext();
            head.setNext(prev);
            prev=head;
            head=temp;
        }
        head = prev;
    }

    public static void main(String[] args) {

        head = new SLNode.Builder(1,new SLNode(2,new SLNode(3,new SLNode(4,null)))).build();

        SLNode temp = head;
        while(temp!=null){
            System.out.print(temp.getData()+",");
            temp=temp.getNext();
        }

        System.out.println();
        reverse();

        temp = head;
        while(temp!=null){
            System.out.print(temp.getData()+",");
            temp=temp.getNext();
        }



    }
}
