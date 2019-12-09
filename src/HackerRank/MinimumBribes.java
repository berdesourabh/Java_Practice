package HackerRank;

public class MinimumBribes {

	static void minimumBribes(int[] q) {
		int bribes = 0;
		boolean isCheotic = false;
		for (int i = 0; i < q.length; i++) {

			if (q[i] != i + 1) {
				int temp = q[i] - (i + 1);
				if (temp > 0) {
					if (temp > 2)
						break;
					bribes += temp;
				}
			}
		}
		System.out.println(isCheotic ? "Too chaotic" : bribes);

	}

	public static void main(String[] args) {
		// int[] a = { 2, 1, 5, 3, 4 };
		int[] a = { 1, 2, 5, 3, 7, 8, 6, 4 };

		minimumBribes(a);
	}
}
