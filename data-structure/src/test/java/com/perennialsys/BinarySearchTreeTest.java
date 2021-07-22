package com.perennialsys;

import org.junit.Test;

public class BinarySearchTreeTest {
    @Test
    public void BSTTest(){
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(20);
        bst.insert(10);
        bst.insert(30);
        bst.insert(40);
        bst.insert(50);
        bst.insert(60);
        bst.insert(70);
        bst.insert(30);
        bst.inorderTraversal();
        bst.search(40);
    }
}
