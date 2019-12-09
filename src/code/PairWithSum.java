package code;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

//Given an unsorted array of integers, find a pair with given sum in it.

public class PairWithSum {

	public static void main(String[] args) {
		int arr[] = { 8, 7, 2, 5, 3, 1 };
		int sum = 10;

		findPairByUsingMap(arr, sum);
	}

	private static void findPair(int[] arr, int sum) { // O(n^2)

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == sum) {
					System.out.println(
							MessageFormat.format("Pair found at index {0} and {1} ({2} + {3})", i, j, arr[i], arr[j]));
				}
			}
		}
	}

	private static void findPairByUsingMap(int[] arr, int sum) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {

			if (map.containsKey(sum - arr[i])) {
				System.out.println(MessageFormat.format("Pair found at index {0} and {1}", map.get(sum - arr[i]), i));
			}
			map.put(arr[i], i);
		}
	}
}
