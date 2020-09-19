package com.learning.java8.Java8NewFeatureDurgaSoft.DataStructures.Tree;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left=this.right=null;
    }
}

public class BinaryTreeNodeDemo1 {

    TreeNode root;

    public BinaryTreeNodeDemo1() {
        this.root=null;
    }

    public BinaryTreeNodeDemo1(int data) {
        this.root = new TreeNode(data);
    }

    public static void main(String[] args) {
        BinaryTreeNodeDemo1 bn = new BinaryTreeNodeDemo1(1);
        bn.root.left=new TreeNode(2);
        bn.root.right=new TreeNode(3);
        bn.root.left.left=new TreeNode(4);
        bn.root.left.right=new TreeNode(5);
    }
}
