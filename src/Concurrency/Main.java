package Concurrency;

public class Main {

	public static void main(String args[]) {
		final Synchronized synchronizedClass = new Synchronized();

		// first thread
		Runnable r = new Runnable() {
			public void run() {
				try {
					synchronizedClass.printNumbers(3);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		new Thread(r, "ONE").start();
		new Thread(r, "TWO").start();
	}
}
