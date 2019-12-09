package code;

//Given n non-negative integers representing the histogram's bar height where the width of each bar is 1,
//find the area of largest rectangle in the histogram.

//Input: [2,1,5,6,2,3]
//Output: 10

public class Histogram {

	public static void main(String[] args) {
		// int arr[] = { 2, 1, 5, 6, 2, 3 };

		int arr[] = { 2, 1, 5, 6, 4, 4, 3, 2 };

		largestArea(arr);
	}

	static void largestArea(int[] arr) {

		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			
		}
	}
}

/*
 * int maxMulti = 0; int width = 1; int area = 0;
 * 
 * for (int i = 0; i < arr.length - 1; i++) { if (arr[i] * arr[i + 1] >=
 * maxMulti) {
 * 
 * maxMulti = arr[i] * arr[i + 1]; area = (arr[i] + arr[i]) * width; } }
 */