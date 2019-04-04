import java.util.*;
public class DFS {
	
	static int V = 5; 
	static Graph<Integer> graph= new Graph(V); 
	static boolean visited[]=new boolean[graph.V];
	public static void dfs(Graph g, int vertex)
	{
		System.out.print(vertex+" ");
		visited[vertex]=true;
		Iterator<Integer> itr=g.adjList[vertex].listIterator();
		while(itr.hasNext())
		{
			int n=itr.next();
			if(visited[n]==false)
			{
				dfs(g,n);
			}
		}
	}
	public static void main(String ats[])
	{
		
        
        addEdge(graph, 0, 1); 
        addEdge(graph, 0, 4); 
        addEdge(graph, 1, 2); 
        addEdge(graph, 1, 3); 
        addEdge(graph, 1, 4); 
        addEdge(graph, 2, 3); 
        addEdge(graph, 3, 4); 
       
        // print the adjacency list representation of  
        // the above graph 
        print(graph); 
        dfs(graph,0);
        
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
	
	public static void print(Graph g)
	{
		for(int i=0;i<g.V;i++)
		{
			System.out.print(i+"-->");
			ListIterator<Integer> j=g.adjList[i].listIterator();
			while(j.hasNext())
			{
				System.out.print(j.next()+" "); 
            } 
            System.out.println(""); 
		}
	}
	

	
}
