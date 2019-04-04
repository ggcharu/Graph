import java.util.*;
public class dfsTopologicalSort 
{
	static void dfs(int src,Graph g)
	{
		HashMap<String,Integer> visited=new HashMap<String,Integer>();
		
		dfsHelper(g,src,visited);
	}
	static void dfsHelper(Graph g, int node,boolean[] visited )
	{
		visited[node-1]=true;
		for(int neighbours:g.adjList[node-1])
		{
			if(!visited[neighbour-1])
		}
		
	}
	static void addEdge(Graph g,String key,String value)
	{
			g.adjList.put(key,value);
	}
	
	public static void main(String ats[])
	{
		int V = 6; 
        Graph graph = new Graph(V); 
        addEdge(graph, 0, 1); 
        addEdge(graph, 0, 4); 
        addEdge(graph, 1, 2); 
        addEdge(graph, 2, 4);  
        addEdge(graph, 2, 3); 
        addEdge(graph, 3, 4); 
        addEdge(graph, 3, 5);
        // print the adjacency list representation of  
        // the above graph 
        //print(graph); 
        bfs(graph,0);
	}
	static void addEdge(Graph g,int src,int des)
	{
		g.adjList[src].add(des);
			g.adjList[des].add(src);
	
	}
	static void addEdge(Graph g,int src,int des,boolean t)
	{
		g.adjList[src].add(des);
		if(t==true)
			g.adjList[des].add(src);
	}
}

