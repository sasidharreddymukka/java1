package Ds;

public class JumpSearch {
	public static void main(String[] args) {
		int arr[] = { 11, 12, 13, 14, 15 };
		int low = 0;
		int high = arr.length;
		int s = (int) Math.sqrt(high);
		boolean d = false;
		int key = 15;
		while (low <= high && !d) {

			if (arr[s] == key) {
				System.out.println("index of key is:" + s);
				d = true;
				break;

			} else if (arr[s] < key) {
				low = s;
				s = s + s;

			} else if (arr[s] > key)
				high = s;

		}

		for (int i = low; i < high; i++) {
			if (arr[i] == key) {
				System.out.println(i);
				d = true;
				break;
			}
		}
	}
	// if(!d) {
	// System.out.println("the value is not found");
	// }
}
