package com.learning.java8.Java8NewFeatureDurgaSoft.DataStructure3;

class ListNode{
    int data;
    ListNode next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    ListNode(int data){
        this.data=data;
        this.next=null;
    }
}


public class LinkedListImpl {

    private static ListNode head;

    public void insertFirst(int data){
        ListNode newNode = new ListNode(data);
        if(head==null){
            head = newNode;
        }else{
            ListNode next = head;
            head = newNode;
            head.setNext(next);
        }
    }

    public void insertLast(int data){
        ListNode newNode = new ListNode(data);
        ListNode temp = head;
        while(temp.getNext()!=null){
            temp=temp.getNext();
        }
        temp.setNext(newNode);
        head=temp;
    }

    public void insertMiddle(int data,ListNode previous){
        ListNode newNode = new ListNode(data);
        newNode.setNext(previous.getNext());
        previous.setNext(newNode);
    }

    @Override
    public String toString(){
        ListNode temp = head;
        String s = "[";
        if(temp!=null) {
            while (temp.getNext() != null) {
                s += temp.getData() + ",";
                temp = temp.getNext();
            }
            s += temp.getData();
        }
        return s+="]";
    }


    public static void main(String[] args) {

        LinkedListImpl list = new LinkedListImpl();
//        head = new ListNode(1);
//        ListNode second = new ListNode(2);
//        ListNode third = new ListNode(3);
//
//        head.setNext(second);
//        second.setNext(third);
//        third.setNext(null);

        System.out.println(list);

        list.insertFirst(0);
        System.out.println(list);
        list.insertLast(4);
        System.out.println(list);
        list.insertMiddle(2,head);
        System.out.println(list);




    }


}
