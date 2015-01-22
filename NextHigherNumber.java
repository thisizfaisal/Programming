/*
 * Given a number find the next higher number from the combination of given numbers.

for eg.  3256 ------- 3265
         3265 ------- 5236
         432 --------- error
         
         Algorithm
         
         Starting from the right, you find the first pair-of-digits such that the left-digit is 
         smaller than the right-digit. Let's refer to the left-digit by "digit-x". Find the smallest number
          larger than digit-x to the right of digit-x, and place it immediately left of digit-x. 
          Finally, sort the remaining digits in ascending order - since they were already in descending order,
          all you need to do is reverse them (save for digit-x, which can be placed in the correct place in O(n)).
         
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class NextHigherNumber
{
 public static void main(String args[]) throws IOException
 {
     BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter an integer value");
     NextHigherNumber.big(432);
 }
 static void big(int a)
 {
   String n=a+"";
   char c[]=n.toCharArray();
   for(int i=c.length-1;i>=1;i--)
   {
       if (c[i-1]>c[i])
       {
           continue;
       }
       else
       {
         //swap
           int index=check(c,c[i-1]);
           char temp=c[i-1];
           c[i-1]=c[index];
           c[index]=temp;
           
           Arrays.sort(c,i,c.length);
          
           break;
       }
       
   }print(c);
 }
 static void print(char c[])
 {
     for(int m=0;m<c.length;m++)
           {
           System.out.print(c[m]);
           }
 }
 static int check(char a[],int j)
 {
     int k;
         for( k=a.length-1;k>=0;k--)
         {
           if(a[k]>j)
            break; 
         }    
         return k;
 }
 

}