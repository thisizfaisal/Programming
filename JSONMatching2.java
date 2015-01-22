/*

Given two JSON objects, find the values of fields. whose values are different.
Eg. Input
{"Geeks":"Test1","Are":"hey","Cool":"yeah"}
{"Geeks":"Test1","Are":"20","Cool": ['B','C'] }

Answer should be as follows ..
Ans: Are:Cool

  
 */


import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class JSONMatching2 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		String json1=in.nextLine();
		String json2=in.nextLine();
		JSONParser parser = new JSONParser();
		
		try {
			Object obj=parser.parse(json1);
			Object obj2=parser.parse(json2);
			
			/*JSONArray array=(JSONArray)obj;
			Iterator<String> iterator = array.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}*/
			
			JSONObject jsonObj=(JSONObject)obj;
			JSONObject jsonObj2=(JSONObject)obj2;
			
			Set set = jsonObj.keySet();
			Iterator<?> keys = set.iterator();
					 while( keys.hasNext() ){
						 System.out.println(jsonObj.get(keys.next()));
					 }
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
