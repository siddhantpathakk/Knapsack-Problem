package ExampleClass;

public class knapsack {
	
	public static void BoundedKnapsack (int [] w, int [] p, int C, int n)
	{
		System.out.println("--------------------------------------------------");
		System.out.println("The problem is P("+n+","+C+") : Bounded Knapsack");
		
		long startTime = System.nanoTime();

		int r=1;
		int c;
		int [][] profit = new int [C+1][n+1];
		
		for (c = 0; c<=n; c++)
			profit[0][c]=0;
		
		for (r=1; r<=C; r++)
			profit[r][0]=0;
		
		for (r=1;r<=C;r++)
		{
			for(c=1;c<=n;c++)
			{
				profit[r][c] = profit[r][c-1];
				
				if (w[c-1]<=r)
				{
					if (profit[r][c]< (profit[r-w[c-1]][c-1] + p[c-1]))
					{
						profit[r][c]=profit[r-w[c-1]][c-1] + p[c-1];
					}
				}
			}
		}
		long endTime = System.nanoTime();
		long timeElapsed = endTime - startTime;
		
		System.out.println("The solution is "+ profit[C][n]);
		System.out.println("Execution time in seconds: " + (double)timeElapsed / 1000000000);
	}
	
	public static void UnboundedKnapsack (int [] w, int [] p, int C, int n)
	{
		System.out.println("--------------------------------------------------");
		System.out.println("The problem is P("+n+","+C+") : Unbounded Knapsack");
		
		long start = System.nanoTime();
		
		int r, c;
		int soln[] = new int[C+1];
         
        for(r = 0; r <= C; r++)
        {
            for(c = 0; c < n; c++)
            {
                if(w[c] <= r)
                {
                	if(soln[r] < soln[r - w[c]]+ p[c])
                	{
                		soln[r] = soln[r - w[c]]+ p[c];
                	}
                }
            }
        }        
		long end = System.nanoTime();
		long timeElapsed = end - start;
		
		System.out.println("The solution is "+ soln[C]);
		System.out.println("Execution time in seconds: " + (double)timeElapsed / 1000000000);
	}
}
