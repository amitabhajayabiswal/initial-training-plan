package com.perennialsys;

import java.util.PriorityQueue;


public class App 
{
    public static void main( String[] args )
    {
       // Scanner s = new Scanner(System.in);
 
        int n = 6;
        char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f' };
        int[] charfreq = { 9,5, 12, 13, 16, 45 };

        PriorityQueue<HuffmanNode> pq = new PriorityQueue<>(6, new MyComparator());
        
        for (int i = 0; i < n; i++) {
 
            // creating a Huffman node object
            // and add it to the priority queue.
            HuffmanNode hn = new HuffmanNode();
 
            hn.c = charArray[i];
            hn.data = charfreq[i];
 
            hn.left = null;
            hn.right = null;
 
            // add functions adds
            // the huffman node to the queue.
            pq.add(hn);
        }
        HuffmanNode root = null;
 
        // Here we will extract the two minimum value
        // from the heap each time until
        // its size reduces to 1, extract until
        // all the nodes are extracted.
        while (pq.size() > 1) {
 
            // first min extract.
            HuffmanNode x = pq.peek();
            pq.poll();
 
            // second min extarct.
            HuffmanNode y = pq.peek();
            pq.poll();
 
            // new node f which is equal
            HuffmanNode f = new HuffmanNode();
 
            // to the sum of the frequency of the two nodes
            // assigning values to the f node.
            f.data = x.data + y.data;
            f.c = '-';
 
            // first extracted node as left child.
            f.left = x;
 
            // second extracted node as the right child.
            f.right = y;
 
            // marking the f node as the root node.
            root = f;
 
            // add this node to the priority-queue.
            pq.add(f);
        }
        printCode(root, "");
    }

    public static void printCode(HuffmanNode root, String s){
        if (root.left == null && root.right == null && Character.isLetter(root.c)) {
            // c is the character in the node
            System.out.println(root.c + ":" + s);
            return;
        }
        printCode(root.left, s + "0");
        printCode(root.right, s + "1");
    }

}
