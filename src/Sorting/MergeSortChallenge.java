package Sorting;

public class MergeSortChallenge {

	public static void main(String[] args) {

		int arr[] = { 1, 4, 3, 2, 5 };
		int pair_count = 0;
		System.out.println(pair_count);
	}

	public static int merge(int[] arr, int start, int mid, int end, int pair_count) {

		for (int i = start; i < end; i++) {

			if (start == end - 1) {
				if (arr[start] < arr[end]) {
					pair_count++;
				}
			}
		}
		return pair_count;

	}
}