package code;

import java.util.HashSet;
import java.util.Set;

public class ArrayWIthSumZero {

	public static void main(String[] args) {
		int arr[] = { 4, -6, 3, -1, 4, 2, 7 };
		System.out.println(isZeroSumExist(arr));

		System.out.println(findDuplicate(arr));
	}

	private static boolean isZeroSumExist(int[] arr) {

		Set<Integer> set = new HashSet<Integer>();
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			System.out.println(sum * -1);
			if (set.contains(sum * -1)) {
				return true;
			}
			set.add(arr[i]);
		}
		return false;
	}

	public static int findDuplicate(int[] A) {
		int xor = 0;

		// take xor of all array elements
		for (int i = 0; i < A.length; i++) {
			xor ^= A[i];
		}

		// take xor of numbers from 1 to n-1
		for (int i = 1; i <= A.length - 1; i++) {
			xor ^= i;
		}

		// same elements will cancel out each other as a ^ a = 0,
		// 0 ^ 0 = 0 and a ^ 0 = a

		// xor will contain the missing number
		return xor;
	}

}
