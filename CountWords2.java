import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CountWords2 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int count = line.split(" ").length;
		System.out.println(count);

	}

}
