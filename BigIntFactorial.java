/* IMPORTANT: class must not be public. */


import java.io.*;
import java.util.*;
import java.math.BigInteger;


class BigIntFactorial {
    public static void main(String args[] ) throws Exception {
        

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        int[] array= new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }
        
        for (int i = 0; i < N; i++) {
           BigInteger factorial = factorial(BigInteger.valueOf(array[i]));
            System.out.println(factorial);
        }

        
    }
    
    static BigInteger factorial(BigInteger n){
      	if(n.equals(BigInteger.valueOf(0))){
      		return BigInteger.valueOf(1);
      		
      	}
      
      	
      	else{
      		return n.multiply(factorial(n.subtract(BigInteger.valueOf(1))));
      	}
      	
      }
}
