package Collection;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<Integer> vec = new Vector<Integer>();

		for (int i = 0; i < 10; i++) {
			vec.add(i);
		}

		vec.addElement(1);

		vec.stream().forEach(System.out::println);
	}
}
