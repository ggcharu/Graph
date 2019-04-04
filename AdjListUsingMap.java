import java.util.*;

public class AdjListUsingMap
{
	AdjListUsingMap()
	{
		
	}
	
	public <T,E> void addEdge(Graph g, T key, E data, boolean t)
	{
		if(!g.adjList.containsKey(key))
		{
			ArrayList<E> =new ArrayList<>();
			.add(data);
		}
		else
		{
			g.adjList.put(key,);
			if(t==true)
			{
				g.adjList.put(data, key);
			}
		
	}
	static void print(Graph g)
	{
		System.out.println(g.adjList);
	
}
	public static void main(String ats[])
	{
		int V = 5; 
        Graph<String,ArrayList<String>> graph = new Graph<>(); 
        AdjListUsingMap ob=new AdjListUsingMap();
        ob.addEdge(graph, "Modi", "Trump",true); 
        ob.addEdge(graph, "Modi", "Yoogi",true); 
        ob.addEdge(graph, "Prabhu", "Modi",true); 
        ob.addEdge(graph, "Putin", "Trump",true); 
        ob.addEdge(graph, "Modi", "Putin",true); 
       
        // print the adjacency list representation of  
        // the above graph 
        print(graph); 
	}
}
