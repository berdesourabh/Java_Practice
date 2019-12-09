package ExceptionHandling;

public class tryCatchFInally {

	public static void main(String[] args) {

		System.out.println(divide(10));
	}

	private static int divide(int a) {
		try {
			return a / 0;
		} catch (Exception ex) {
			return ++a;

		} finally {
			System.out.println(a++);
		}
	}
}
