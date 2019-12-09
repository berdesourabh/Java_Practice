package design.pattern;

import java.util.HashSet;
import java.util.Set;

public class ObserverDP {

	public static void main(String[] args) {
		Publisher pub = new PublisherImpl();
		Subscriber sub2 = new Subscriber2();
		pub.attach(new Subscriber1());
		pub.attach(sub2);

		pub.notifySubs();

		pub.dettach(sub2);
		pub.notifySubs();
	}

}

interface Publisher {

	void attach(Subscriber s);

	void dettach(Subscriber s);

	void notifySubs();
}

class PublisherImpl implements Publisher {

	private Set<Subscriber> subs = new HashSet<>();

	@Override
	public void attach(Subscriber s) {
		subs.add(s);
	}

	@Override
	public void dettach(Subscriber s) {
		subs.remove(s);
	}

	@Override
	public void notifySubs() {
		subs.forEach(sub -> {
			sub.update();
		});
	}

}

interface Subscriber {

	void update();
}

class Subscriber1 implements Subscriber {

	@Override
	public void update() {
		System.out.println("Subscriber1 has been updated");
	}

}

class Subscriber2 implements Subscriber {

	@Override
	public void update() {
		System.out.println("Subscriber2 has been updated");
	}

}