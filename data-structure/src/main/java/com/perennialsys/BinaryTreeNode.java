package com.perennialsys;

public class BinaryTreeNode {
    private int key;
    BinaryTreeNode left;
    BinaryTreeNode right;

    public BinaryTreeNode(int key){
        this.key = key;
    }

    public void setKey(int key){
        this.key = key;
    }
    public int getKey(){
        return key;
    }
}
