package codechef;

import java.util.Scanner;

public class PhonePriceChallenge {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// int testCases = scan.nextInt();
		// int numDays = scan.nextInt();
		int prices[] = { 375, 750, 723, 662, 647, 656, 619 };
		// new int[numDays];
//		for (int i = 0; i < numDays; i++) {
//			prices[i] = scan.nextInt();
//		}

		int lowPriceDays = lowPriceDays(prices);
		System.out.println(lowPriceDays);
	}

	// 375 750 723 662 647 656 619

	public static int lowPriceDays(int[] prices) {
		int lowPriceConsiderCount = 1;
		int lowestInFiveDays = prices[0];
		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < lowestInFiveDays) {
				lowestInFiveDays = prices[i];
				lowPriceConsiderCount++;
			}

			if (!(i - 5 < 0)) {
//				int subArr[] = 
			}
		}
		return lowPriceConsiderCount;
	}
}
