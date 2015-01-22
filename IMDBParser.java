import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.print.attribute.HashAttributeSet;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class IMDBParser {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		String result = getTop250();
	}
	
	private static String getTop250()throws IOException{
		
		String productDetails="";
		String baseUrl = "http://www.imdb.com/chart/top";
		List<String> actorNames = new ArrayList<String>();
		HashMap hm=new HashMap();
		Document doc = Jsoup.connect(baseUrl).timeout(0).get();
		
		Elements movieNames=doc.select("td.titleColumn")
				.select("a");
		
		
		
		for (Element name : movieNames){
			actorNames.add(name.attr("title"));
			hm.put(name.attr("title"), name.text());
			
		}
		
		/*
		for (int i=0;i<movieNames.size();i++) {
			System.out.println("Movie Name: "+movieNames.get(i).text());
			System.out.println("Actor Name: "+actorNames.get(i));
			
		}*/
		
		System.out.println("Enter actor name");
		Scanner in = new Scanner(System.in);
		String searchMovie = in.nextLine();
		
		if(hm.containsKey(searchMovie)){
			System.out.println("Movie found" + hm.get(searchMovie));
		}
		
		else{
			System.out.println("Movie not found");
			
		}
		
		return "";
	}

}
