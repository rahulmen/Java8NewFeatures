package com.learning.java8.Java8NewFeatureDurgaSoft.DataStructures.LinkedList;

class DLLNode{

    int data;
    DLLNode next;
    DLLNode previous;

    DLLNode(int data){
        this.data=data;
    }
}

public class DLLCreationDemo1 {

    static DLLNode head;

    public void insertFirst(int data){

        DLLNode temp = new DLLNode(data);
        temp.next=head;
        temp.previous=null;

        if(head!=null){
            head.previous=temp;
        }

        head=temp;
    }

    public void insertMiddle(DLLNode previous,int data){

        if(previous==null){
            throw new RuntimeException("Node Previous cant be null");
        }

        DLLNode temp = new DLLNode(data);
        temp.next=previous.next;
        temp.previous=previous;
        previous.next=temp;

        if(temp.next!=null){
            temp.next.previous=temp;
        }

    }

    public void insertLast(int data){
        DLLNode temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        DLLNode newNode = new DLLNode(data);
        temp.next=newNode;
        newNode.previous=temp;
        newNode.next=null;
    }


    public void insertMiddle(int data,DLLNode next){

        if(next==null){
            throw new RuntimeException("Next Can't be Null");
        }

        DLLNode newNode = new DLLNode(data);

        newNode.previous=next.previous;
        newNode.next=next;
        next.previous=newNode;

        if(newNode.previous!=null){
            newNode.previous.next=newNode;
        }
    }

    @Override
    public String toString(){
        DLLNode temp = head;
        String s ="[";
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


    public static void main(String[] args) {

        DLLCreationDemo1 dllCreationDemo1 = new DLLCreationDemo1();
        dllCreationDemo1.insertFirst(2);
        System.out.println(dllCreationDemo1);
        dllCreationDemo1.insertMiddle(head,3);
        System.out.println(dllCreationDemo1);
        dllCreationDemo1.insertFirst(0);
        System.out.println(dllCreationDemo1);
        dllCreationDemo1.insertMiddle(head.next.next,1);
        System.out.println(dllCreationDemo1);
        dllCreationDemo1.insertLast(4);
        System.out.println(dllCreationDemo1);
        dllCreationDemo1.insertMiddle(1,head);
        System.out.println(dllCreationDemo1);


    }

}
