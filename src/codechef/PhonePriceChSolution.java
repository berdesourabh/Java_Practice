package codechef;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhonePriceChSolution {

	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {
			int n = sc.nextInt();
			List<Integer> lst1 = new ArrayList<>();
			List<Integer> lst2 = new ArrayList<>();
			for (int i = 0; i < n; i++)
				lst1.add(sc.nextInt());
			lst2.add(lst1.get(0));
			int count = 1, element, i, j, flag = 0;
			for (j = 1; j < n; j++) {
				element = lst1.get(j);
				for (i = 0; i < lst2.size(); i++) {
					if (element >= lst2.get(i)) {
						flag = 1;
						break;
					} else
						flag = 0;
				}
				if (flag == 0)
					count++;
				if (lst2.size() < 5)
					lst2.add(lst1.get(j));
				else {
					lst2.remove(0);
					lst2.add(lst1.get(j));
				}
			}
			System.out.println(count);
		}
	}
}