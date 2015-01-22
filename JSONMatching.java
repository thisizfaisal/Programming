/*

Given two JSON objects, find the values of fields. whose values are different.
Eg. Input
{"Geeks":"Test1","Are":"hey","Cool":"yeah"}
{"Geeks":"Test1","Are":"20","Cool": ['B','C'] }

Answer should be as follows ..
Ans: Are:Cool

  
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;



public class JSONMatching {
	
	public static void main(String args[])throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String json1=br.readLine();
		String json2=br.readLine();
		HashMap hm1=new HashMap();
		HashMap hm2=new HashMap();
		
		StringTokenizer st=new StringTokenizer(json1,"{,}");
		while (st.hasMoreTokens()) {
			String val = st.nextToken().trim();
			val = val.replaceAll("\\{+|\\}+|\\\"+", "");
			// Split the string at the underscore and do some stuff
		//	String hashMapSplit[] = val.split(":");
			System.out.println(val);
		//	hm1.put(hashMapSplit[0], hashMapSplit[1]);
			}
		
		StringTokenizer st2=new StringTokenizer(json2,"[,]");
		while (st2.hasMoreTokens()) {
			String val2 = st2.nextToken().trim();
			val2 = val2.replaceAll("\\{+|\\}+|\\\"+", "");
			// Split the string at the underscore and do some stuff
			//String hashMapSplit2[] = val2.split(":");
			System.out.println(val2);
			//hm2.put(hashMapSplit2[0], hashMapSplit2[1]);
			}
		
	}

}
