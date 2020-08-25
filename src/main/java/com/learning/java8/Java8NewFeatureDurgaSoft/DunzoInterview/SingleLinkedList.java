package com.learning.java8.Java8NewFeatureDurgaSoft.DunzoInterview;

class SLLNode{

    int data;
    SLLNode next;

    public SLLNode(int data) {
        this.data = data;
    }
}

public class SingleLinkedList {

    public static SLLNode head;

    @Override
    public String toString(){
        SLLNode temp = head;
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

    public void insertFirst(int data){
        SLLNode newNode = new SLLNode(data);
        newNode.next=head;
        head=newNode;
    }

    public void insertLast(int data){
        SLLNode temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        SLLNode newNode = new SLLNode(data);
        temp.next=newNode;
    }

    public void insertMiddle(SLLNode previous,int data){
        if(previous==null){
            throw new RuntimeException("Previous node cant be null");
        }
        SLLNode newNode = new SLLNode(data);
        newNode.next=previous.next;
        previous.next=newNode;
    }

    public boolean isDuplicate(){
        SLLNode temp = head; //Integer.MAX_VALUE 1 2 3 3 2 1  //1 2 3

        while(temp!=null){
            SLLNode temp1= head.next;
            while(temp1!=null){
                if(temp.data==temp1.data){
                    return true;
                }
                temp1=temp1.next;
            }
            temp=temp.next;
        }
        return false;
    }

    public static void main(String[] args) {

        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.insertFirst(1);  //1
        System.out.println(singleLinkedList);
        singleLinkedList.insertMiddle(head,2); //head->1,2,3
        System.out.println(singleLinkedList);
        singleLinkedList.insertLast(3);   //head->1->3
        System.out.println(singleLinkedList);
        singleLinkedList.insertLast(4);   //head->1->3
        System.out.println(singleLinkedList);
        System.out.println(singleLinkedList.isDuplicate());

    }


}
