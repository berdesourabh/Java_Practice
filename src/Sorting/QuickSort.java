package Sorting;

import java.util.Arrays;

public class QuickSort {

	private static int partition(int arr[], int begin, int end) {
		int pivot = arr[end];
		int i = (begin - 1);

		for (int j = begin; j < end; j++) {
			if (arr[j] <= pivot) {
				i++;

				int swapTemp = arr[i];
				arr[i] = arr[j];
				arr[j] = swapTemp;
			}
		}

		int swapTemp = arr[i + 1];
		arr[i + 1] = arr[end];
		arr[end] = swapTemp;

		return i + 1;
	}

	public static void quickSort(int arr[], int begin, int end) {
		if (begin < end) {
			int partitionIndex = partition(arr, begin, end);

			quickSort(arr, begin, partitionIndex - 1);
			quickSort(arr, partitionIndex + 1, end);
		}
	}

	// Sort an array containing 0’s, 1’s and 2’s
	public static void main(String[] args) {
		int A[] = { 5, 4, 3, 2, 1 };

		partition(A, 0, A.length - 1);
		System.out.println(Arrays.toString(A));
	}
}
