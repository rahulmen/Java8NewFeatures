package com.learning.java8.Java8NewFeatureDurgaSoft.DataStructures.Queue;

class ListNode{
    int data;
    ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }

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
}

public class QueueLinkedListImplementation {

    private int length;
    private ListNode front;
    private ListNode rear;

    //Create Empty Queue
    QueueLinkedListImplementation(){
        this.length=0;
        this.rear=null;this.front=null;
    }

    public void enQueue(int data){
        ListNode node = new ListNode(data);
        if(length==0){
            front=node;
            rear=node;
            length++;
        }else {
            rear.setNext(node);
            rear = node;
            length++;
        }
    }

    public int deQueue(){
        if(length==0){
            throw new RuntimeException("Queue UnderFlow");
        }
        length--;
        int data = front.getData();
        front=front.getNext();
        if (front==null){
          rear=null;
        }
        return data;
    }

    public String printQueue(){
        String s ="[";
        ListNode temp = front;
        while(temp!=null){
            s+=temp.getData();
            if(temp.next!=null){
                s+=",";
            }
            temp=temp.next;
        }
        return s+"]";
    }


    public static void main(String[] args) {
        QueueLinkedListImplementation queueLinkedListImplementation = new QueueLinkedListImplementation();
        queueLinkedListImplementation.enQueue(1);
        System.out.println(queueLinkedListImplementation.printQueue());
        queueLinkedListImplementation.enQueue(2);
        queueLinkedListImplementation.enQueue(3);
        queueLinkedListImplementation.enQueue(4);
        queueLinkedListImplementation.enQueue(5);
        System.out.println(queueLinkedListImplementation.printQueue());
        System.out.println("Value DeQueue :"+queueLinkedListImplementation.deQueue());
        System.out.println(queueLinkedListImplementation.printQueue());
        queueLinkedListImplementation.enQueue(6);
        System.out.println(queueLinkedListImplementation.printQueue());
        System.out.println("Value DeQueue :"+queueLinkedListImplementation.deQueue());
        System.out.println(queueLinkedListImplementation.printQueue());


    }


}
