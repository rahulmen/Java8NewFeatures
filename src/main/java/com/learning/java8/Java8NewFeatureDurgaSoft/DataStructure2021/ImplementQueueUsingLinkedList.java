package com.learning.java8.Java8NewFeatureDurgaSoft.DataStructure2021;

class SLLNode1{

    int data;
    SLLNode1 next;

    public SLLNode1(int data) {
        this.data = data;
    }
}

class SingleLinkedList {

    public static SLLNode1 head;

    @Override
    public String toString() {
    SLLNode1 temp = head;
        String s = "[";
        while (temp != null) {
            if (temp.next == null) {
                s += temp.data;
                break;
            }
            s += temp.data + ",";
            temp = temp.next;
        }
        return s + "]";
    }

    public void enQueue(int data) {
        if(head==null){
            head=new SLLNode1(data);
            return;
        }
        SLLNode1 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        SLLNode1 newNode = new SLLNode1(data);
        temp.next = newNode;
    }

    public int deQueue(){
        if(head==null){
            throw new RuntimeException("Queue is Empty");
        }
        int data = head.data;
        head = head.next;
        return data;
    }

}



public class ImplementQueueUsingLinkedList {

    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.enQueue(1);
        singleLinkedList.enQueue(2);
        singleLinkedList.enQueue(3);
        System.out.println("After EnQueue : "+singleLinkedList);
        System.out.println(singleLinkedList.deQueue());
        System.out.println("After DeQueue : "+singleLinkedList);
        System.out.println(singleLinkedList.deQueue());
        System.out.println("After DeQueue : "+singleLinkedList);
        System.out.println(singleLinkedList.deQueue());
        System.out.println("After DeQueue : "+singleLinkedList);
        System.out.println(singleLinkedList.deQueue());

    }




}
