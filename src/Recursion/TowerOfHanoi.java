package Recursion;

public class TowerOfHanoi {

	public static void main(String[] args) {

		int a[] = { 3, 2, 1 };
		Rod rod1 = new Rod(a);
		Rod rod2 = new Rod();
		Rod rod3 = new Rod();
		
		
	}

}

class Rod {
	private static final int MAX = 10;
	int top = 0;
	int arr[] = new int[MAX];

	public Rod() {
	}

	public Rod(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			push(arr[i]);
		}
	}

	public void push(int n) {
		if (!isFull()) {
			arr[top++] = n;
		} else {
			System.out.println("Stack is full");
		}
	}

	public int pop() {
		if (!isEmpty()) {
			return arr[--top];
		}
		System.out.println("Stack is empty");
		return 0;

	}

	public boolean isFull() {
		if (top == MAX) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isEmpty() {

		if (top == 0) {
			return true;
		} else {
			return false;
		}
	}
}
