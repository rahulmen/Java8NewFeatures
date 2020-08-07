package com.learning.java8.Java8NewFeatureDurgaSoft.DataStructures.LinkedList;

 class ListNode1{

     private ListNode1 next;
     private int data;

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

    public static void main(String[] args) {

        LinkedListCreationDemo2 linkedListCreationDemo2 = new LinkedListCreationDemo2();
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
        System.out.println(linkedListCreationDemo2);

    }

}
