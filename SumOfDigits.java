import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/* BrowserStack Interviews
 * Write a program that accepts a number n (in the range 1 to 2000) and outputs
 * the sum of all the digits in the decimal representation of n!.
 *  For example: if n is 10, n! = 10! = 3628800. 
 *  The output should be 27 in this case.

Sample Input: 9
Sample Output: 27 */

public class SumOfDigits {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		int sum=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int fact = Factorial.factorial(n);
		String temp = Integer.toString(fact);
		int[] factArray = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++)
		{
			factArray[i] = temp.charAt(i) - '0';
			
			if(factArray[i]!=0){
				sum=sum + factArray[i];
			}
		}
		
		System.out.println(sum);

	}

}
