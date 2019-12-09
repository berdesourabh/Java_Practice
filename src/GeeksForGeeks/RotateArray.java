package GeeksForGeeks;

public class RotateArray {

	public static void main(String[] args) {
//		int[] arr = { 1, 2, 3, 4, 5 }; // 3 4 5 1 2

		int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, }; //8 10 12 14 16 18 20 2 4 6

		int rotateBy = 3; 

		rotate(arr, rotateBy);
	}

	public static void rotate(int[] arr, int rotateBy) {

		int newArr[] = new int[arr.length];
		int rotated = arr.length - rotateBy;
		int j = 0;
		for (int i = rotateBy; i < newArr.length; i++) {
			newArr[j] = arr[i];
			if (j + rotated < arr.length) {
				newArr[j + rotated] = arr[j];
			}
			j++;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(newArr[i] + " ");
		}
	}
}
