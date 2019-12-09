package codechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MedelReferredSolution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t != 0) {
			int n = Integer.parseInt(br.readLine());
			String value[] = br.readLine().split(" ");
			List<Integer> l = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
				l.add(Integer.parseInt(value[i]));
			}
			while (l.size() >= 3) {
//				System.out.println(l);
//				System.out.println(getMedian(l));
				l.remove(l.indexOf(getMedian(l)));
			}
//			System.out.println(l);
			for (int elem : l) {
				System.out.print(elem + " ");
			}
			System.out.println();
			t--;
		}
	}

	public static int getMedian(List<Integer> m) {
		int median = 0;
		List<Integer> three = new ArrayList<Integer>();
		for (int i = 0; i < 3; i++) {
			three.add(m.get(i));
		}
		Collections.sort(three);
		return three.get(1);
	}
}
