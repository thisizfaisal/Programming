import java.io.IOException;
import java.util.Scanner;


public class BinaryToDecimal {
public static void main(String args[])throws IOException
{
	Scanner in=new Scanner(System.in);
	int sum=0;
	int n=Integer.parseInt(in.nextLine());
	int k=n-1;
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=Integer.parseInt(in.nextLine());;
	}
	for(int i=0;i<n;i++)
	{
		sum=(int) (sum+ (Math.pow(2, k)*a[i]));
		k--;
	}
	System.out.println(sum);
	System.out.println(Math.pow(2, 0));
	
}
}
