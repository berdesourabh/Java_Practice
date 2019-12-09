package Collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapPractice {

	public static void main(String[] args) {

		Map<String, Integer> map = new LinkedHashMap<String, Integer>();

		map.put(null, 1);
		System.out.println(map.put("A", 2));
		System.out.println(map.put("B", 3));
		System.out.println(map.put("C", 3));
		System.out.println(map.put("D", 3));
		System.out.println(map.put("E", 3));
		System.out.println(map.put("F", 3));
		System.out.println(map.put("G", 3));
		System.out.println(map.put("H", 3));
		System.out.println(map.put("I", 3));
		System.out.println(map.put("J", 3));
		System.out.println(map.put("K", 3));
		System.out.println(map.put("L", 3));
		System.out.println(map.put("M", 3));
		System.out.println(map.put("N", 3));
		System.out.println(map.put("O", 3));
		System.out.println(map.put("P", 3));
		System.out.println(map.put("Q", 3));
		System.out.println(map.put("R", 3));
		System.out.println(map.put("S", 3));
	}

}
