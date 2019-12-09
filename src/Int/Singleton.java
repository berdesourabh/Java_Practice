package Int;

public class Singleton {

	private static Singleton sSoleInstance;

	// private constructor.
	private Singleton() {

		// Prevent form the reflection api.
		if (sSoleInstance != null) {
			throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
		}
	}

	public synchronized static Singleton getInstance() {
		if (sSoleInstance == null) { // if there is no instance available... create new one
			sSoleInstance = new Singleton();
		}

		return sSoleInstance;
	}
}
