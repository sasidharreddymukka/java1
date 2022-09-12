package Assigment_4;

public class Fibno {
	public static void main(String[]args) {
		int f=1,s=1,n=7 ,temp;
		System.out.println("first"+f);
		System.out.println("second"+s);
		for(int i=3;i<=n;i++) {
			 temp=f+s;
			 System.out.println(temp);
			 f=s;
			 s=temp;

		
		}
	}

}
