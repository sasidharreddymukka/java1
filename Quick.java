package sasidhar_1;
import java.util.Arrays;
import java.util.Scanner;

public class Quick {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter size of an array :");
	        int n = sc.nextInt();
	       
	        int arr[] = new int[n];
	        System.out.println("Enter Elements :");
	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = sc.nextInt();
	        }
	        System.out.println("Befor Sorting....!");

	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println("\nAfter Sorting....!");
	        sort(arr, 0, arr.length - 1);
	        System.out.println(Arrays.toString(arr));
	    }

	    public static void sort(int arr[], int low, int high) {
	        if (low >= high) {
	            return;
	        }
	        int small = low;
	        int end = high;
	        int mid = (small + end) / 2;
	        int pivot = arr[mid];
	        while (small <= end) {
	            while (arr[small] < pivot) {
	                small++;
	            }
	            while (arr[end] > pivot) {
	                end--;
	            }
	            if (small <= end) {
	                int temp = arr[small];
	                arr[small] = arr[end];
	                arr[end] = temp;
	                small++;
	                end--;
	            }
	        }
	        sort(arr, low, end);
	        sort(arr, small, high);
	    }

	}


