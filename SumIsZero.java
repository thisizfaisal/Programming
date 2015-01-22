import java.util.HashMap;


public class SumIsZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {-3,-2,1,2,2,2,2,3,4,5};
		HashMap h= new HashMap();
		for(int i=0;i<a.length;i++){
			if(h.containsKey(-a[i])){
				System.out.println("Values are " + a[i] + " and "+-a[i]);
			}
			
			else{
				h.put(a[i], "");
				
			}
			
		}

	}

}
