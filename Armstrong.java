package Assigment_4;

public class Armstrong {
	public static void main(String[]args) {
		int n=153,temp,armstrong=0,original=n;
		while(n>0) {
		 temp =n%10;
		 temp=(int) Math.pow(temp, 3);
		 
		 armstrong=armstrong+temp;
		 n=n/10;
		 }
		 if(armstrong==original) {
			 System.out.println(original+"it is a amstrong number");
			
				 
			
		 }else {
			 System.out.println("it is not armstrong number");
		 }
		 
			 }
	

}
