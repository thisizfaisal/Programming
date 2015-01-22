/*Given an array of n elements which contains elements from 0 to n-1, with any of these numbers appearing 
 * any number of times. Find these repeating numbers in O(n) and using only constant memory space.

For example, let n be 7 and array be {1, 2, 3, 1, 3, 6, 6}, the answer should be 1, 3 and 6.

This problem is an extended version of following problem.
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;


public class FindDuplicates {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int array[]=new int[n];
		for(int i=0;i<n;i++){
			array[i]=Integer.parseInt(br.readLine());
		}
		int arr_size = array.length;
		
		//printRepeating(array,arr_size);
		printRepeatingwithHash(array,arr_size);
	}

	
	public static void printRepeating(int array[],int arr_size){
		
		int i;
		System.out.println("The repeating elements are: \n");
		for (i = 0; i < arr_size; i++)
		  {
		    if (array[Math.abs(array[i])] >= 0)
		      array[Math.abs(array[i])] = -array[Math.abs(array[i])];
		    else
		    	System.out.println(Math.abs(array[i]));
		  }
		
		
	}
	
	public static void printRepeatingwithHash(int array[],int arr_size){
		
		HashMap hs=new HashMap();
		for (int i = 0; i < arr_size; i++){
			if(!hs.containsKey(array[i]))
			hs.put(array[i], "");
			
			else
			System.out.println("Duplicate found for" + array[i]);
			
		}
		
		
	}
}
