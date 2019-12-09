package code;

import java.util.Arrays;

/*
 * 
 * Input1 = {1,4,7,8,10}
 * Input2 = {2,3,9}
 * 
 * Output1 = {1,2,3,4,7}
 * Output2 = {8,9,10}
 */
public class InPlaceOrdering {

	public static void main(String[] args) {
		int arr1[] = { 1, 4, 7, 8, 10 };
		int arr2[] = { 2, 3, 9 };
		sortArrays(arr1, arr2);
		merge(arr1, arr2);
		System.out.println("X: " + Arrays.toString(arr1));
		System.out.println("Y: " + Arrays.toString(arr2));

	}

	private static void sortArrays(int[] arr1, int[] arr2) {

		int i = 0, j = 0;
		int smallest = arr1.length > arr2.length ? arr2.length : arr1.length;
		while (j < smallest) {
			if (arr1[i] > arr2[j]) {
				int tmp = arr1[i];
				arr1[i] = arr2[j];
				arr2[j] = tmp;
				i++;
			} else {
				int tmp = arr1[j];
				arr1[j] = arr2[i];
				arr2[i] = tmp;
				j++;
			}
		}

		for (int k = 0; k < arr1.length; k++) {
			System.out.print(arr1[k] + " ");
		}
		System.out.println("\n");
		for (int k = 0; k < arr2.length; k++) {
			System.out.print(arr2[k] + " ");
		}
	}

	public static void merge(int[] X, int[] Y) {
		int m = X.length;
		int n = Y.length;

		// consider each element X[i] of array X and ignore the element
		// if it is already in correct order else swap it with next smaller
		// element which happens to be first element of Y
		for (int i = 0; i < m; i++) {
			// compare current element of X[] with first element of Y[]
			if (X[i] > Y[0]) {
				// swap (X[i], Y[0])
				int temp = X[i];
				X[i] = Y[0];
				Y[0] = temp;

				int first = Y[0];

				// move Y[0] to its correct position to maintain sorted
				// order of Y[]. Note: Y[1..n-1] is already sorted
				int k;
				for (k = 1; k < n && Y[k] < first; k++) {
					Y[k - 1] = Y[k];
				}

				Y[k - 1] = first;
			}
		}
	}

}
