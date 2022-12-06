package com.learning.java8.Java8NewFeatureDurgaSoft.Trees.BinaryTreeTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderTraversal {

    private static class BinaryTreeNode{

        int data;
        BinaryTreeNode left;
        BinaryTreeNode right;

        public BinaryTreeNode(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public BinaryTreeNode getLeft() {
            return left;
        }

        public void setLeft(BinaryTreeNode left) {
            this.left = left;
        }

        public BinaryTreeNode getRight() {
            return right;
        }

        public void setRight(BinaryTreeNode right) {
            this.right = right;
        }
    }

    private static void inOrderTraversalRecursion(BinaryTreeNode root){
        if(root!=null){
            inOrderTraversalRecursion(root.getLeft());
            System.out.print(root.data+" ");
            inOrderTraversalRecursion(root.getRight());
        }
    }


    // PreOrder - 1 2 4 5 3 6 7
    // InOrder - 4 2 5 1 6 3 7

    private static List<Integer> inOrderTraversalStack(BinaryTreeNode root){

        List<Integer> output = new ArrayList<>();
        Stack<BinaryTreeNode> stack = new Stack<>();
        BinaryTreeNode currentNode = root;
        boolean flag = false;

        while(!flag){

            if(currentNode!=null){
                stack.push(currentNode);
                currentNode = currentNode.getLeft();
            }else{
                if(stack.isEmpty()){
                    flag = true;
                }else{
                   currentNode = stack.pop();
                    output.add(currentNode.getData());
                    currentNode = currentNode.getRight();
                }
            }
        }
        return output;
    }

    public static void main(String[] args) {

        BinaryTreeNode first = new BinaryTreeNode(1);
        BinaryTreeNode second = new BinaryTreeNode(2);
        BinaryTreeNode third = new BinaryTreeNode(3);
        BinaryTreeNode fourth = new BinaryTreeNode(4);
        BinaryTreeNode fifth = new BinaryTreeNode(5);
        BinaryTreeNode sixth = new BinaryTreeNode(6);
        BinaryTreeNode seven = new BinaryTreeNode(7);

        first.setLeft(second);
        first.setRight(third);
        second.setLeft(fourth);
        second.setRight(fifth);
        third.setLeft(sixth);
        third.setRight(seven);

        System.out.print("Using Recursion :");
        inOrderTraversalRecursion(first);
        System.out.println();
        System.out.print("Using Stack :");
        System.out.println(inOrderTraversalStack(first));

    }

}
