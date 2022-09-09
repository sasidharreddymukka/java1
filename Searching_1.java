package Ds;

public class Searching_1 {
	public static void main(String[] args) {
		int value = 6;
		int arr[] = { 1, 2, 3, 4, 5 };
		boolean iselementfound=false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				System.out.println("value is there in index" + i);
				iselementfound = true;
			} 
		}
		if(!iselementfound) {
			System.out.println("Element not found in the array");
		}
	}

}   
