package Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.stream.IntStream;

public class SemaphoreDemo {

	public static void main(String[] args) {
		Semaphore semaphore = new Semaphore(3);

		ExecutorService service = Executors.newFixedThreadPool(50);
		IntStream.of(100).forEach(i -> service.execute(new Task(semaphore)));

	}
}

class Task implements Runnable {

	private Semaphore semaphore;

	public Task(Semaphore semaphore) {
		this.semaphore = semaphore;
	}

	@Override
	public void run() {
		semaphore.acquireUninterruptibly();

		System.out.println("this is task by " + Thread.currentThread().getName());

		semaphore.release();

	}
}
