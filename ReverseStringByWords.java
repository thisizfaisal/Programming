import java.io.IOException;
import java.util.Stack;
import java.util.StringTokenizer;


public class ReverseStringByWords {
	public static void main(String args[])throws IOException

	{
	String test = "I am awesome";
	Stack  stack = new Stack();
	StringTokenizer strTok = new StringTokenizer(test);

	while(strTok.hasMoreTokens()) {
	    stack.push(strTok.nextElement());
	}
	StringBuffer revStr = new StringBuffer();
	while(!stack.empty()) {
	    revStr.append(stack.pop());
	    revStr.append(" ");
	}
	System.out.println("Original string: " + test);
	System.out.println("\nReversed string: " + revStr);
}
}