package Ds;


import java.lang.reflect.Array;
import java.util.Arrays;

public class Sorting {
//public static void main (String[]args) {
	
	
//	int arr[]= {34,26,65,12};
//	System.out.println("before sorting of arry:");
//	for(int i=0;i<arr.length;i++) {
//		System.out.print(arr[i]+ " ");
//		//for(int j=i+1;j<=arr.length;j++) {
//			//System.out.println(j);
	
// Java Program to sort an elements
	// by bringing Arrays into play

	// Main class
	

		// Main driver method
		public static void main(String[] args)
		{

			// Custom input array
			int arr[] = { 4, 3, 2, 1 };
			Arrays.sort(arr);
			Array.getLength(arr);
		    System.out.println("by method:"+Arrays.toString(arr));

		/*	// Outer loop
			for (int i = 0; i < arr.length; i++) {

				// Inner nested loop pointing 1 index ahead
				for (int j = i + 1; j < arr.length; j++) {

					// Checking elements
					int temp = 0;
					if (arr[j] < arr[i]) {

						// Swapping
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}

				// Printing sorted array elements
				System.out.println(arr[i] + " ");    */
			}
			
	}


