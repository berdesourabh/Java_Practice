package code;


public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		int arr1[] = { 1, 4, 7, 8, 10 };
		int arr2[] = { 2, 3, 9 };
		sortArrays(arr1, arr2);

	}

	public static int[] sortArrays(int[] arr1, int[] arr2) {
		int n1 = arr1.length;
		int n2 = arr2.length;
		int arr3[] = new int[n1 + n2];

		int i = 0, j = 0, k = 0;
		while (i < n1 && j < n2) {
			if (arr1[i] < arr2[j])
				arr3[k++] = arr1[i++];
			else
				arr3[k++] = arr2[j++];
		}
		while (i < n1)
			arr3[k++] = arr1[i++];

		// Store remaining elements of second array
		while (j < n2)
			arr3[k++] = arr2[j++];
		return arr3;
	}
}