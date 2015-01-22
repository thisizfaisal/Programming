import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class PairInArrayWithSum {
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(br.readLine());
		}
		/*
		 * METHOD 1 (Use Sorting)
		 * 
hasArrayTwoCandidates (A[], ar_size, sum)
1) Sort the array in non-decreasing order.
2) Initialize two index variables to find the candidate 
   elements in the sorted array.
       (a) Initialize first to the leftmost index: l = 0
       (b) Initialize second  the rightmost index:  r = ar_size-1
3) Loop while l < r.
       (a) If (A[l] + A[r] == sum)  then return 1
       (b) Else if( A[l] + A[r] <  sum )  then l++
       (c) Else r--    
4) No candidates in whole array - return 0
		 * 
		 */
		
//Method 2- Use HashMap
		
	int i,temp,sum=0;
	boolean Map[]=new boolean[100];
	for(i=0;i<n;i++)
	{
		temp=sum-a[i];
		if(temp >= 0 && Map[temp]== true)
	    {
	      System.out.println("Pair with given sum "+ a[i]+"and"+temp);
	    }
	    Map[a[i]] = true;
	}
		
		
	}

}
