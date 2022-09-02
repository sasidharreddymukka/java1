package new_assigment;

public class Qno_4 {
	public static void main(String []args) {
		int k,sum=0,temp,j=123;
		temp=j;
		while (j>0) {
			k=j%10;
			sum=(sum*10)+k;
			j=j/10;
			
		}
		if (temp==sum) {
			System.out.println("is a palindrome");
			
		}
		else {
			System.out.println("not apalindrome");
		}
	}

}
