import java.io.IOException;


public class QuickSort {
	private int[] numbers={15,23,4,5,7,9};
	  private int number;
public static void main(String args[])throws IOException
{
	int a[]={15,23,4,5,7,9};
	int n=a.length;
	//System.out.println("doing");
	quick(a,0,n-1);
	
	for(int i=0;i<n;i++)
	{
		//System.out.println(i);
	System.out.println(a[i]);
	}
}
static void quick(int a[],int low,int high)
{
int i=low;
int j=high;	
int pivot=a[low+(high-low)/2];
while(i<=j)
{
	/*  In each iteration, we will identify a number from left side which * is greater then the pivot value,
	 *  and also we will identify a number * from right side which is less then the pivot value. 
	 *  Once the search * is done, then we exchange both numbers. */
	while(a[j]>pivot)j--;
	if(i<=j)
	{
		exchange(a,i,j);
		i++;
		j--;
	}}
	//System.out.println("doing");
	if(low<j)
		quick(a,low,j);
	if(i<high)
		quick(a,i,high);
	

}
static void exchange(int a[],int i,int j)
{
	int temp=a[i];
	a[i]=a[j];
	a[j]=temp;
}
}
