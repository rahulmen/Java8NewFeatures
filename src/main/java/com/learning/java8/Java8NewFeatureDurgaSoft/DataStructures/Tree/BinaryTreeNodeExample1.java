package com.learning.java8.Java8NewFeatureDurgaSoft.DataStructures.Tree;

class Node{

    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left=this.right=null;
    }
}

public class BinaryTreeNodeExample1 {

    Node top;

    BinaryTreeNodeExample1(){
        this.top=null;
    }

    public static void main(String[] args) {
        BinaryTreeNodeExample1 binaryTreeNodeExample1 = new BinaryTreeNodeExample1();
        binaryTreeNodeExample1.top = new Node(3);
        binaryTreeNodeExample1.top.left=new Node(4);
        binaryTreeNodeExample1.top.right=new Node(5);
        binaryTreeNodeExample1.top.left.left=new Node(6);



    }


}
