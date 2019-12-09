package Concurrency;

public class DeadLockExample {

	public static void main(String[] args) throws InterruptedException {
		final DeadLockDemo deadlockDemo = new DeadLockDemo();

		Thread t1 = new Thread(() -> {
			try {
				deadlockDemo.methodOne();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		Thread t2 = new Thread(() -> {
			try {
				deadlockDemo.methodTwo();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();
	}

}

class DeadLockDemo {

	private Object key1 = new Object();
	private Object key2 = new Object();

	public void methodOne() throws InterruptedException {
		synchronized (key1) {
			System.out.println("In methodOne " + Thread.currentThread().getName());
			methodTwo();
		}
	}

	public void methodTwo() throws InterruptedException {
		synchronized (key2) {
			System.out.println("In methodTwo " + Thread.currentThread().getName());
			methodOne();
		}
	}

	private void methodThree() {
		synchronized (key1) {
			System.out.println("In methodThree " + Thread.currentThread().getName());
		}
	}
}