package com.practice.interview.bit.fb;

import java.util.Iterator;
import java.util.LinkedList;

public class IsGraphValidTree {

	public static void main(String[] args) {

		Graph g1 = new Graph(5);  
        g1.addEdge(1, 0);  
        g1.addEdge(0, 2);  
        g1.addEdge(0, 3);  
        g1.addEdge(3, 4);  
        if (g1.isTree())  
            System.out.println("Graph is Tree");  
        else
            System.out.println("Graph is not Tree");  
  
        Graph g2 = new Graph(5);  
        g2.addEdge(1, 0);  
        g2.addEdge(0, 2);  
        g2.addEdge(2, 1);  
        g2.addEdge(0, 3);  
        g2.addEdge(3, 4);  
  
        if (g2.isTree())  
            System.out.println("Graph is Tree");  
        else
            System.out.println("Graph is not Tree");  
	}
	
	static class Graph{
	private int V;
	LinkedList<Integer> adjacentList[];
	
	@SuppressWarnings("unchecked") 
	Graph(int d)
	{
		V=d;
		adjacentList=new LinkedList[V];
		for(int i=0;i<V;i++)
			adjacentList[i]=new LinkedList<Integer>();
	}
	void addEdge(int w,int v)
	{
		adjacentList[w].add(v);
		adjacentList[v].add(w);
	}
		
	 boolean isCyclicUtil(int v, boolean visited[], int parent)  
	    {  
	        // Mark the current node as visited  
	        visited[v] = true;  
	        Integer i;  
	  
	        // Recur for all the vertices adjacent to this vertex  
	        Iterator<Integer> it = adjacentList[v].iterator();  
	        while (it.hasNext())  
	        {  
	            i = it.next();  
	  
	            // If an adjacent is not visited, then recur for  
	            // that adjacent  
	            if (!visited[i])  
	            {  
	                if (isCyclicUtil(i, visited, v))  
	                    return true;  
	            }  
	  
	            // If an adjacent is visited and not parent of  
	            // current vertex, then there is a cycle.  
	            else if (i != parent)  
	            return true;  
	        }  
	        return false;  
	    }  
	  
	    // Returns true if the graph is a tree, else false.  
	    boolean isTree()  
	    {  
	        // Mark all the vertices as not visited and not part  
	        // of recursion stack  
	        boolean visited[] = new boolean[V];  
	        for (int i = 0; i < V; i++)  
	            visited[i] = false;  
	  
	        // The call to isCyclicUtil serves multiple purposes  
	        // It returns true if graph reachable from vertex 0  
	        // is cyclcic. It also marks all vertices reachable  
	        // from 0.  
	        if (isCyclicUtil(0, visited, -1))  
	            return false;  
	  
	        // If we find a vertex which is not reachable from 0  
	        // (not marked by isCyclicUtil(), then we return false  
	        for (int u = 0; u < V; u++)  
	            if (!visited[u])  
	                return false;  
	  
	        return true;  
	    }  
	  
	}
	
	
	

}
