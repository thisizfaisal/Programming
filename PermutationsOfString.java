
public class PermutationsOfString {
	public  static void main(String args[]) { 
	    permutation("", "abcd"); 
	 }

	 private static void permutation(String prefix, String str) {
		 int n = str.length();
	    if (n == 0) System.out.println(prefix);
	    else {
	        for (int i = 0; i < n; i++){
	           permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
//System.out.println("this1"+prefix + str.charAt(i));
//System.out.println("this2"+str.substring(0, i) + str.substring(i+1, n));
	        }

	    }
	}
}
