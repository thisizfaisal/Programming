import java.util.HashMap;


public class StringMapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a= "ghij";
		String b = "abcd";
		boolean flag =false;
		HashMap h = new HashMap();
		for(int i=0;i<a.length();i++){
			if(!h.containsKey(b.charAt(i))){
				h.put(b.charAt(i),a.charAt(i));
				
			}
			else{
				flag = true;
			}
			
			
		}
		if(flag==true)
			System.out.println("Cannot map");
		
		else
			System.out.println("Can map");

	}

}
