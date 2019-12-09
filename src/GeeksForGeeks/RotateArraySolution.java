package GeeksForGeeks;

public class RotateArraySolution {

	void leftRotate(int arr[], int d, int n) {
		for (int i = 0; i < d; i++)
			leftRotatebyOne(arr, n);
	}

	void leftRotatebyOne(int arr[], int n) {
		int i, temp;
		temp = arr[0];
		for (i = 0; i < n - 1; i++)
			arr[i] = arr[i + 1];
		arr[i] = temp;
	}

	/* utility function to print an array */
	void printArray(int arr[], int n) {
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

	// Driver program to test above functions
	public static void main(String[] args) {
		RotateArraySolution rotate = new RotateArraySolution();
		int arr[] = { 1, 2, 3, 4, 5 };
		rotate.leftRotate(arr, 2, 5);
		rotate.printArray(arr, 5);
	}
}
