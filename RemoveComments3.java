import java.util.Scanner;


public class RemoveComments3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String source = RemoveComments.readFile("test.txt");  
		System.out.println(removeComments(source));

	}
	
	
	public static String removeComments(String code){
	    final int outsideComment=0;
	    final int insideLineComment=1;
	    final int insideblockComment=2;
	    final int insideblockComment_noNewLineYet=3; // we want to have at least one new line in the result if the block is not inline.

	    int currentState=outsideComment;
	    String endResult="";
	    Scanner s= new Scanner(code);
	    s.useDelimiter("");
	    while(s.hasNext()){
	        String c=s.next();
	        switch(currentState){
	            case outsideComment: 
	                if(c.equals("/") && s.hasNext()){
	                    String c2=s.next();
	                    if(c2.equals("/"))
	                        currentState=insideLineComment;
	                    else if(c2.equals("*")){
	                        currentState=insideblockComment_noNewLineYet;
	                    }
	                    else 
	                        endResult+=c+c2;
	                }
	                else
	                    endResult+=c;
	                break;
	            case insideLineComment:
	                if(c.equals("\n")){
	                    currentState=outsideComment;
	                    endResult+="\n";
	                }
	            break;
	            case insideblockComment_noNewLineYet:
	                if(c.equals("\n")){
	                    endResult+="\n";
	                    currentState=insideblockComment;
	                }
	            case insideblockComment:
	                while(c.equals("*") && s.hasNext()){
	                    String c2=s.next();
	                    if(c2.equals("/")){
	                        currentState=outsideComment;
	                        break;
	                    }

	                }

	        }
	    }
	    s.close();
	    return endResult;   
	}

}
