import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class CountWords {
	public static void main(String args[])throws IOException

	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line=br.readLine();
		int counter=0;
		for(int i=0;i<line.length();i++)
		{
			String test=line.charAt(i)+"";
			while(!test.equals("\0"))
			{
		if(test.equals(" ") || test.equals("\n")||  test.equals("\t"))	
		{
			counter++;
		}
		
		}
		counter++;
		System.out.println(counter);
		}
		
	}
}
