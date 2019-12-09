package code;

public class findSecondMax {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 10, 11, -10 };
		int secondMax = secondMax(arr);
		System.out.println(secondMax);
	}

	private static int secondMax(int[] arr) {

		int max1 = arr[0];
		int max2 = Integer.MIN_VALUE;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max1) {
				max2 = max1;
				max1 = arr[i];
			}
		}
		return max2;
	}
}
