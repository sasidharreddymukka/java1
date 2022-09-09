package Ds;

public class LinearSearchRecursion {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 10, 40 };
		int x = 1;
		int result = search(arr, x, 0);
		if (result == -1)
			System.out.print("Element is not present in array");
		else
			System.out.print("Element is present" + " at index " + result);

	}

	private static int search(int[] arr, int searchValue, int index) {
		if (arr.length > index) {

			if (arr[index] == searchValue) {
				return index;
			}
			return search(arr, searchValue, index + 1);
		}else {
			return -1;
		}
	}

}
