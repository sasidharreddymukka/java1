package Ds;

public class BinarySearch_1 {

	public static void main(String[] args) {
	/*	int arr[] = { 21, 31, 41, 51, 61 };
		int n = 61 ;
		int l = 0;
		int h = 4;
		boolean k=false;
		 int mid =0;
			while (l<=h&&!k) {
				System.out.println("low:" + l + "high" + h);
				mid = (l+h)/2;
			
				if (arr[mid] == n) {
					System.out.println("element is found:" + mid);
					k=true;
				} else {
					if (arr[mid] > n) {
						// 41>31
						h = mid - 1;
					}
					else {
						l = mid + 1;
					}
				}
				
				
			}
			
			if(!k) {
				System.out.println("element is not found");
				
				
			} */
		 int a[] = { 2, 3, 4, 5, 8, 9, 10, 22, 33 };
	        int low = 0;
	        int high = a.length;
	        int value = 1;
	        int mid = 0;
	        System.out.println("low: " + low + " high: " + high + " mid: " + mid);
	        boolean k= false;
	        while (low <=high &&!k  ) {
	            mid=(high + low) / 2;
	            if (a[mid] == value) {
	               
	                System.out.println("entered value is found at " + mid + " index position");
	                k = true;

	            } else if (a[mid] < value) {
	                low = mid + 1;

	            } else {
	                high = mid - 1;
	            }
	            mid = (low + high) / 2;
	        }
	        if (!k) {
	            System.out.println("element not found");
	        }
	}
}