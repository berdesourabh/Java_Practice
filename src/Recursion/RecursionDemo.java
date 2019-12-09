package Recursion;

public class RecursionDemo {

	public static void main(String[] args) {
		System.out.println(factorial(3, 1));
	}

	public static int factorial(int n, int count) {
		if (n == 0) {
			return 1;
		}
		System.out.println(n);
		return n * factorial(n - 1, count++);
	}
}
