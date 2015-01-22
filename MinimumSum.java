import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * given an array of positive integers and that you are allowed to change the 
 * sign of any of the integers whenever you require.
 * write a program to calculate the minimum sum of this array. 
the sum should be >=0. 
 * 
 * 
 * Algorithm: 
1. Sort given array (say, in ascending order) ( Time: nlogn ) 
2. Loop once through array and find total sum - ( Time: n ) 
3. Start from right most element - ( Time: n ) 
4. See if current element can be made negative (for i = n - 1 to 0, both inclusive )
 */
public class MinimumSum {
	public static void main(String srgs[])throws IOException
	{
		int totalsum=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int a[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(br.readLine());
			totalsum=totalsum+a[i];	
		}
		
		for (int i = n - 1; i >= 0; --i ) {
			int element = a[i];
			int min_sum = totalsum - 2 * element;
			if ( min_sum >= 0 ) {
				a[i] = element * -1;
				totalsum = min_sum;
			}
			if ( min_sum == 0 ) break; // early termination
		}
		System.out.println(totalsum);//1, 2, 3, 4, 5, 6, 9
		
	}

}
