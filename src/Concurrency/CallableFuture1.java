package Concurrency;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFuture1 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService service = Executors.newFixedThreadPool(3);

		Future<Integer> future = service.submit(new Task());

		System.out.println("This is main");
		System.out.println(future.get());

		
	}

	static class Task implements Callable<Integer> {

		@Override
		public Integer call() throws Exception {
			Thread.sleep(3000);
			return new Random().nextInt();
		}
	}
}
