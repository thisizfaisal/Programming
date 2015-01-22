import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class Palindrome {
public static void main(String args[])throws IOException
{
	int i;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the string");
	String original=br.readLine();
	String reverse="";
	original=original.replaceAll("\\s","");
	original=original.toLowerCase();
	System.out.println(original);
	
	for(i=original.length()-1;i>=0;i--)
	{
		reverse=reverse+original.charAt(i);
	}
	if(original.equalsIgnoreCase(reverse))
	{
		System.out.print("String is plaindrome");
	}
else
{
	System.out.print("String is not a plaindrome");
}

	
/*	StringBuffer in=new StringBuffer(original);
	if(original.equals(in.reverse().toString()));
	{
		System.out.println("Palindrome");
	}
	*/
}
}