package Sorting;

public class MergeSort {

	public static void main(String[] args) {

		int arr[] = { 5, 4 };
		merge_sort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void merge_sort(int arr[], int start, int end) {

		if (start < end) {
			int mid = (start + end) / 2;
			merge_sort(arr, start, mid);
			merge_sort(arr, mid + 1, end);

			merge(arr, start, mid, end);
		}
	}

	public static void merge(int arr[], int start, int mid, int end) {

		int p = start;
		int q = mid + 1;

		int nArr[] = new int[end - start + 1];
		int k = 0;

		for (int i = start; i <= end; i++) {

			if (p > mid) {
				nArr[k++] = arr[q++];
			} else if (q > end) {

				nArr[k++] = arr[p++];
			} else if (arr[p] < arr[q]) {
				nArr[k++] = arr[p++];
			} else {
				nArr[k++] = arr[q++];
			}
		}

		for (int i = 0; i < k; i++) {
			arr[i] = nArr[i];
		}
	}
}
