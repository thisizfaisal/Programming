import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegularExpressionMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		String str="aaaaaannndnnnnnnfffhfhhgjjjwkkkllclc";
		Pattern pat=Pattern.compile("aaaaa*?");
		 Matcher  matcher = pat.matcher(str);
		 int count = 0;
	        while (matcher.find())
	            count++;

	        System.out.println(count);*/
	        
	        String input = "aaaaaannndnnnnnnfffhfhhgjjjwkkkllclc";
	        
	        int index = input.indexOf("aadd");
	        int count = 0;
	        while (index != -1) {
	            count++;
	            input = input.substring(index + 1);
	            index = input.indexOf("aadd");
	        }
	        

	        System.out.println(count);
	}

}
