package com.perennialsys;

import java.util.HashMap;
import java.util.LinkedList;

import javax.xml.transform.Source;

public class Graph {
    
    private HashMap<Node, LinkedList<Node>> adjanceyMap;
    private boolean directed;

    public Graph(boolean directed){
        this.directed = directed;
        adjanceyMap = new HashMap<>();
    }

    public void addNode(Node source, Node destination){

        if(!adjanceyMap.keySet().contains(source)){
            adjanceyMap.put(source,null);
        }
        if(adjanceyMap.keySet().contains(destination)){
            adjanceyMap.put(destination, null);
        }

        addEdge(source,destination);
        if (!directed) {
            addEdge(destination, source);
        }
    }
    public void addEdge(Node source, Node destination){
        LinkedList<Node> tmp = adjanceyMap.get(source);

        if(tmp != null){
            tmp.remove(destination);
        }
        else{
            tmp = new LinkedList<>();
        }
        tmp.add(destination);
        adjanceyMap.put(source,tmp);
    }

    public void printEdges() {
        for (Node node : adjanceyMap.keySet()) {
            System.out.print("The " + node.name + " has an edge towards: ");
            if (adjanceyMap.get(node) != null) {
                for (Node neighbor : adjanceyMap.get(node)) {
                    System.out.print(neighbor.name + " ");
                }
                System.out.println();
            }
            else {
                System.out.println("none");
            }
        }
    }

    public boolean hasEdge(Node source, Node destination) {
        return adjanceyMap.containsKey(source) && adjanceyMap.get(source) != null && adjanceyMap.get(source).contains(destination);
    }
}
