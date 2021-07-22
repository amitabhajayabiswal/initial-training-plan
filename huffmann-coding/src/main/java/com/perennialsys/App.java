package com.perennialsys;

import java.util.PriorityQueue;


public class App 
{
    public static void main( String[] args )
    {
 
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
 
            pq.add(hn);
        }
        HuffmanNode root = null;
        while (pq.size() > 1) {
 
            
            HuffmanNode x = pq.peek();
            pq.poll();
 
            HuffmanNode y = pq.peek();
            pq.poll();
 
            HuffmanNode f = new HuffmanNode();
 
            f.data = x.data + y.data;
            f.c = '-';

            f.left = x;
            f.right = y;
            root = f;
            pq.add(f);
        }
        printCode(root, "");
    }

    public static void printCode(HuffmanNode root, String s){
        if (root.left == null && root.right == null && Character.isLetter(root.c)) {
            
            System.out.println(root.c + ":" + s);
            return;
        }
        printCode(root.left, s + "0");
        printCode(root.right, s + "1");
    }

}
