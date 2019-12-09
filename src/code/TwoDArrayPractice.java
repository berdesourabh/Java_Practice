package code;

import java.util.Scanner;

public class TwoDArrayPractice {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int matrix[][] = new int[3][3];
		// Read in:
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrix[i][j] = in.nextInt();
			}
		}

		sumArray(matrix);
	}

	private static void sumArray(int[][] a) {

		int sum = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println(a[i][j]);
			}
		}
	}
}

/*
1 2 3
0 1 3
2 3 5

*/