package Collection;

public class ArraysDemo {
	static final Integer[] arr = new Integer[10];

	public static void main(String[] args) {

		ArraysDemo a = new ArraysDemo();
		a.method(arr);
	}

	public void method(Integer[] arr) {

		arr[0] = 10;
		arr[1] = 11;

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
