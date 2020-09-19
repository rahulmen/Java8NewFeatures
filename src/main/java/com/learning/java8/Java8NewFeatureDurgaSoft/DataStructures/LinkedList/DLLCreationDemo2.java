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
        if(head==null){
            head=new DLLNode1(data);
            head.previous=null;
            head.next=null;
            return;
        }
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

    public int deleteFirst(){
        if(head==null){
            throw new RuntimeException("Head Cant be null");
        }
        int data = head.data;
        head = head.next;
        if(head!=null){
        head.previous=null;
        }
        return data;
    }

    public int deleteLast(){
        if(head==null){
            throw new RuntimeException("Head Cant be null");
        }
        DLLNode1 temp = head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        int data = temp.next.data;
        temp.next=temp.next.next;
        return data;
    }

    public int deleteMiddle(DLLNode1 node){
        if(node==null){
            throw new RuntimeException("Node Cant be null");
        }
        int data = node.next.data;
        if(node.next!=null) {
            node.next = node.next.next;
        }
        if(node.next!=null){
            node.next.previous=node;
        }
        return data;
    }



    public static void main(String[] args) {

        DLLCreationDemo2 dllCreationDemo2 = new DLLCreationDemo2();
        System.out.println(dllCreationDemo2);
        dllCreationDemo2.insertFirst(1);
        System.out.println(dllCreationDemo2);
        dllCreationDemo2.deleteFirst();
        System.out.println(dllCreationDemo2);
        dllCreationDemo2.insertLast(3);
        System.out.println(dllCreationDemo2);
        dllCreationDemo2.insertMiddle(head,2);
        System.out.println(dllCreationDemo2);
        dllCreationDemo2.insertMiddle(0,head.next);
        System.out.println(dllCreationDemo2);
        System.out.println(dllCreationDemo2.deleteFirst());
        System.out.println(dllCreationDemo2);
        dllCreationDemo2.insertMiddle(head,1);
        dllCreationDemo2.insertMiddle(head,2);
        dllCreationDemo2.insertMiddle(head,3);
        dllCreationDemo2.insertMiddle(head,4);
        System.out.println(dllCreationDemo2.deleteLast());
        System.out.println(dllCreationDemo2);
        System.out.println(dllCreationDemo2.deleteMiddle(head.next.next));
        System.out.println(dllCreationDemo2);
    }
}
