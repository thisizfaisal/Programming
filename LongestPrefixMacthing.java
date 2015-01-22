/*
 * http://www.geeksforgeeks.org/longest-prefix-matching-a-trie-based-solution-in-java/
 * 
 * Given a dictionary of words and an input string, find the longest prefix of the string which is also
 *  a word in dictionary.

Examples:

Let the dictionary contains the following words:
{are, area, base, cat, cater, children, basement}

Below are some input/output examples:
--------------------------------------
Input String            Output
--------------------------------------
caterer                 cater
basemexy                base
child                   < Empty >
 * 
 */


public class LongestPrefixMacthing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Trie dict = new Trie();        
        dict.insert("are");
        dict.insert("area");
        dict.insert("base");
        dict.insert("cat");
        dict.insert("cater");        
        dict.insert("basement");
        dict.insert("browser");
        dict.insert("con");
        
        String input = "fon";
        System.out.print(input + ":   ");
        System.out.println(dict.getMatchingPrefix(input)); 
	}

}
