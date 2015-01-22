import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/*
 * Consider the following series:
A := 1
B := A*2 + 2
C := B*2 + 3 and so on...
Write a program that:
-outputs the number corresponding to a given letter;
-given a string of letters like 'GREP', computes the sum of the numbers corresponding to all the letters 
in the string (i.e., G + R + E + P), as given by the above series; and
-given a large number (that would fit into a standard 32-bit integer), finds the shortest string of letters 
corresponding to it.
You may use a greedy approach for the last part. Compute the values of the numbers corresponding to letters as 
and when required and DO NOT pre-compute beforehand and store them in a data structure.
 * 
 */
public class AlphabetSeries {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Character");
		String a=br.readLine();
		a=a.toLowerCase();
		char character =a.charAt(0);
		int result = getValue(character);
		System.out.println(result);
		
		
		

	}
	
	static int getValue(char ch){
		if(((int)ch-96) == 1)
			return 1;
		else
		{
			int temp = ch - 1;
			return ((int)ch-96) + getValue((char)temp)*2;	
		}
		
		
			
		
		
	}

}
