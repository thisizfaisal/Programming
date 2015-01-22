import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class AngleBetweenClock {
public static void main(String args[])throws IOException

{
	
	Scanner in=new Scanner(System.in);
	String angle=in.nextLine();
	String[] time=angle.split(":");
	int hour=Integer.parseInt(time[0]);
	int mins=Integer.parseInt(time[1]);
	
	float hourangle=(float) (((hour*30)+(mins*0.5))-(mins*6));
	System.out.println(hourangle);
	
}

}
