package codechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Medel {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());

		while (testCases-- != 0) {
			int size = Integer.parseInt(br.readLine());
			String strArr[] = br.readLine().split(" ");
			int arr[] = new int[size];
			for (int i = 0; i < size; i++) {
				arr[i] = Integer.parseInt(strArr[i]);
			}

			removeMedians(arr);
		}

	}

	public static void removeMedians(int[] arr) {

		int max = arr[0];
		int min = arr[1];
		int min_index = 0, max_index = 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
				min_index = i;
			}
			if (arr[i] > max) {
				max = arr[i];
				max_index = i;
			}
		}

		System.out.println(max_index > min_index ? min + " " + max : max + " " + min);

	}
}
