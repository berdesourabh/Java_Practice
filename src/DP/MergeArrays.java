package DP;

import java.util.ArrayList;
import java.util.List;

public class MergeArrays {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(3);
		list.add(5);
		list.add(2);
		list.add(4);
		list.add(1);
		list.add(2);

		mergeArrays(list);
	}

	public static void mergeArrays(List<Integer> list) {

		for (int i = 1; i < list.size() - 1; i++) {
			if (list.get(i) < list.get(i - 1) && list.get(i) < list.get(i + 1)) {
				list.remove(i);
				i = 1;
			}

		}

		list.forEach(l -> System.out.println(l));
	}
}
