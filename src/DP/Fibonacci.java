package DP;

public class Fibonacci {

	public static void main(String[] args) {

		//System.out.println(calculate(8));
		int count = 1;
		//System.out.println("Fib:"+fib(5, count));
		System.out.println(fibDp(8));
	}

	/*
	 * public static int calculate(int num) {
	 * 
	 * if (num <= 1) { return num; } int fib = calculate(num - 1) + calculate(num -
	 * 2); return fib; }
	 */

	static int fib(int n, int count) {
		System.out.println(n);
		if (n <= 1)
			return n;
		return fib(n - 1, count) + fib(n - 2, count);
	}
	
	 static int fibDp(int n) 
	    { 
	    /* Declare an array to store Fibonacci numbers. */
	    int f[] = new int[n+2]; // 1 extra to handle case, n = 0 
	    int i; 
	       
	    /* 0th and 1st number of the series are 0 and 1*/
	    f[0] = 0; 
	    f[1] = 1; 
	      
	    for (i = 2; i <= n; i++) 
	    { 
	       /* Add the previous 2 numbers in the series 
	         and store it */
	        f[i] = f[i-1] + f[i-2]; 
	    } 
	       
	    return f[n]; 
	    } 
	       
	    

}
