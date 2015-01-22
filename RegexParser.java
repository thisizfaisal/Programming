import java.io.IOException;
import java.util.Stack;
/*

public class RegexParser {
public static void main(String args[])throws IOException
{
	match("a*b0","aaab0");
}

public static boolean match(String first, String second)
{int i=0,j=0;
    // If we reach at the end of both strings, we are done
    if (first.charAt(i) == '0' && second.charAt(i) == '0')
        return true;
 System.out.println(first.charAt(i));
    // Make sure that the characters after '*' are present in second string.
    // This function assumes that the first string will not contain two
    // consecutive '*'
    if (first.charAt(i) == '*' && first.charAt(i+1) != '0' && second.charAt(i) == '0')
        return false;
 
    // If the first string contains '?', or current characters of both
    // strings match
    if (first.charAt(i) == '?' || first.charAt(i) == second.charAt(i))
        return match(String.valueOf(first.charAt(i+1)), String.valueOf(second.charAt(i+1)));
 
    // If there is *, then there are two possibilities
    // a) We consider current character of second string
    // b) We ignore current character of second string.
    if (first.charAt(i) == '*')
        return match(String.valueOf(first.charAt(i+1)), String.valueOf(second.charAt(i))) || match(String.valueOf(first.charAt(i)), String.valueOf(second.charAt(i+1)));
    
    return false;
}

}
*/





public class RegexParser {
	public static void main(String args[]) throws IOException {
		 System.out.printf("%s %s: %b\n", "abc", "abc", match("abc","ac+"));
	}

	public static boolean match(String s, String matcher) {
		if (s == null || matcher == null) {
			return false;
		}

		if (matcher.equals("*")) {
			return true;
		}

		return match(s, matcher, 0, 0);
	}

	private static boolean match(String s, String matcher, int sp, int mp) {
		boolean matchAny = false;

		while (sp < s.length() && mp < matcher.length()) {
			if (matchAny) {
				if (matcher.charAt(mp) == s.charAt(sp)) {
					if (match(s, matcher, sp, mp)) {
						return true;
					} else {
						sp++;
					}
				} else {
					sp++;
				}
			} else if (matcher.charAt(mp) == '.') {
				sp++;
				mp++;
			} else if (matcher.charAt(mp) == '*') {
				mp++;
				matchAny = true;
			} else if (matcher.charAt(mp) == '+') {
				mp++;
				sp++;
				matchAny = true;
			} else {
				if (matcher.charAt(mp) != s.charAt(sp)) {
					return false;
				} else {
					sp++;
					mp++;
				}
			}
		}

		if (matchAny || mp != matcher.length()) {
			boolean eatAll = true;

			while (mp < matcher.length()) {
				if (matcher.charAt(mp++) != '*') {
					eatAll = false;
					break;
				}
			}

			return eatAll;
		}

		if (sp != s.length()) {
			return false;
		}

		return true;
	}
}