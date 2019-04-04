import java.util.*;
public class Main {

	
	public static void main(String args[])
	{
		ArrayList<Integer> r;
	ArrayList<Integer> c;
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int z=0;z<t;z++)
		{
		int row=sc.nextInt();
		int col=sc.nextInt();
		r=new ArrayList<>(row*col);
		c=new ArrayList<>(row*col);
		int DataSize=(-1);
		String grid[]=new String[row];
		int dist[]=new int[(row+col-2)];
		for(int i=0;i<row;i++)
		{
			grid[i]=sc.next();
			for(int j=0;j<col;j++)
			{
				//System.out.print("inside loop");
				if(grid[i].charAt(j)=='1')
				{
					DataSize+=1;
					//System.out.print(DataSize);
					//list[DataSize].row=i;
					r.add(i);
					c.add(j);
				}
			}
					
		}
		/*for(long i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				//System.out.print("inside loop");
				if(grid[i].charAt(j)=='1')
				{
					DataSize+=1;
					//System.out.print(DataSize);
					//list[DataSize].row=i;
					r.add(i);
					c.add(j);
					
					
				}
			}*/
		
		for(int i=0;i<DataSize;i++)
		{
			for(int j=i+1;j<=DataSize;j++)
			{
				long temp=(Math.abs(r.get(i)-r.get(j)))+(Math.abs(c.get(i)-c.get(j)));
				dist[(int)(temp-1)]+=1;
			}
			
		}
		
		for(long i:dist)
		{
			System.out.print(i+" ");
		}
		}
			/*long n=sc.nextInt();
			long ar[]=new long[(int)n];
			for(long j=0;j<n;j++)
			{
				ar[(int)j]=sc.nextInt();
			}
			String ans=answer(ar);
			System.out.println(ans);*/
		
	}

	
}
