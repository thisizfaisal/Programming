import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


/* BrowserStack Interview
 * Given a piece of code, the task was to remove all the comments from the code.
 

Eg. Input

int main(){
  // this is a comment
  int i = 1;
  /*
   some more
   comments
  */
/*//Extra comment
  cout<<i;
  cout<<endl; // this is for new line
  return 0;
  // last one
}
Output:

int main(){
  int i = 1;
  cout<<i;
  cout<<endl;
  return 0;
}
*/


public class RemoveComments {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		String source = readFile("test.txt");  
		//BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		//String source2= bufferedReader.readLine();
        System.out.println(source.replaceAll("(?:/\\*(?:[^*]|(?:\\*+[^*/]))*\\*+/)|(?://.*)","")); 
		

	}
	
	public static String readFile(String fileName){
		File file = new File(fileName);    

        char[] buffer = null;    

        try {    
                BufferedReader bufferedReader = new BufferedReader( new FileReader(file));    

                buffer = new char[(int)file.length()];    

                int i = 0;    
                int c = bufferedReader.read();    

                while (c != -1) {    
                    buffer[i++] = (char)c;    
                    c = bufferedReader.read();    
                }    

        } catch (IOException e) {    
            e.printStackTrace();    
        }    

        return new String(buffer);    
	
	}

}
