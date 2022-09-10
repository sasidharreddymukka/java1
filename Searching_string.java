package Ds;

public class Searching_string {
  public static void main(String[] args) {
	

	String s="sasidhar";
	String sub="ddy";
	int count=0;
	find(s,sub,count);

  }
  public static String find(String s,String sub,int count) {
	    for (int i = 0; i < s.length(); i++) {
	        if (s.charAt(i) == sub.charAt(count)) {
	            count++;
	        } else {
	            count = 0;
	        }
	        if (count == sub.length()) {
	            System.out.println("Sub String is present in given String: "+sub);
	        }
	        else
	        {
	        	System.out.println("Sub String is not present in given String: "+sub);
	        }
             
	    }
	    
		return sub;  
  

  }
}
