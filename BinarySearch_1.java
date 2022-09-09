package Ds;

public class BinarySearch_1 {

	public static void main(String[] args) {
		int arr[] = { 21, 31, 41, 51, 61 };
		int n = 1;
		int l = 0;
		int h = 4;
		int mid = 0;
		bSearch(n, mid, l, h, arr);
	}

	public static int bSearch(int n, int mid, int l, int h, int arr[]) {
		mid = (l + h) / 2;
		if (!(l <= h)) {
			System.out.println("not exists");
			return 0;
		}
		if (arr[mid] == n) {
			System.out.println("exists " + mid);
			return 1;
			

		} else {
			if (arr[mid] > n) {

				h = mid - 1;
			} else {
				l = mid + 1;
			}

		}
		return bSearch(n, mid, l, h, arr);
	}
}
