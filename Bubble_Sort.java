package new_assigment;

import java.util.Arrays;

public class Bubble_Sort {
	public static void main(String[] args) {
		int[] arr = { 43, 15, 76, 34, 75, 31 };
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if (arr[i]>arr[j]) {   // time compelxity o(n^2)
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
	}
}
