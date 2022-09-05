package Ds;

import java.util.Arrays;

public class Bubble_sort {
	public static void main(String[]args ) {
		int arr[]= {34,56,13,8,47};
		System.out.println("before sorting:"+Arrays.toString(arr));
		for (int i=0 ;i<arr.length;i++){
			
			for (int j=i+1;j<arr.length;j++) {
				int temp =0;
				if (arr[j]<arr[i]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
					
				}
			}
			System.out.print(arr[i]+" ");
		}

	
	}
}
