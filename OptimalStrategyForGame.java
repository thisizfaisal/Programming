/*
 * http://www.geeksforgeeks.org/dynamic-programming-set-31-optimal-strategy-for-a-game/
 * 
 * Consider a row of n coins of values v1 . . . vn, where n is even. We play a game against an opponent
 *  by alternating turns. In each turn, a player selects either the first or last coin from the row, 
 *  removes it from the row permanently, and receives the value of the coin. Determine the maximum possible
 *   amount of money we can definitely win if we move first.

Note: The opponent is as clever as the user.

Let us understand the problem with few examples:

    1. 5, 3, 7, 10 : The user collects maximum value as 15(10 + 5)

    2. 8, 15, 3, 7 : The user collects maximum value as 22(7 + 15)

Does choosing the best at each move give an optimal solution?
 * 
 */
public class OptimalStrategyForGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {8, 15, 3, 7};
		int n=arr1.length;
		int answer = OptimalStrategy(arr1,n);
		System.out.println(answer);

	}

	static int OptimalStrategy(int[] array, int n){
		 // Create a table to store solutions of subproblems
	    int table[][]= new int[n][n], gap, i, j, x, y, z;
	 
	    // Fill table using above recursive formula. Note that the table
	    // is filled in diagonal fashion (similar to http://goo.gl/PQqoS),
	    // from diagonal elements to table[0][n-1] which is the result.
	    for (gap = 0; gap < n; ++gap)
	    {
	        for (i = 0, j = gap; j < n; ++i, ++j)
	        {
	            // Here x is value of F(i+2, j), y is F(i+1, j-1) and
	            // z is F(i, j-2) in above recursive formula
	            x = ((i+2) <= j) ? table[i+2][j] : 0;
	           
	            y = ((i+1) <= (j-1)) ? table[i+1][j-1] : 0;
	            z = (i <= (j-2))? table[i][j-2]: 0;
	 
	            table[i][j] = Math.max(array[i] + Math.min(x, y), array[j] + Math.min(y, z));
	            
	        }
	    }
	 
	    return table[0][n-1];
		
		
	}
	
	// Utility functions to get maximum and minimum of two intgers
	int max(int a, int b)  {    return a > b ? a : b;  }
	int min(int a, int b)  {    return a < b ? a : b;  }
}
