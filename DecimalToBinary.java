import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class DecimalToBinary {
public static void main(String args[])throws IOException
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int n=Integer.parseInt(br.readLine());
	int a[]=new int[10];
	int i=0;
	while(n!=0)
	{
		i++;
		a[i]=n%2;
		n=n/2;
		
		
	}
	for(int j=i;j>=1;j--)
	{
		System.out.print(a[j]);
	}
}
}
