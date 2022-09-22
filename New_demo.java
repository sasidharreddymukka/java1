package sasidhar_1;

public class New_demo {
	public static void main(String[]args) {

		//System.out.println(sum(5));
		int res=sum(5);
		System.out.println(res);
	}

	public static int sum(int k) {
		if (k > 0) {
	
			return (k + sum(k - 1));
					}
		else 
		return 0;
				
	}
}
