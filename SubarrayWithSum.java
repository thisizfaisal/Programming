import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SubarrayWithSum {
	
public static void main(String args[])throws IOException
{
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int n=Integer.parseInt(br.readLine());
	int[] a=new int[n];
	int sum=23;
	for(int i=0;i<n;i++)
	{
		a[i]=Integer.parseInt(br.readLine());	
	}
	/* Initialize curr_sum as value of first element
    and starting point as 0 */
 int curr_sum = a[0], start = 0, i;

 /* Add elements one by one to curr_sum and if the curr_sum exceeds the
    sum, then remove starting element */
 for (i = 1; i <= n; i++)
 {
     // If curr_sum exceeds the sum, then remove the starting elements
     while (curr_sum > sum && start < i-1)
     {
         curr_sum = curr_sum - a[start];
         start++;
     }

     // If curr_sum becomes equal to sum, then return true
     if (curr_sum == sum)
     {
         System.out.println( start+","+(i-1));
         break;
         
     }

     // Add this element to curr_sum
     if (i < n)
       curr_sum = curr_sum + a[i];
 }

 // If we reach here, then no subarray
 System.out.println("No subarray found");//15, 2, 4, 8, 9, 5, 10, 23
 
}
}
