import java.util.*;
public class BFS
{
	static void bfs(Graph g,int s)
	{
		Queue<Integer> q=new LinkedList<>();
		q.add(s);
		//System.out.print(q.peek());
		boolean visited[]=new boolean[g.V];
		for(int i=0;i<g.V;i++)
		{
			
			visited[i]=false;
		}
		//System.out.println("just after forr loop");
		visited[s]=true;
		while(q.size()!=0)
		{
			//System.out.println("Inside while");
			int node=q.peek();
			System.out.println(q.poll()+" ");
		
			for(int i:g.adjList[node])
			{
				if(visited[i]==false)
				{
				//System.out.println(i);
				q.add(i);
				visited[i]=true;
				}
			}
		}
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
	public static void print(Graph g)
	{
		for(int i=0;i<g.V;i++)
		{
			System.out.print(i+"-->");
			for(Integer j:g.adjList[i])
			{
				System.out.print(j+" "); 
            } 
            System.out.println(""); 
		}
	}
}

