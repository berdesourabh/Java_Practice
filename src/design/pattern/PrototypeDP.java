package design.pattern;

import java.util.HashSet;
import java.util.Set;

public class PrototypeDP {

}

//Used when we need to have instance of a class multiple times. Creating new instance each time is costly. 
//So we use prototype dp and clone the existing instance.
class PrototypeFactory {

	private static Set<PrototypeCapable> set = new HashSet<>();
	static {
		set.add(new PrototypeClassA(10));
		set.add(new PrototypeClassB(20));
	}

	public static void getInstance() throws CloneNotSupportedException {
		set.stream().forEach(c -> {
			try {
				c.clone().toString();
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	}
}

interface PrototypeCapable extends Cloneable {

	PrototypeCapable clone() throws CloneNotSupportedException;
}

class PrototypeClassA implements PrototypeCapable {

	int data;

	public PrototypeClassA(int data) {
		this.data = data;
	}

	@Override
	public PrototypeClassA clone() throws CloneNotSupportedException {
		return (PrototypeClassA) super.clone();
	}
}

class PrototypeClassB implements PrototypeCapable {

	int data;

	public PrototypeClassB(int data) {
		this.data = data;
	}

	@Override
	public PrototypeClassB clone() throws CloneNotSupportedException {
		return (PrototypeClassB) super.clone();
	}
}