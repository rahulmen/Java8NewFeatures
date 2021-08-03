package com.learning.java8.Java8NewFeatureDurgaSoft.DataStructure2021;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.stream.Collectors;

public class ImplementQueueUsingTwoStack {

    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();

    public void enQueue(int data){
       stack1.push(data);
    }

    public int deQueue(){
    if(stack1.isEmpty() && stack2.isEmpty()){
     throw new RuntimeException("Queue is Empty");
    }else if(!stack2.isEmpty()){
        return stack2.pop();
    }else if(!stack1.isEmpty()){
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
    return Integer.MIN_VALUE;
    }


    public static void main(String[] args) {

          //ImplementQueueUsingTwoStack implementQueueUsingTwoStack = new ImplementQueueUsingTwoStack();
          HashMap<Integer,Integer> map = new HashMap<>();
          map.put(1,2);map.put(2,3);map.put(3,4);

          System.out.println(new HashMap<Integer,Integer>().entrySet().stream().filter(e->e.getKey()>=1 && e.getValue()>0).
                    collect(Collectors.toList()).get(0));

//          implementQueueUsingTwoStack.enQueue(1);
//            implementQueueUsingTwoStack.enQueue(2);
//            implementQueueUsingTwoStack.enQueue(3);
//            implementQueueUsingTwoStack.enQueue(4);
//            System.out.println(implementQueueUsingTwoStack.deQueue());
//            implementQueueUsingTwoStack.enQueue(5);
//            System.out.println(implementQueueUsingTwoStack.deQueue());
//            System.out.println(implementQueueUsingTwoStack.deQueue());
//            System.out.println(implementQueueUsingTwoStack.deQueue());
//            System.out.println(implementQueueUsingTwoStack.deQueue());
//            System.out.println(implementQueueUsingTwoStack.deQueue());
//            System.out.println(implementQueueUsingTwoStack.deQueue());
//            System.out.println(implementQueueUsingTwoStack.deQueue());
//



    }

}
