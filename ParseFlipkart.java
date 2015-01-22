import java.io.IOException;
import java.util.ListIterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ParseFlipkart {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		//String bookIsbn = "9780070264984";
		
		//String fkPrice = getFlipkartPrice(bookIsbn);
		//System.out.println("Flipkart Price of " + bookIsbn + ": \n" + fkPrice);
		
		String productDetails = getFlipkartProduct("wallet");
		//System.out.println("Product Details "+productDetails);

	}

	/*
	private static String getFlipkartPrice(String bookIsbnNo)
			throws IOException {
		String baseUrl = "http://www.flipkart.com/books/pr?sid=bks&q=" + bookIsbnNo
				+ "";
		String fkPrice = null;
		Document doc = Jsoup.connect(baseUrl).timeout(0).get();
		fkPrice = doc.select("span.selling-price omniture-field")
				.text();
		return fkPrice;
	}*/
	
	private static String getFlipkartProduct(String productName)throws IOException{
		String productDetails="";
		String baseUrl = "http://www.flipkart.com/search?&as=off&as-show=off&otracker=start&q=" + productName;
		Document doc = Jsoup.connect(baseUrl).timeout(0).get();
		Elements productNames=doc.select("div.product-unit")
			.select("div.pu-details")
			.select("div.pu-title")
			.select("a");
		Elements productPrices=doc.select("div.product-unit")
				.select("div.pu-details")
				.select("div.pu-price")
				.select("div.pu-border-top")
				.select("div.pu-final")
				.select("span.fk-font-17");
		
		/*
		for(int i=0;i<productPrices.size();i++){
			System.out.println("Name: "+productNames.get(i).text());
			System.out.println("Price: "+productPrices.get(i).text());
		}
		*/
		
		
		for (Element name : productNames) {
			System.out.println(name.text());
		}
		
		for (Element prices : productPrices){
			System.out.println(prices.text());
		}
		
		return productDetails;
	}

}
