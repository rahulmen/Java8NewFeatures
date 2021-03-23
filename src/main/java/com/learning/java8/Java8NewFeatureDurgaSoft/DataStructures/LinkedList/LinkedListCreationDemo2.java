package com.learning.java8.Java8NewFeatureDurgaSoft.DataStructures.LinkedList;

import java.util.List;

class ListNode1{

     public ListNode1 next;
     public int data;

     public ListNode1(int data) {
         this.data = data;
     }

     public ListNode1 getNext() {
         return this.next;
     }

     public int getData() {
         return data;
     }

     public void setNext(ListNode1 next) {
         this.next = next;
     }

     public void setData(int data) {
         this.data = data;
     }

    public String toString(ListNode1 node){
        ListNode1 temp = node;
        String s="[";
        while(temp!=null) {
            if (temp.getNext() == null) {
                s += temp.getData();
                break;
            }
            s += temp.getData() + ",";
            temp=temp.getNext();
        }
        return s+"]";
    }
 }


public class LinkedListCreationDemo2 {

     ListNode1 head;
     int size =-1;

     @Override
     public String toString(){
         ListNode1 temp = head;
        String s="[";
        while(temp!=null) {
            if (temp.getNext() == null) {
                s += temp.getData();
                break;
            }
            s += temp.getData() + ",";
            temp=temp.getNext();
        }
        return s+"]";
     }


     public synchronized void insertAtBegin(int data){
         size++;
         ListNode1 temp = new ListNode1(data);
         temp.setNext(head);
         head=temp;
     }

     public synchronized void insertAtLast(int data){
         if(head==null){
             throw new RuntimeException("Head Cannot be null");
         }
         size++;
         ListNode1 temp = head;
         while(temp.getNext()!=null){
             temp=temp.getNext();
         }
         temp.setNext(new ListNode1(data));
     }

     public synchronized void insertMiddle(int data,int position){
         if(head==null){
             throw new RuntimeException("Head Cannot be null");
         }else if(position>size){
             throw new RuntimeException("Element at this position is not present");
         }
         int counter=1;
         ListNode1 temp = head;
         while(counter<position){
             temp=temp.getNext();
             counter++;
         }
         ListNode1 input = new ListNode1(data);
         input.setNext(temp.getNext());
         temp.setNext(input);
     }

     public synchronized int removeFromBegin(){
         if(head==null){
             throw new RuntimeException("Head Can't be Null");
         }
         ListNode1 node1 = head;
         int value = node1.getData();
         head=node1.getNext();
         node1=null;
         return value;
     }

     public synchronized int removeFromLast(){
         if(head==null){
             throw new RuntimeException("Head Can't be Null");
         }
         ListNode1 temp = head;
         while(temp.getNext().getNext()!=null){
             temp=temp.getNext();
         }
         int data = temp.getNext().getData();
         temp.setNext(null);
         return data;
     }

     public synchronized int removeFromMiddle(int position){

         if(head==null){
             throw new RuntimeException("Head Can't be Null");
         }else if(position>size){
             throw new RuntimeException("Element at this position is not present");
         }

         ListNode1 node = new ListNode1(Integer.MIN_VALUE);
         node.setNext(head);
         head=node;

         int counter =-1;
         while(counter<position-1){
             node=node.getNext();
             counter++;
         }
         int data = node.getNext().getData();
         node.setNext(node.getNext().getNext());
         head=head.getNext();
         return data;

     }

     public static ListNode1 mergeInBetween(ListNode1 listNode1,ListNode1 listNode2,int a ,int b){

         int count =1;
         ListNode1 temp = listNode1;
         ListNode1 temp1 = null;
         while(count<a){
             temp=temp.next;
             count++;
         }
         temp1=temp;
         temp=listNode2;

         while(count<b){
             temp1=temp1.next;
             count++;
         }

         while(temp.next!=null){
             temp=temp.next;
         }

         temp.next=temp1.next;

         return listNode1;

     }

    ListNode1 reversed(ListNode1 head){
       ListNode1 prev = null;
       ListNode1 temp = null;

       int i=1;
       while(head!=null) {
           System.out.println("Enter in Loop "+i);

           System.out.println("Head : "+head.toString(head));

           temp = head.next;
           if(temp!=null)
               System.out.println("{Set temp to head.next} Temp : " + temp.toString(temp));
           else
               System.out.println("Temp is null because head.next is null" );


           head.next = prev;
           if(head.next!=null) {
               System.out.println("{Set Head.NEXT to prev} Head.NEXT " + head.next.toString(head.next));
               System.out.println("Now Head :is " + head.toString(head));
           }
           else {
               System.out.println("Set Head.NEXT to prev Head.NEXT is null because previous is null");
               System.out.println("Head : " + head.toString(head));
           }


           prev = head;
           if(prev!=null)
               System.out.println("{Set Prev to head} Prev : " + prev.toString(prev));
           else
               System.out.println("Prev is null because head is null" );


           head = temp;
           if(head!=null)
               System.out.println("{Set Head to temp} Head : " + head.toString(head));
           else
               System.out.println("Head is null because temp is null" );


           System.out.println("End of Loop "+i);
           i++;
       }
       return prev;
    }

    public static void main(String[] args) {

        /*LinkedListCreationDemo2 linkedListCreationDemo2 = new LinkedListCreationDemo2();
        linkedListCreationDemo2.insertAtBegin(2);
        System.out.println(linkedListCreationDemo2);
        linkedListCreationDemo2.insertAtBegin(1);
        System.out.println(linkedListCreationDemo2);
        linkedListCreationDemo2.insertAtLast(4);
        System.out.println(linkedListCreationDemo2);
        linkedListCreationDemo2.insertMiddle(3,2);
        System.out.println(linkedListCreationDemo2);
        System.out.println("Data Removed from First Element: "+linkedListCreationDemo2.removeFromBegin());
        System.out.println(linkedListCreationDemo2);
        System.out.println("Data Removed from Last Element: "+linkedListCreationDemo2.removeFromLast());
        System.out.println(linkedListCreationDemo2);
        linkedListCreationDemo2.insertAtLast(4);
        linkedListCreationDemo2.insertAtLast(5);
        System.out.println(linkedListCreationDemo2);
        System.out.println("Data Removed from Position 2: "+linkedListCreationDemo2.removeFromMiddle(2));
        System.out.println(linkedListCreationDemo2);*/

        LinkedListCreationDemo2 l1 = new LinkedListCreationDemo2();
        l1.insertAtBegin(1);l1.insertAtLast(2);l1.insertAtLast(3);l1.insertAtLast(4);l1.insertAtLast(5);
        LinkedListCreationDemo2 l2 = new LinkedListCreationDemo2();
        l2.insertAtBegin(6);l2.insertAtLast(7);l2.insertAtLast(8);l2.insertAtLast(9);

        System.out.println(l1);

        l1.head = l1.reversed(l1.head);
        System.out.println(l1);
        /*
        System.out.println(l1);
        System.out.println(l2);
        ListNode1 output = mergeInBetween(l1.head,l2.head,2,3);
        l1.head = output;
        System.out.println(l1)*/;





    }

}
