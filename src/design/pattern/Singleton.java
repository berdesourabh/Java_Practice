package design.pattern;

class SingletonDemo {

	private static SingletonDemo instance;

	private SingletonDemo() {
		if (instance != null) {
			throw new RuntimeException("Use getInstance method to get single instance of this class");
		}
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	public static SingletonDemo getInstance() {
		if (instance == null) {
			synchronized (SingletonDemo.class) {
				instance = new SingletonDemo();
			}
		}
		return instance;
	}

	public SingletonDemo readResolve() {
		return getInstance();
	}

}

public class Singleton {

	public static void main(String[] args) throws CloneNotSupportedException {

		new Thread(() -> {
			SingletonDemo s3 = SingletonDemo.getInstance();
			System.out.println(s3.hashCode());
		}).start();

		new Thread(() -> {
			SingletonDemo s4 = SingletonDemo.getInstance();
			System.out.println(s4.hashCode());
		}).start();
	}
}
