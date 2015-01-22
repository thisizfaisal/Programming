import java.io.IOException;
import java.util.HashMap;
import java.util.Map;




public class TwoWordsAnagrams {
public static void main(String args[])throws IOException
{
	String s1="malayalam";
	String s2="malayalam";
	if(s1.length() != s2.length())
	{
		System.out.println("not anagrams");
	}
	
	
	
 HashMap[] hm=new HashMap[26];
	char[] c1=s1.toCharArray();
	char[] c2=s2.toCharArray();
	
	
	
	int count[]=new int[200];
	//count[c1[0]]++;
	//System.out.println(count[c1[0]]);
	for(int i=0;i<s1.length();i++)
	{
		//hm[Integer.parseInt(s1.charAt(i))]++;
		
		count[c1[i]-96]++;
		
	}
	
	for(int i=0;i<s2.length();i++)
	{
		//hm[Integer.parseInt(s1.charAt(i))]++;
		count[c2[i]-96]--;
		System.out.println(count[c2[i]-96]);
	}
	
	for(int i=0;i<s2.length();i++)
	{
		//hm[Integer.parseInt(s1.charAt(i))]++;
		if(count[i]!=0)
		{
			System.out.println("Not an anagram");
			break;
		}
		else
		{
			System.out.println("anagram");
		}
	}
	
}
}
