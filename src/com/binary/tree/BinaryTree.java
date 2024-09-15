package com.binary.tree;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    public TreeNode(int data){
        this.data = data;
    }
}

public class BinaryTree {

    TreeNode root;

    public void insert(int data){
        root = insertRecursion(root,data);
    }

    public TreeNode insertRecursion(TreeNode root, int data){

        if(root == null) {
            root = new TreeNode(data);
        }
        else if(data<root.data){
            root.left = insertRecursion(root.left,data);
            }
        else if(data > root.data){
            root.right = insertRecursion(root.right,data);
        }
    return root;
    }

    public void inorder(){
            inorderRec(root);
    }
    public void inorderRec(TreeNode root){

        if(root != null){
            inorderRec(root.left);
            System.out.print(root.data +" ");
            inorderRec(root.right);
        }
    }
}
