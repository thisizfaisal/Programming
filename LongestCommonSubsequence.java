/*
 * 
 * LCS Problem Statement: Given two sequences, find the length of longest subsequence present
 *  in both of them. A subsequence is a sequence that appears in the same relative order, but not
 *   necessarily contiguous. For example, “abc”, “abg”, “bdf”, “aeg”, ‘”acefg”, .. etc are 
 *   subsequences of “abcdefg”. So a string of length n has 2^n different possible subsequences.
 *   
 *   Algorithm
 *   
 *   Let the input sequences be X[0..m-1] and Y[0..n-1] of lengths m and n respectively.
 *    And let L(X[0..m-1], Y[0..n-1]) be the length of LCS of the two sequences X and Y. 
 *    Following is the recursive definition of L(X[0..m-1], Y[0..n-1]).

If last characters of both sequences match (or X[m-1] == Y[n-1]) then
L(X[0..m-1], Y[0..n-1]) = 1 + L(X[0..m-2], Y[0..n-2])

If last characters of both sequences do not match (or X[m-1] != Y[n-1]) then
L(X[0..m-1], Y[0..n-1]) = MAX ( L(X[0..m-2], Y[0..n-1]), L(X[0..m-1], Y[0..n-2])
 *   
 *   Time Complexity of the below implementation is O(mn)
 *    
 *   Tabulated implementation for the LCS problem.
 */

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char X[] = "AGGTAB".toCharArray();
		  char Y[] = "GXTXAYB".toCharArray();
		 int length =  lcs(X,Y,X.length,Y.length);
		 System.out.println(length);

	}

	
	
	/* Returns length of LCS for X[0..m-1], Y[0..n-1] */
	static int lcs( char[] X, char[] Y, int m, int n )
	{
	   int[][] L= new int[m+1][n+1];
	   int i, j;
	  
	   /* Following steps build L[m+1][n+1] in bottom up fashion. Note 
	      that L[i][j] contains length of LCS of X[0..i-1] and Y[0..j-1] */
	   for (i=0; i<=m; i++)
	   {
	     for (j=0; j<=n; j++)
	     {
	       if (i == 0 || j == 0)
	         L[i][j] = 0;
	  
	       else if (X[i-1] == Y[j-1])
	         L[i][j] = L[i-1][j-1] + 1;
	  
	       else
	         L[i][j] = max(L[i-1][j], L[i][j-1]);
	     }
	   }
	    
	   /* L[m][n] contains length of LCS for X[0..n-1] and Y[0..m-1] */
	   return L[m][n];
	}
	
	static /* Utility function to get max of 2 integers */
	int max(int a, int b)
	{
	    return (a > b)? a : b;
	}
}
