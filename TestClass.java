import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class TestClass {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		// TODO Auto-generated method stub
		String a="name";
		String b = "is";
		String c ="emansi";
		String d ="eman";
		String e= "si";
		int sum1=0,sum2=0,sum3=0;
		char[] array1= a.toCharArray();
		char[] array2= b.toCharArray();
		char[] array3= c.toCharArray();
		
		for(int i=0;i<array1.length;i++)
			sum1=sum1 + (int)array1[i];
		for(int i=0;i<array2.length;i++)
			sum2=sum2 + (int)array2[i];
		for(int i=0;i<array3.length;i++)
			sum3=sum3 + (int)array3[i];
		
		
		/*System.out.println(a.hashCode()%13);
		System.out.println(b.hashCode()%13);
		System.out.println(c.hashCode()%13);
		System.out.println(d.hashCode()%13);
		System.out.println(e.hashCode()%13);*/
		System.out.println(sum1%3);
		System.out.println(sum2%3);
		System.out.println(sum3%3);
		
	}

}
