package com.perennialsys;

import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class LRUCache {
    
    private Deque<Integer> doubleQueue;
    private HashSet<Integer> hashSet;
    private final int CACHE_SIZE;

    public LRUCache(int cache){
        doubleQueue = new LinkedList<Integer>();
        hashSet = new HashSet<>();
        CACHE_SIZE = cache;
    }

    public void refer(int page) {
        if (!hashSet.contains(page)) {
            if (doubleQueue.size() == CACHE_SIZE) {
                int last = doubleQueue.removeLast();
                hashSet.remove(last);
            }
        }
        else {/* The found page may not be always the last element, even if it's an
               intermediate element that needs to be removed and added to the start
               of the Queue */
            doubleQueue.remove(page);
        }
        doubleQueue.push(page);
        hashSet.add(page);
    }
 
    // display contents of cache
    public void display() {
        Iterator<Integer> itr = doubleQueue.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}
