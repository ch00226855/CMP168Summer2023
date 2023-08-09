package week4day2;

public class FibonacciWithLoop {

	public static void main(String[] args) {

		int result = fib(60);
		System.out.println(result);
	}
	
	public static int fib(int n) {
		
		int[] ary = new int[n+1]; // an array to store intermediate results.
		
		for (int i = 0; i <= n; i++) {
			if (i == 0) {
				ary[i] = 0;
			} else if (i == 1) {
				ary[i] = 1;
			} else {
				ary[i] = ary[i-1] + ary[i-2];
			}
		}
		
		return ary[n];
	}

}
