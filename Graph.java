import java.util.*;

public class Graph<T> 
{

	LinkedList<T> adjList[];
	int V;
	
	Graph(int v)
	{
		V=v;
		adjList=new LinkedList[V];
		for(int i=0;i<v;i++)
			adjList[i]=new LinkedList<T>();
	}
}
/*{
		
	HashMap<t, ArrayList<e>> adjList;//=new HashMap<String,LinkedList<String>>();
	
	Graph(){
		//ArrayList<e> te=new ArrayList<>();
		
		adjList=new HashMap<>();
		
	}*/


	
