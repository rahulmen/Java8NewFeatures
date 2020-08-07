package com.learning.java8.Java8NewFeatureDurgaSoft.DataStructures.LinkedList;

class ListNode{
    ListNode next;
    int data;

    ListNode(int data){
        this.data=data;
        this.next=null;
    }

    public ListNode getNext() {
        return next;
    }

    public int getData() {
        return data;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public void setData(int data) {
        this.data = data;
    }
}

public class LinkedListCreationDemo1 {

    static ListNode head;

    @Override
    public String toString(){
        String s = "[";
        ListNode temp = head;
        while(temp!=null){
            if(temp.next==null){
                s+=temp.data+"]";
                temp=temp.next;
                continue;
            }
            s+=temp.data+",";
            temp=temp.next;
        }
        return s;
    }

    public void insertFirst(int data){
        ListNode temp = new ListNode(data);
        temp.next=head;
        head=temp;
    }

    public void insertMiddle(int position,int data){
        if(head==null){
            throw new RuntimeException("Head Can't be null");
        }
        ListNode t = head;
        int counter =1;
        while(t!=null){
            if(counter==position){
                ListNode temp = new ListNode(data);
                temp.next=t.next;
                t.next=temp;
                break;
            }else{
                counter++;
                t=t.next;
            }
        }

    }

    public void insertLast(int data){
        if(head==null){
            throw new RuntimeException("Head Can't be null");
        }
        ListNode temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=new ListNode(data);
    }

    public int deleteFirst(){
        if(head==null){
            throw new RuntimeException("Head can not be null");
        }
        int data = head.data;
        head = head.next;
        return data;
    }

    public int deleteMiddle(int position){
        if(head==null){
            throw new RuntimeException("Head can not be null");
        }
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        dummy.next=head;
        head=dummy;
        ListNode temp = head;
        int counter =1;
        int data=Integer.MIN_VALUE;
        while(temp!=null){
            if(counter==position){
                data=temp.next.data;
                temp.next=temp.next.next;
                break;
            }else{
                temp=temp.next;
                counter++;
            }
        }
        head=head.next;
        return data;
    }

    public int deleteLast(){
        if(head==null){
            throw new RuntimeException("Head can not be null");
        }
        ListNode temp = head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        int data = temp.next.data;
        temp.next=temp.next.next;
        return data;
    }



    public static void main(String[] args) {
        LinkedListCreationDemo1 linkedListCreationDemo1 = new LinkedListCreationDemo1();
        linkedListCreationDemo1.insertFirst(1);
        System.out.println(linkedListCreationDemo1);
        linkedListCreationDemo1.insertLast(3);
        System.out.println(linkedListCreationDemo1);
        linkedListCreationDemo1.insertMiddle(1,2);
        System.out.println(linkedListCreationDemo1);
        System.out.println("Deleted Data : "+linkedListCreationDemo1.deleteFirst());
        System.out.println(linkedListCreationDemo1);
        linkedListCreationDemo1.insertFirst(1);
        System.out.println(linkedListCreationDemo1);
        System.out.println("Deleted Data : "+linkedListCreationDemo1.deleteMiddle(1));
        System.out.println(linkedListCreationDemo1);
        linkedListCreationDemo1.insertFirst(0);
        System.out.println(linkedListCreationDemo1);
        System.out.println("Deleted Data : "+linkedListCreationDemo1.deleteLast());
        System.out.println(linkedListCreationDemo1);
    }

}
