import java.io.IOException;


public class FizzBuzz {
	public static void main(String args[])throws IOException

	{
		for(int i=1;i<=100;i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.println("FIZZBUZZ");
				
			}
			else if((i%3==0 && i%5!=0))
			{
				System.out.println("FIZZ");
			}
			else if((i%3!=0 && i%5==0))
			{
				System.out.println("BuZZ");
			}
			else
			{
				System.out.println(i);
			}
		}
	}

}
