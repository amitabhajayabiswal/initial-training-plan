package com.perennialsys;

public class BinarySearchTree {

    BinaryTreeNode rootNode, elementNode;

    void insert(int key){
        elementNode = createNode(key);
        if(rootNode == null){
            rootNode = elementNode;
        }
        else{
            insert(rootNode, elementNode);
        }
    }    

    void insert(BinaryTreeNode node, BinaryTreeNode elementNode){
        
        if(node.getKey() > elementNode.getKey()){
            if(node.left == null){
                node.left = elementNode;
            }
            else{
                insert(node.left, elementNode);
            }
        }
        else{
            if(node.right == null){
                node.right = elementNode;
            }
            else{
                insert(node.right, elementNode);
            }
        }
    }

    BinaryTreeNode createNode(int key){
        return new BinaryTreeNode(key);
    }

    public void inorderTraversal(){
        inorderTraversal(rootNode);
    }

    public void inorderTraversal(BinaryTreeNode rootNode){
        if(rootNode != null){
            inorderTraversal(rootNode.left);
            System.out.println(rootNode.getKey());
            inorderTraversal(rootNode.right);
        }
    }

    public void search(int element){
        search(rootNode, element);
    }

    public void search(BinaryTreeNode rootNode, int element){
        if(rootNode.getKey() == element){
            System.out.println("Found the element");
        }else if(rootNode.getKey() < element && rootNode.right != null){
            search(rootNode.right, element);
        }
        else if(rootNode.getKey() > element && rootNode.left != null){
            search(rootNode.left, element);
        }
        else{
            System.out.println("No Element found");
        }
    }
}
