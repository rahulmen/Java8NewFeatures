package com.learning.java8.Java8NewFeatureDurgaSoft.Trees.BinaryTreeTraversal;


public class PreOrderTraversalUsingRecursion {

    static class BinaryTreeNode {

        private int data;
        private BinaryTreeNode left;
        private BinaryTreeNode right;

        public BinaryTreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
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

    private static void preOrderTraversalUsingRecursion(BinaryTreeNode root){
        if(root!=null){
            System.out.print(root.getData()+" ");
            preOrderTraversalUsingRecursion(root.getLeft());
            preOrderTraversalUsingRecursion(root.getRight());
        }
    }

    public static void main(String[] args) {

        //Defining Nodes
        BinaryTreeNode node1 = new BinaryTreeNode(1);
        BinaryTreeNode node2 = new BinaryTreeNode(2);
        BinaryTreeNode node3 = new BinaryTreeNode(3);
        BinaryTreeNode node4 = new BinaryTreeNode(4);
        BinaryTreeNode node5 = new BinaryTreeNode(5);
        BinaryTreeNode node6 = new BinaryTreeNode(6);
        BinaryTreeNode node7 = new BinaryTreeNode(7);

        //Linking Nodes
        node1.setLeft(node2);
        node1.setRight(node3);
        node2.setLeft(node4);
        node2.setRight(node5);
        node3.setLeft(node6);
        node3.setRight(node7);
        preOrderTraversalUsingRecursion(node1);
    }




}
