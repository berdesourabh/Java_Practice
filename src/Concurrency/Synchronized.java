package Concurrency;

public class Synchronized {

	void printNumbers(int n) throws InterruptedException {
		synchronized (this) {
			for (int i = 1; i <= n; i++) {
				System.out.println(Thread.currentThread().getName() + " :: " + i);
				this.wait(2000);
			}
		}
	}
}
