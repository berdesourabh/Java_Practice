package Concurrency;

import java.util.ArrayList;
import java.util.List;

public class ProdCunsume {

	public static void main(String[] args) {
		List<Integer> taskList = new ArrayList<Integer>();
		int size = 5;

		Thread t1 = new Thread(new ProducerClass(taskList, size));
		Thread t2 = new Thread(new ConsumerClass(taskList));
		t1.start();
		t2.start();
	}
}

class ProducerClass implements Runnable {
	List<Integer> taskList;
	int size;

	ProducerClass(List<Integer> list, int size) {
		this.taskList = list;
		this.size = size;
	}

	int count = 0;

	@Override
	public void run() {
		while (true) {
			try {
				produce(count++);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void produce(int i) throws InterruptedException {
		synchronized (taskList) {
			while (taskList.size() == size) {
				System.out.println("taskList is full");
				taskList.wait();
			}
			Thread.sleep(500);
			taskList.add(i);
			System.out.println("Produced:" + i);
			taskList.notify();
		}
	}
}

class ConsumerClass implements Runnable {
	List<Integer> taskList;

	public ConsumerClass(List<Integer> list) {
		this.taskList = list;
	}

	@Override
	public void run() {
		while (true) {
			try {
				consume();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void consume() throws InterruptedException {

		synchronized (taskList) {
			while (taskList.isEmpty()) {
				System.out.println("taskList is empty");
				taskList.wait();
			}
			Thread.sleep(500);
			System.out.println("Consumed: " + taskList.remove(0));
			taskList.notify();
		}
	}
}
