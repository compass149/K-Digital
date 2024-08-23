package ch04Ex;


public class ArrayUtil {
	public static int[] concat(int[] a, int[] b) {
		int arr[] = new int[(a.length + b.length)];

		for (int i = 0; i < a.length; i++) {
			arr[i] = a[i];
		}
		for (int j = 0; j < b.length; j++) {
			arr[a.length + j] = b[j];
		}
		return arr;

	}

	public static void print(int[] a) {
		System.out.print("[");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("]");

	}

}
