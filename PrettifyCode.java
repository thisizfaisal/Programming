/*Code to prettify JSON
 * 
 */
import java.io.*;
import java.util.*;

class PrettifyCode{
	 
	public static void main (String[] args) {
 
		String s;
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		//System.out.println(s);
		StringBuilder sb=new StringBuilder();
		int len=s.length();
		//System.out.println(len);
		int i=0;
		while(i<len){
			//System.out.println(s.charAt(i)+" len "+i);
			if(s.charAt(i)=='{'){
				sb.append('{');
				sb.append('\n');
			}else if(s.charAt(i)=='}'&& (i+1)<len && s.charAt(i+1)==',' ){
				sb.append('\n');
				sb.append("},");
				sb.append('\n');
				i++;
			}else if(s.charAt(i)=='}'){
				sb.append('\n');
				sb.append("}");
				sb.append('\n');
			}else if(s.charAt(i)==','&& (i+1)<len && s.charAt(i+1)=='"' && s.charAt(i-1)=='"'){
				System.out.println("Entered");
				sb.append(',');
				sb.append('\n');
			}else if(s.charAt(i)==','){
				sb.append(',');
			}else{
				sb.append(s.charAt(i));
			}
 
 
			++i;
		}
 
		System.out.println(sb);
 
	}
 
}
