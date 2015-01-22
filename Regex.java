import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Regex {
	public static final String EXAMPLE_TEST = "This is my small example "
		      + "string which I'm going to " + "use for pattern matching.";

		  public static void main(String[] args) {
		    System.out.println(EXAMPLE_TEST.matches("\\w.*"));
		    String[] splitString = (EXAMPLE_TEST.split("\\s+"));
		    System.out.println(splitString.length);// Should be 14
		    for (String string : splitString) {
		      System.out.println(string);
		    }
		    // Replace all whitespace with tabs
		    System.out.println(EXAMPLE_TEST.replaceAll("\\s+", "\t"));
		    System.out.println(containsTrue("sssstruess"));
		     
		    System.out.println("Star matches "+(".").matches("(.*)[*$.^](.*)"));
		    
		    String patter="^.+";
		    Pattern pattern = Pattern.compile("(.*)"+patter+"(.*)");
		    Pattern pattern2 = Pattern.compile(patter);
//		    /System.out.println(patter.matches(".**.*"));
		    Matcher matcher = pattern2.matcher("");
		    if (matcher.find()) {
		    	System.out.println("Matched");
		    }
		    else
		    {
		    	System.out.println("Not Matched");
		    }
		    
		    String grouping="(\\w)(\\s+)([\\.,])";
		    System.out.println(("Hello .World").replaceAll(grouping, "$1$3"));
		    
		  }
		  
		  
		  
		  public static boolean containsTrue(String s){
			    return s.matches(".*true.*");
			  }
}
