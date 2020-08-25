package com.learning.java8.Java8NewFeatureDurgaSoft.DataStructures.LinkedList;


class DLLNode1{

    int data;
    DLLNode1 previous;
    DLLNode1 next;

    public DLLNode1(int data) {
        this.data = data;
    }
}

public class DLLCreationDemo2 {

    public static DLLNode1 head;

    @Override
    public String toString(){
        DLLNode1 temp = head;
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

    public void insertFirst(int data){
        DLLNode1 newNode = new DLLNode1(data);
        newNode.next=head;
        newNode.previous=null;
        if(head!=null){
            head.previous=newNode;
        }
        head=newNode;
    }

    public void insertMiddle(DLLNode1 previous,int data){
        if(previous==null){
            throw new RuntimeException("Previous Cant be null");
        }
        DLLNode1 newNode = new DLLNode1(data);
        newNode.next=previous.next;
        newNode.previous=previous;
        previous.next=newNode;
        if(newNode.next!=null){
            newNode.next.previous=newNode;
        }
    }

    public void insertLast(int data){

        DLLNode1 newNode = new DLLNode1(data);
        DLLNode1 temp = head;
        while(temp.next!=null)temp=temp.next;
        temp.next=newNode;
        newNode.previous=temp;
        newNode.next=null;
    }

    public void insertMiddle(int data,DLLNode1 next){
       if(next==null){
           throw new RuntimeException("Next Cant be null");
       }
        DLLNode1 newNode = new DLLNode1(data);

       newNode.previous=next.previous;
       newNode.next=next;
       next.previous=newNode;
       if(newNode.previous!=null){
           newNode.previous.next=newNode;
       }
    }



    public static void main(String[] args) {

        DLLCreationDemo2 dllCreationDemo2 = new DLLCreationDemo2();
        System.out.println(dllCreationDemo2);
        dllCreationDemo2.insertFirst(1);
        System.out.println(dllCreationDemo2);
        dllCreationDemo2.insertLast(3);
        System.out.println(dllCreationDemo2);
        dllCreationDemo2.insertMiddle(head,2);
        System.out.println(dllCreationDemo2);
        dllCreationDemo2.insertMiddle(0,head.next);
        System.out.println(dllCreationDemo2);

    }
}
