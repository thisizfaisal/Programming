/*
 * Given a string find the number of meaningful words(which add to original length of the string) which
 *  could be formed from the string (A function called isWord() was provided which had tell you if the 
 *  word was a dictionary word.
for eg. programmerit forms:
pro+gram+merit
program+merit
programmer+it
pro+grammer+it
 * 
 */
public class WordBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = wordBreak("ilike");
		System.out.println(flag);

	}

	
	//Recursive solution
	public static boolean wordBreak(String str)
	{
	    int size = str.length();
	 
	    // Base case
	    if (size == 0)  return true;
	 
	    // Try all prefixes of lengths from 1 to size
	    for (int i=1; i<=size; i++)
	    {
	        // The parameter for dictionaryContains is str.substr(0, i)
	        // str.substr(0, i) which is prefix (of input string) of
	        // length 'i'. We first check whether current prefix is in
	        // dictionary. Then we recursively check for remaining string
	        // str.substr(i, size-i) which is suffix of length size-i
	        if (dictionaryContains( str.substring(0, i) ) &&
	            wordBreak( str.substring(i, size-i) ))
	            return true;
	    }
	 
	    // If we have tried all prefixes and none of them worked
	    return false;
	}
	
	static boolean dictionaryContains(String word)
	{
	    String dictionary[] = {"mobile","samsung","sam","sung","man","mango",
	                           "icecream","and","go","i","like","ice","cream"};
	    int size = dictionary.length;
	    for (int i = 0; i < size; i++)
	        if (dictionary[i].compareTo(word) == 0){
	           
	           return true;
	        }
	    return false;
	}
}
